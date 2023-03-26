package com.capitanotalpa.stupidchess.game;

import java.util.EnumMap;
import java.util.Vector;

import com.capitanotalpa.stupidchess.pieces.Bishop;
import com.capitanotalpa.stupidchess.pieces.King;
import com.capitanotalpa.stupidchess.pieces.Knight;
import com.capitanotalpa.stupidchess.pieces.Pawn;
import com.capitanotalpa.stupidchess.pieces.Piece;
import com.capitanotalpa.stupidchess.pieces.Queen;
import com.capitanotalpa.stupidchess.pieces.Rook;

/**
 * Board for chess :)
 */
public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private EnumMap<PieceType, String> shortcuts;
    private Tile[][] tiles;

    public Board() {
        // initializing shortcuts
        this.shortcuts = new EnumMap<>(PieceType.class);
        this.shortcuts.put(PieceType.PAWN, "p");
        this.shortcuts.put(PieceType.ROOK, "R");
        this.shortcuts.put(PieceType.KNIGHT, "N");
        this.shortcuts.put(PieceType.BISHOP, "B");
        this.shortcuts.put(PieceType.QUEEN, "Q");
        this.shortcuts.put(PieceType.KING, "K");

        // initializing board
        this.tiles = new Tile[Board.HEIGHT][Board.WIDTH];
        for (int y = 0; y < Board.HEIGHT; y++) {
            for (int x = 0; x < Board.WIDTH; x++) {
                this.tiles[y][x] = new Tile(x, y);
            }
        }
    }

    /**
     * Generates starting position
     */
    private void generateStartingPosition() {
        // TODO: improve representation of position
        Vector<Piece> pieces = new Vector<>(Board.WIDTH * 4);
        // white and black pawns
        for (int x = 0; x < Board.WIDTH; x++) {
            pieces.add(new Pawn(x, 1, true));
            pieces.add(new Pawn(x, 6, false));
        }
        // rooks here
        pieces.add(new Rook(0, 0, true));
        pieces.add(new Rook(7, 0, true));
        pieces.add(new Rook(0, 7, false));
        pieces.add(new Rook(7, 7, false));
        // knights
        pieces.add(new Knight(1, 0, true));
        pieces.add(new Knight(6, 0, true));
        pieces.add(new Knight(1, 7, false));
        pieces.add(new Knight(6, 7, false));
        // bishops
        pieces.add(new Bishop(2, 0, true));
        pieces.add(new Bishop(5, 0, true));
        pieces.add(new Bishop(2, 7, false));
        pieces.add(new Bishop(5, 7, false));
        // queens
        pieces.add(new Queen(3, 0, true));
        pieces.add(new Queen(3, 7, false));
        // kings
        pieces.add(new King(4, 0, true));
        pieces.add(new King(4, 7, false));

        for (Piece piece : pieces) {
            this.putPiece(piece);
        }
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.generateStartingPosition();
        b.drawBoard();
    }

    /**
     * Puts piece into a tile
     * @param piece piece to put
     */
    public void putPiece(Piece piece) {
        // TODO: add checks and fix the storing algo
        this.tiles[piece.getY()][piece.getX()].setPiece(piece);
    }

    /**
     * Gets piece shortcut from map
     * @param pieceType Type of a piece
     * @return  String - one symbol-shortcut of a piece
     */
    public String getShortcut(PieceType pieceType) {
        return this.shortcuts.get(pieceType);
    }

    /**
     * Primitively draws board in console
     */
    public void drawBoard() {
        for (int y = Board.HEIGHT - 1; y >= 0; y--) {
            for (int x = 0; x < Board.WIDTH; x++) {
                Piece currentPiece = this.tiles[y][x].getPiece();
                if (currentPiece == null) {
                    System.out.print(".x.");
                } else {
                    if (currentPiece.isWhite()) {
                        System.out.printf("%s%s%s", ",", this.getShortcut(currentPiece.getPieceType()), ",");
                    } else {
                        System.out.printf("%s%s%s", "`", this.getShortcut(currentPiece.getPieceType()), "`");
                    }
                }
                if (x != Board.WIDTH - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}
