package com.example.projetfinal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.ImageView;

import static android.graphics.Color.TRANSPARENT;

public class MyImageView extends androidx.appcompat.widget.AppCompatImageView {
    public MyImageView(Context context){
        super(context);
    }

    public float myX;
    public float myY;
    public boolean drawC = false;

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        if(drawC){
            canvas.drawCircle(myX, myY,50,p);

            invalidate();
        }
    }

}
