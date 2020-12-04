package com.example.projetfinal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private Game game;
    private MyImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //setContentView(new MyView(R.layout.activity_game));
        //DrawingView dv = new DrawingView(this);

        game = new Game(4);
        iv = new MyImageView(this);
    }

    public void send(View view) {
        int temp;

        Random rand = new Random();
        temp = rand.nextInt(6)+1;
        TextView tv1 = findViewById(R.id.textView2);
        String s;
        s = Integer.toString(temp);
        tv1.setText(s);
        game.setDe(temp);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

        if(event.getAction() == MotionEvent.ACTION_DOWN){
            String text = "You click at x = " + event.getX() + " and y = " + event.getY();
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            //game.setTouchX(event.getX());
          //  game.setTouchY(event.getY());
            iv.drawC = true;
        }
        iv.invalidate();
        iv.postInvalidate();
        return super.onTouchEvent(event);
    }

}
