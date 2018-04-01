/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cherry Rose Semeña
 */
class Square {

    private String name;
    private Square nextSquare;
    private int index;

    public Square(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public void setNextSquare(Square s) {
        nextSquare = s;
    }

    public Square getNextSquare() {
        return nextSquare;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
