package edu.io;

public class Board {

    public int size;
    private Token[][] board;

    public Board() {
        size = 5;
        board = new Token[size][size];
        clean();
    }

    public void clean() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = new Token("・");
            }
        }
    }

    public void placeToken(int row, int col, Token token) {
        board[row][col] = token;
    }

    public Token peekToken(int row, int col) {
        return board[row][col];
    }

    public void display() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(board[row][col].label + " ");
            }
            System.out.println();
        }
    }
}