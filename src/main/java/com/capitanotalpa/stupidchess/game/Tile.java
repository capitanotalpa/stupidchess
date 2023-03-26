package com.capitanotalpa.stupidchess.game;

import com.capitanotalpa.stupidchess.pieces.Piece;

/**
 * Tile on the board
 */
public class Tile {
    private int x;
    private int y;
    private Piece piece = null;

    /**
     * Makes tile in given coordinates
     * @param x horizontal coordinate
     * @param y vertical coordinate
     */
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Sets piece to a tile
     * @param piece Piece to set
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    /**
     * Returns piece from tile
     */
    public Piece getPiece() {
        return this.piece;
    }
}
