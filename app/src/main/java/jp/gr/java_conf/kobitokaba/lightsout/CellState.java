package jp.gr.java_conf.kobitokaba.lightsout;

import android.graphics.Color;

abstract class CellState {
    private int CELL_COLOR;
    abstract void changeNext(Cell cell);
    static void setState(Cell cell, CellState state) {
        cell.setState(state);
        cell.setBackgroundColor(state.CELL_COLOR);
    }

    CellState(int color) {
        CELL_COLOR = color;
    }

    static final CellState GRAY = new CellState(Color.GRAY) {
        @Override
        void changeNext(Cell cell) {
            setState(cell, GREEN);
        }
    };

    static final CellState GREEN = new CellState(Color.GREEN) {
        @Override
        void changeNext(Cell cell) {
            setState(cell, GRAY);
        }
    };

    static final CellState BLACK = new CellState(Color.BLACK) {
        @Override
        void changeNext(Cell cell) {
        }
    };
}
