package com.example.projetfinal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //setContentView(new MyView(R.layout.activity_game));

        game = new Game(4);
    }

    public void send(View view) {
        int temp;

        Random rand = new Random();
        temp = rand.nextInt(6)+1;
        TextView tv1 = (TextView)findViewById(R.id.textView2);
        String s = null;
        s = Integer.toString(temp);
        tv1.setText(s);
        game.setDe(temp);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            String text = "You click at x = " + event.getX() + " and y = " + event.getY();
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            game.setTouchX(event.getX());
            game.setTouchY(event.getY());
        }
        return super.onTouchEvent(event);
    }

    public class MyView extends View{
        Paint paint = null;

        public MyView(Context context) {
            super(context);
            paint = new Paint();
        }

        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            float x = game.getTouchX();
            float y = game.getTouchY();
            int rad = 20;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.parseColor("#FF03DAC5"));
            canvas.drawPaint(paint);
            canvas.drawCircle(x,y,rad,paint);
            ImageView iv = (ImageView)findViewById(R.id.imageView);
            iv.draw(canvas);
        }
    }

    /*
    public void imgClick(View view, MotionEvent mv) {
        float x = mv.getX();
        float y = mv.getY();

        String sLog = Float.toString(x) + "," + Float.toString(y);

        Log.d("CREATION", sLog);

        ImageView iv = (ImageView)findViewById(R.id.imageView);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FF03DAC5"));

        Canvas canvas = new Canvas();
        //canvas.drawOval(x,y,x+20,y+20,paint);
        canvas.drawCircle(x,y,20,paint);

        iv.draw(canvas);
    }
     */
}