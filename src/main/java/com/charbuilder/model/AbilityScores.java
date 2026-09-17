package com.charbuilder.model;

import com.charbuilder.model.species.Species;
import com.charbuilder.service.CharacterFactory;
import com.charbuilder.service.dice.D6;


public class AbilityScores {
    public static final int MIN_SCORE = 1;
    public static final int MAX_SCORE = 30;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;


    public AbilityScores(int strength, int dexterity, int constitution,
                            int intelligence, int wisdom, int charisma, Species species){
        this.strength = validate(strength + species.baseStrength);
        this.dexterity = validate(dexterity + species.baseDexterity);
        this.constitution = validate(constitution + species.baseConstitution);
        this.intelligence = validate(intelligence + species.baseIntelligence);
        this.wisdom = validate(wisdom + species.baseWisdom);
        this.charisma = validate(charisma + species.baseCharisma);

    }

    public AbilityScores(){
        this(
            CharacterFactory.creationRoll(),
            CharacterFactory.creationRoll(),
            CharacterFactory.creationRoll(),
            CharacterFactory.creationRoll(),
            CharacterFactory.creationRoll(),
            CharacterFactory.creationRoll(),
            CharacterFactory.getRandomSpecies()
            );
    }

    /**
     * Ensures Ability Scores do not exceed 1-30 as per 5e rules
     * @param score ability score to be validated
     * @return score validated ability score
     */
    public static int validate(int score) {
        if (score < MIN_SCORE || score > MAX_SCORE) {
            throw new IllegalArgumentException(
                    String.format("Ability score must be between %d and %d", MIN_SCORE, MAX_SCORE));
        }
        return score;
    }

    /**
     * Applies an Ability Score Improvement (ASI) to this set of scores.
     * @param ability The ability to improve (e.g., "strength").
     * @param amount The amount to increase by (usually 1 or 2; cannot exceed +2 total per ASI in 5e).
     * @return A new AbilityScores instance with the updated score.
     * @throws IllegalArgumentException if the ability is invalid or the increase would go over the limit.
     */
   /* public AbilityScores withIncrease(Abilities ability, int amount) {
        int newStrength = this.strength;
        int newDexterity = this.dexterity;
        int newConstitution = this.constitution;
        int newIntelligence = this.intelligence;
        int newWisdom = this.wisdom;
        int newCharisma = this.charisma;

        if (amount < 0) {
            throw new IllegalArgumentException("ASI increase cannot be negative");
        } else if (amount > 2) {
            throw new IllegalArgumentException("No single ability can be increased by more than +2 in one ASI");
        }

        switch (ability) {
            case STRENGTH:    newStrength += amount; break;
            case DEXTERITY:   newDexterity += amount; break;
            case CONSTITUTION:newConstitution += amount; break;
            case INTELLIGENCE:newIntelligence += amount; break;
            case WISDOM:      newWisdom += amount; break;
            case CHARISMA:    newCharisma += amount; break;
            default: throw new IllegalArgumentException("Invalid ability: " + ability);
        }

        return new AbilityScores(
                validate(newStrength),
                validate(newDexterity),
                validate(newConstitution),
                validate(newIntelligence),
                validate(newWisdom),
                validate(newCharisma);
    }*/

    /** Applies an ASI to two abilities (e.g., +1 Dex, +1 Con). */
//    public AbilityScores withIncrease(Abilities ability1, int amount1, Abilities ability2, int amount2) {
//        if (amount1 < 0 || amount2 < 0 || (amount1 + amount2) > 2) {
//            throw new IllegalArgumentException("Total ASI increase cannot exceed +2");
//        }
//        AbilityScores step1 = this.withIncrease(ability1, amount1);
//        return step1.withIncrease(ability2, amount2);
//    }


    private int calculateModifier(int ability) { return (int) Math.floor((ability - 10) / 2.0) ;}

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getStrengthModifier() {
        return this.calculateModifier(this.strength);
    }

    public int getDexterityModifier() {
        return this.calculateModifier(this.dexterity);
    }

    public int getConstitutionModifier() {
        return this.calculateModifier(this.constitution);
    }

    public int getIntelligenceModifier() {
        return this.calculateModifier(this.intelligence);
    }

    public int getWisdomModifier() {
        return this.calculateModifier(this.wisdom);
    }

    public int getCharismaModifier() {
        return this.calculateModifier(this.charisma);
    }

    public void increaseStrength(int strength) {
        this.strength += strength;
    }

    public void increaseDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public void increaseConstitution (int constitution) {
        this.constitution += constitution;
    }

    public void increaseIntelligence (int intelligence) {
        this.intelligence += intelligence;
    }

    public void increaseWisdom (int wisdom) {
        this.wisdom += wisdom;
    }

    public void increaseCharisma (int charisma) {
        this.charisma += charisma;
    }

}
