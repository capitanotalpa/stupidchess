package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.PieceType;

public class Knight extends Piece {
    public static final short WORTH = 3;

    public Knight(int x, int y, Boolean isWhite) {
        super(x, y, isWhite, PieceType.KNIGHT);
    }
}
