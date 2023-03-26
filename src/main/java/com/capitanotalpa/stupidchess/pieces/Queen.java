package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.PieceType;

public class Queen extends Piece {
    public static final short WORTH = 9;

    public Queen(int x, int y, Boolean isWhite) {
        super(x, y, isWhite, PieceType.QUEEN);
    }
}
