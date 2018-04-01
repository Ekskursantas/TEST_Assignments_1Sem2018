/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cherry Rose Semeña
 */
class Dice {

    public static final int MAX = 6;
    private int faceValue;

    public Dice() {
        roll();
    }

    public void roll() {
        faceValue = (int) ((Math.random() * MAX) + 1);
    }

    public int getFaceValue() {
        return faceValue;
    }
}
