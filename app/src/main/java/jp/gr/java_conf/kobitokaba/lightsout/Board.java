package jp.gr.java_conf.kobitokaba.lightsout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.percent.PercentRelativeLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Board extends PercentRelativeLayout {

    public Board(Context context) {
        super(context);
        init(null, 0);
    }

    public Board(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public Board(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec),
                getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec));
    }
}
