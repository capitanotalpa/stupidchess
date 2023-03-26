package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.PieceType;

public class Pawn extends Piece {
    public static final short WORTH = 1;

    public Pawn(int x, int y, Boolean isWhite) {
        super(x, y, isWhite, PieceType.PAWN);
    }
}
