package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.Color;

public class Pawn extends Piece {
    public static final short WORTH = 1;
    public static final char SHORTCUT = 'P';

    public Pawn(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void getLegalMoves() {
        // TODO Auto-generated method stub
    }
    @Override
    public String move() {
        // TODO Auto-generated method stub
        return null;
    }
}
