package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    Paint mPaint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        canvas.drawArc(100, 100, 600, 600 ,180, 120,true,mPaint);

        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(120, 122, 620, 622,0, -60, true, mPaint);

        mPaint.setColor(Color.CYAN);
        canvas.drawArc(120, 123, 620, 623, 2, 10, true,mPaint);

        mPaint.setColor(Color.GRAY);
        canvas.drawArc(120, 124,620, 624, 14, 5, true,mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawArc(120,125,620,625, 21, 60, true,mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.drawArc(117,125,617,625,83,97, true, mPaint);
    }
}
