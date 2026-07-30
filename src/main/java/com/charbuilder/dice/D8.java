package com.charbuilder.dice;

public class D8 extends BaseDie{

    public static int[] roll(int numberOfDiceRolled) {
        return BaseDie.roll(8, numberOfDiceRolled);
    }

    public static int rollOne() {
        return BaseDie.rollOne(8);
    }

    public static int[] rollHighest(int numberOfDiceRolled, int numberOfDiceNeeded) {
        return BaseDie.rollHighest(8, numberOfDiceRolled, numberOfDiceNeeded);
    }
}
