package com.charbuilder.model;

import com.charbuilder.model.species.Role;
import com.charbuilder.service.dice.*;

import java.util.Arrays;

public class Health {
    private int maxHitPoints;
    private int currentHitPoints;
    private int temporaryHitPoints;
    private int numDeathSaves;
    private Boolean inDeathSaves;
    private Die hitDie;
    private int hitDice;

    public Health(Role role, int level, int constitutionModifier){
//        if(maxHitPoints < 0) throw new IllegalArgumentException("Max HitPoints cannot be negative");
//        if(currentHitPoints < 0) throw new IllegalArgumentException("Current HitPoints cannot be negative");
//        if(temporaryHitPoints < 0) throw new IllegalArgumentException("Temporary HitPoints cannot be negative");
//        if(currentHitPoints > maxHitPoints) throw new IllegalArgumentException("Current HitPoints cannot exceed Max HitPoints");
//        if(numDeathSaves < 0) throw new IllegalArgumentException("Number of Death Saves cannot be negative");

        this.maxHitPoints = this.getHitPoints(role.hitDie(), level, constitutionModifier);
        this.currentHitPoints = this.maxHitPoints;
        this.temporaryHitPoints = 0;
        this.numDeathSaves = 0;
        this.inDeathSaves = false;
        this.hitDie = role.hitDie();
        this.hitDice = level;

    }

//    public Health takeDamage(int damage){
//        int newMaxHitPoints = this.maxHitPoints;
//        int newCurrentHitPoints = this.currentHitPoints;
//        int newTemporaryHitPoints = this.temporaryHitPoints;
//        int newNumDeathSaves = this.numDeathSaves;
//        Boolean newInDeathSaves = this.inDeathSaves;
//
//        if (damage < 0) {
//            throw new IllegalArgumentException("Damage cannot be negative");
//        }else if (newCurrentHitPoints + newTemporaryHitPoints == 0){
//            newNumDeathSaves += 1;
//            return new Health(newMaxHitPoints, 0, 0, newNumDeathSaves, Boolean.TRUE);
//        }else if (damage >= newCurrentHitPoints + newTemporaryHitPoints){
//            return new Health(newMaxHitPoints, 0, 0, newNumDeathSaves, Boolean.TRUE);
//        }else if (newCurrentHitPoints > 0 && damage > newTemporaryHitPoints) {
//            damage -= newTemporaryHitPoints;
//            newCurrentHitPoints -= damage;
//            return new Health(newMaxHitPoints, newCurrentHitPoints, 0, newNumDeathSaves, newInDeathSaves);
//        }else if (newTemporaryHitPoints == 0){
//            newCurrentHitPoints -= damage;
//            return new Health(newMaxHitPoints, newCurrentHitPoints, newTemporaryHitPoints, newNumDeathSaves, newInDeathSaves);
//        }else if (newCurrentHitPoints > 0 && damage < newTemporaryHitPoints) {
//            newTemporaryHitPoints -= damage;
//            return new Health(newMaxHitPoints, newCurrentHitPoints, newTemporaryHitPoints, newNumDeathSaves, newInDeathSaves);
//        }else { throw new IllegalArgumentException("PLACEHOLDER EXCEPTION - CHECK CONDITIONAL BRANCHES") ;}
//    }

    private int getHitPoints(Die hitDie, int level, int conModifier) {
        switch (hitDie){
            case D6:
                int d6Sum = Arrays.stream(D6.roll(level)).sum();
                return d6Sum + level * conModifier;
            case D8:
                int d8Sum = Arrays.stream(D8.roll(level)).sum();
                return d8Sum + level * conModifier;
            case D12:
                int d12Sum = Arrays.stream(D12.roll(level)).sum();
                return d12Sum + level * conModifier;
            case D20:
                int d20Sum = Arrays.stream(D20.roll(level)).sum();
                return d20Sum + level * conModifier;
            default:
                System.out.println("Unknown HitPoint die type, setting HP to zero.");
                return 0;
        }
    }

    //TODO death save condition (negative HP)
    //TODO death save critical hit removes 2 deathsaves
    //TODO heal
    //TODO heal with capped max HP
    //TODO longRest
    //TODO shortRest

    private int validateMax(int hitPoints){
        if (hitPoints > this.maxHitPoints){
            throw new IllegalArgumentException("Current HitPoints cannot exceed Max HitPoints");
        }
        return hitPoints;
    }

    private int validate(int hitPoints){
        if (hitPoints < 0){
            throw new IllegalArgumentException("HitPoints cannot be negative");
        }
        return hitPoints;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public int getTemporaryHitPoints() {
        return temporaryHitPoints;
    }

    public int getDeathSaves() {
        return numDeathSaves;
    }

    public Boolean getInDeathSaves() {
        return inDeathSaves;
    }

    public void increaseHitPoints(int hitPoints) {
        this.currentHitPoints += hitPoints;
    }

    public void increaseMaxHitPoints(int hitPoints) {
        this.maxHitPoints += hitPoints;
    }
}
