package jp.gr.java_conf.kobitokaba.lightsout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class Cell extends View {

    private CellState mState;

    public Cell(Context context) {
        super(context);
        init(null, 0);
    }

    public Cell(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public Cell(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        CellState.setState(this, CellState.GRAY);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle();
            }
        });
    }

    void setState(CellState newState) {
        mState = newState;
    }

    void toggle() {
        mState.changeNext(this);
    }
}
