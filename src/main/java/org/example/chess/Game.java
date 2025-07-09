package org.example.chess;


public class Game {
    private Board board;

    public Game() {
        this.board = new Board();
        board.setupInitialPosition();
    }

    public void start() {
        System.out.println("Game started!");
        board.printBoard();
    }
}