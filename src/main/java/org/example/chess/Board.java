package org.example.chess;

import org.example.chess.pieces.King;
import org.example.chess.pieces.Pawn;

public class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[8][8];
    }

    public void setupInitialPosition() {
        grid[0][4] = new King("White");
        grid[7][4] = new King("Black");

        for (int i = 0; i < 8; i++) {
            grid[1][i] = new Pawn("White");
            grid[6][i] = new Pawn("Black");
        }
    }

    public void printBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = grid[row][col];
                if (piece != null) {
                    System.out.print(piece.getSymbol() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
