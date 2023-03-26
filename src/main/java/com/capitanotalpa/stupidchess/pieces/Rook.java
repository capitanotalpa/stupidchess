package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.PieceType;

public class Rook extends Piece {
    public static final short WORTH = 5;

    public Rook(int x, int y, Boolean isWhite) {
        super(x, y, isWhite, PieceType.ROOK);
    }
}
