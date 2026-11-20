package edu.io;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();

        Token gold = new Token("💰︎");
        Token player = new Token("웃");

        board.placeToken(2, 2, gold);
        board.placeToken(0, 0, player);

        board.display();

        Token token = board.peekToken(2, 2);

        if (token != null) {
            System.out.println("Znaleziono token: " + token.label);
        }
    }
}