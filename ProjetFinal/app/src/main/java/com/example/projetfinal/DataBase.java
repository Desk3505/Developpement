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

    public static final String DATABASE_NAME = "AerochessDB.db";
    public static final String PLAYER_TABLE_NAME = "Player";
    public static final String PLANE_TABLE_NAME = "Plane";
    public static final String BOARD_TABLE_NAME = "Board";
    public static final String SQUARE_TABLE_NAME = "Square";
    public static final String PLAYER_COLUMN_ID = "player_id";
    public static final String PLAYER_COLUMN_NAME = "name";
    public static final String PLAYER_COLUMN_SCORE = "score";
    public static final String PLAYER_COLUMN_COLOR = "color_id";
    public static final String PLANE_COLUMN_COLOR = "color_id";
    public static final String PLANE_COLUMN_SQUARE = "square_id";
    public static final String BOARD_COLUMN_ID = "board_id";
    public static final String BOARD_COLUMN_PLAYER_ID = "player_id";
    public static final String BOARD_COLUMN_SQUARE_ID = "square_id";
    public static final String SQUARE_COLUMN_ID = "square_id";
    public static final String SQUARE_COLUMN_COLOR = "color";
    public static final String SQUARE_COLUMN_OCCUPATION = "occupation";
    private SQLiteDatabase dataBase;

    public DataBase(Context context) {

        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);

        db.execSQL(
                "create table Player " +
                        "(player_id integer primary key , name text, score integer, foreign key (color_id) references " + PLANE_TABLE_NAME + " (color_id))"
        );
        db.execSQL(
                "create table Plane " +
                        "(color_id String primary key, foreign key (square_id) references " + SQUARE_TABLE_NAME + " (square_id))"
        );
        db.execSQL(
                "create table Square " +
                        "(square_id integer primary key, color String NOT NULL, occupation bool)"
        );
        db.execSQL(
                "create table Board " +
                        "(board_id integer primary key, foreign key (player_id) references " + PLAYER_TABLE_NAME + " (player_id), foreign key (square_id) references " + SQUARE_TABLE_NAME + "(square_id))"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Player");
        db.execSQL("DROP TABLE IF EXISTS Plane");
        db.execSQL("DROP TABLE IF EXISTS Square");
        db.execSQL("DROP TABLE IF EXISTS Board");
        onCreate(db);
    }

    public boolean insertPlayer(String name, Integer player_id, Integer score) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("player_id", player_id);
        contentValues.put("name", name);
        contentValues.put("score", score);
        db.insert("Player", null, contentValues);
        return true;
    }

    private boolean insertPlane(String color_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("color_id", color_id);
        db.insert("Plane", null, contentValues);
        return true;
    }

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

    public Cursor getData(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("select * from Player where id=" + id + "", null);
    }

    public boolean updateScore(Integer player_id, Integer score) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("score", score);
        db.update("Player", contentValues, "player_id = ? ", new String[]{Integer.toString(player_id)});
        return true;
    }

    public Integer deletePlayer(Integer player_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("Player",
                "player_id = ? ",
                new String[]{Integer.toString(player_id)});
    }

    public Cursor getScore(Integer player_id) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("select score from Player where player_id=" + player_id + "", null);
    }

    public Integer getPlayer() {
        SQLiteDatabase db = this.getReadableDatabase();
        long temp = DatabaseUtils.queryNumEntries(db, "Player");
        int i = (int) temp;
        return i;
    }


    /*public SQLiteDatabase openDataBase(DataBase db) {
        if(db.isOpen())
        {
            dataBase.execSQL("PRAGMA foreign_keys=ON;");
            return dataBase;
        }
        dataBase = db.getWritableDatabase();
        dataBase.execSQL("PRAGMA foreign_keys=ON;");
        return dataBase; }*/
}
