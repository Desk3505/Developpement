package com.example.projetfinal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "AerochessDB.db";
    private static final String PLAYER_TABLE_NAME = "Player";
    private static final String PLANE_TABLE_NAME = "Plane";
    private static final String BOARD_TABLE_NAME = "Board";
    private static final String SQUARE_TABLE_NAME = "Square";
    private static final String PLAYER_COLUMN_ID = "player_id";
    private static final String PLAYER_COLUMN_NAME = "name";
    private static final String PLAYER_COLUMN_SCORE = "score";
    private static final String PLAYER_COLUMN_COLOR = "color_id";
    private static final String PLANE_COLUMN_COLOR = "color_id";
    private static final String PLANE_COLUMN_SQUARE = "square_id";
    private static final String BOARD_COLUMN_ID = "board_id";
    private static final String BOARD_COLUMN_PLAYER_ID = "player_id";
    private static final String BOARD_COLUMN_SQUARE_ID = "square_id";
    private static final String SQUARE_COLUMN_ID = "square_id";
    private static final String SQUARE_COLUMN_COLOR = "color";
    private static final String SQUARE_COLUMN_OCCUPATION = "occupation";

    /**
     * @param context
     */
    public DataBase(Context context) {

        super(context, DATABASE_NAME, null, 1);
        context.deleteDatabase(DATABASE_NAME); // renew db when app starts
    }

    /**
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table Player " +
                        "(player_id integer primary key , name text, score integer)"
        );
        db.execSQL(
                "create table Plane " +
                        "(color_id String primary key)"
        );
        db.execSQL(
                "create table Square " +
                        "(square_id integer primary key, color String NOT NULL, occupation bool)"
        );
        db.execSQL(
                "create table Board " +
                        "(board_id integer primary key)"
        );

    }

    /**
     * @param db
     * @param i
     * @param i1
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Player");
        db.execSQL("DROP TABLE IF EXISTS Plane");
        db.execSQL("DROP TABLE IF EXISTS Square");
        db.execSQL("DROP TABLE IF EXISTS Board");
        onCreate(db);
    }

    /**
     * @param name
     * @param player_id
     * @param score
     * @return
     */
    public boolean insertPlayer(String name, Integer player_id, Integer score) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("player_id", player_id);
        contentValues.put("name", name);
        contentValues.put("score", score);
        db.insert("Player", null, contentValues);
        return true;
    }

    /**
     * @param color_id
     * @return
     */
    private boolean insertPlane(String color_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("color_id", color_id);
        db.insert("Plane", null, contentValues);
        return true;
    }

    /**
     * @param name
     * @param player_id
     * @return
     */
    public boolean updatePlayer(String name, Integer player_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        db.update("Player", contentValues, "player_id = ? ", new String[]{Integer.toString(player_id)});
        return true;
    }

    /**
     * @param square_id
     * @param color
     * @param occupation
     * @return
     */
    private boolean insertSquare(Integer square_id, Integer color, boolean occupation) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("square_id", square_id);
        switch (color) {
            case 1:
                contentValues.put("color", R.color.green);
                break;
            case 2:
                contentValues.put("color", R.color.yellow);
                break;
            case 3:
                contentValues.put("color", R.color.red);
                break;
            case 4:
                contentValues.put("color", R.color.blue);
                break;
        }
        contentValues.put("occupation", occupation);
        db.insert("Square", null, contentValues);
        return true;
    }

    /**
     * @return would create board with squares and plane for appropriate player
     */
    public boolean createBoard() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        for (int i = 0; i < 51; i++) {
            for (int j = 0; j < 3; j++) {
                insertSquare(i, j, false);
            }
        }
        db.insert("Board", null, contentValues);
        return true;
    }

    /**
     * @param id
     * @return
     */
    public Cursor getData(Integer id) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("select * from Player where id=" + id + "", null);
    }

    /**
     * @param player_id
     * @param score
     * @return
     */
    public boolean updateScore(Integer player_id, Integer score) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("score", score);
        db.update("Player", contentValues, "player_id = ? ", new String[]{Integer.toString(player_id)});
        return true;
    }

    /**
     * @param player_id
     * @return
     */
    public Integer deletePlayer(Integer player_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("Player",
                "player_id = ? ",
                new String[]{Integer.toString(player_id)});
    }

    /**
     * @param player_id
     * @return player_id 's score
     */
    public Cursor getScore(Integer player_id) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("select score from Player where player_id=" + player_id + "", null);
    }

    /**
     * @return number of player
     */
    public Integer getPlayer() {
        SQLiteDatabase db = this.getReadableDatabase();
        long temp = DatabaseUtils.queryNumEntries(db, "Player");
        return (int) temp;
    }

}
