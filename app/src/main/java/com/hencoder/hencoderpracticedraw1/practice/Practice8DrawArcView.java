package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    Paint mPaint = new Paint();


    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        mPaint.setAntiAlias(true);
        mPaint.setAntiAlias(true);
        canvas.drawArc(200, 300,550,440,
                0,180,true, mPaint);


        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200,200,550,450, 185, 45,false,mPaint);


        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200,200,550,450, 240, 100, true, mPaint);

    }
}
