package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint mPaint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(2);
        canvas.drawLine(100, 400, 980, 400, mPaint);
        canvas.drawLine(100, 400, 100, 0, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(130, 397, 210, 400, mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(240, 365, 320, 400, mPaint);
        canvas.drawRect(350, 365, 430, 400, mPaint);
        canvas.drawRect(460, 245, 540, 400, mPaint);
        canvas.drawRect(570, 165, 650, 400, mPaint);
        canvas.drawRect(680, 125, 760, 400, mPaint);
        canvas.drawRect(790, 245, 870, 400, mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(23);
        mPaint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Froyo",170, 430, mPaint);


    }
}
