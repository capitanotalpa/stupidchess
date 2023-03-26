package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.PieceType;

public class Bishop extends Piece {
    public static final short WORTH = 3;

    public Bishop(int x, int y, Boolean isWhite) {
        super(x, y, isWhite, PieceType.BISHOP);
    }
}
