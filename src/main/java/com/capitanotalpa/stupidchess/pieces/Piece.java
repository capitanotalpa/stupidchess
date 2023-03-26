package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.Color;

public abstract class Piece {
    protected int x;
    protected int y;
    protected Color color;

    protected Piece(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void getLegalMoves();
    public abstract String move();
}
