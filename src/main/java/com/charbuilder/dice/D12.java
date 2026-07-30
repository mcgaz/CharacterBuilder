package com.charbuilder.dice;

public class D12 extends BaseDie {

    public static int[] roll(int numberOfDiceRolled) {
        return BaseDie.roll(12, numberOfDiceRolled);
    }

    public static int rollOne() {
        return BaseDie.rollOne(12);
    }

    public static int[] rollHighest(int numberOfDiceRolled, int numberOfDiceNeeded) {
        return BaseDie.rollHighest(12, numberOfDiceRolled, numberOfDiceNeeded);
    }
}
