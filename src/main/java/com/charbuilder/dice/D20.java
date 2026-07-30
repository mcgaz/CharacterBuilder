package com.charbuilder.dice;

public class D20 extends BaseDie {

    public static int[] roll(int numberOfDiceRolled) {
        return BaseDie.roll(20, numberOfDiceRolled);
    }

    public static int rollOne() {
        return BaseDie.rollOne(20);
    }

    public static int[] rollHighest(int numberOfDiceRolled, int numberOfDiceNeeded) {
        return BaseDie.rollHighest(20, numberOfDiceRolled, numberOfDiceNeeded);
    }
}
