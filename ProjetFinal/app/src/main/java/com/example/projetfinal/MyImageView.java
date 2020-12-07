package com.example.projetfinal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import static android.graphics.Color.TRANSPARENT;

public class MyImageView extends androidx.appcompat.widget.AppCompatImageView {

    public MyImageView(Context context) {
        super(context);
    }

    public float myX;
    public float myY;
    public boolean drawC = false;
    public char cirColor;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);

        switch (cirColor){
            case 'g':
                p.setColor(Color.GREEN);
                break;
            case 'y':
                p.setColor(Color.YELLOW);
                break;
            case 'r':
                p.setColor(Color.RED);
                break;
            case 'b':
                p.setColor(Color.BLUE);
                break;
            default:
                p.setColor(Color.WHITE);
                break;
        }

        if (drawC) {
            canvas.drawCircle(myX, myY, 50, p);
            invalidate();
        }
    }

}
