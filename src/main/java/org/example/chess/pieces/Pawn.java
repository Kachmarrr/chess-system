package org.example.chess.pieces;

import org.example.chess.Piece;

public class Pawn extends Piece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        return color.equals("White") ? "P" : "p";
    }
}
