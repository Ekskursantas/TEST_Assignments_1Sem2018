/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cherry Rose Semeña
 */
class Player {

    private String name;
    private Piece piece;
    private Board board;
    private Dice[] dice;

    public Player(String name, Dice[] dice, Board board) {
        this.name = name;
        this.dice = dice;
        this.board = board;
        piece = new Piece(board.getStartSquare());
    }

    public void takeTurn() {
        // roll dice
        int rollTotal = 0;
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
            rollTotal += dice[i].getFaceValue();
        }

        Square newLoc = board.getSquare(piece.getLocation(), rollTotal);
        piece.setLocation(newLoc);

    }

    public Square getLocation() {
        return piece.getLocation();
    }

    public String getName() {
        return name;
    }
}
