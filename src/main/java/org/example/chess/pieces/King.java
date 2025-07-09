package org.example.chess.pieces;

import org.example.chess.Piece;

public class King extends Piece {

    public King(String color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        return color.equals("White") ? "K" : "k";
    }
}
