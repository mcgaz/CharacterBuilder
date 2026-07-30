package com.charbuilder.dice;

public class D6 extends BaseDie{

    public static int[] roll(int numberOfDiceRolled) {
        return BaseDie.roll(6, numberOfDiceRolled);
    }

    public static int rollOne() {
        return BaseDie.rollOne(6);
    }

    public static int[] rollHighest(int numberOfDiceRolled, int numberOfDiceNeeded) {
        return BaseDie.rollHighest(6, numberOfDiceRolled, numberOfDiceNeeded);
    }
}

