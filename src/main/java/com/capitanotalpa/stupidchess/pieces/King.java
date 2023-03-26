package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.PieceType;

public class King extends Piece {
    
    public King(int x, int y, Boolean isWhite) {
        super(x, y, isWhite, PieceType.KING);
    }
}
