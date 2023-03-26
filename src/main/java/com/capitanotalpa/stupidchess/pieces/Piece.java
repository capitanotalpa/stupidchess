package com.capitanotalpa.stupidchess.pieces;

import com.capitanotalpa.stupidchess.game.PieceType;
/**
 * Chess piece abstract class
 */
public abstract class Piece {
    protected int x;
    protected int y;
    protected boolean isWhite;
    protected PieceType type;

    /**
     * Standard constructor for a picece, takes coordinates, color and type of piece as 
     * parameters.
     * @param x X (horizontal coordinate on a board, starts from 0)
     * @param y Y (vertical coordinate on a board, starts from 0)
     * @param color color of a piece (black or white)
     * @param type type of a piece (pawn, rook, etc.)
     */
    protected Piece(int x, int y, Boolean isWhite, PieceType type){
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
        this.type = type;
    }

    // public abstract void getLegalMoves();
    // public abstract boolean isMoveLegal();

    /**
     * Returns type of a piece
     * @return  Piece type
     */
    public PieceType getPieceType() {
        return this.type;
    }

    /**
     * Returns true whether the piece is white
     * @return  true/false for white/black
     */
    public boolean isWhite() {
        return this.isWhite;
    }

    /**
     * Returns X coordinate
     * @return  x coordinate (from 0...)
     */
    public int getX() {
        return this.x;
    }

    /**
     * Returns Y coordinate
     * @return y coordinate (from 0...)
     */
    public int getY() {
        return this.y;
    }
}
