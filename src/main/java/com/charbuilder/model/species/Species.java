package com.charbuilder.model.species;

import com.charbuilder.model.traits.Size;
import com.charbuilder.model.traits.Skills;

import java.util.Arrays;
import java.util.List;

public enum Species {

    DRAGONBORN(2,0,0,0,0,1, Size.MEDIUM, 30, 0),
    DROW(0,2,0,0,0,1, Size.MEDIUM, 30, 0, Skills.PERCEPTION),
    FOREST_GNOME(0,1,0,2, 0, 0, Size.SMALL, 25, 0),
    HALF_ELF(0,0,0,0,0,2,Size.MEDIUM, 30, 0),
    HALF_ORC(2,0,1, 0, 0,0, Size.MEDIUM, 30, 0, Skills.INTIMIDATION),
    HIGH_ELF(0,2,0,1,0,0, Size.MEDIUM, 30, 0, Skills.PERCEPTION),
    HILL_DWARF(0,0,2,0,1,0, Size.MEDIUM, 25, 0),
    HUMAN(1,1,1,1,1,1, Size.MEDIUM, 30, 0),
    LIGHTFOOT_HALFLING(0,2,0,0,0,1, Size.SMALL, 25, 0),
    MOUNTAIN_DWARF(2,0,2,0,0,0, Size.MEDIUM, 25, 0),
    ROCK_GNOME(0,0,1,2,0,0, Size.SMALL, 25, 0),
    STOUT_HALFLING(0,2,1,0,0, 0, Size.SMALL, 25, 0),
    TIEFLING(0,0,0,1,0,2, Size.MEDIUM, 30,0),
    WOOD_ELF(0,2,0,0,1,0, Size.MEDIUM, 35, 0, Skills.PERCEPTION);

    // TODO include species weapon proficiencies

    public final int baseStrength;
    public final int baseDexterity;
    public final int baseConstitution;
    public final int baseIntelligence;
    public final int baseWisdom;
    public final int baseCharisma;
    public final int speed;
    public final Size size;
    public final List<Skills> speciesSkills;
    public final int baseHitPoints;

    Species(int baseStrength, int baseDexterity, int baseConstitution, int baseIntelligence, int baseWisdom, int baseCharisma, Size size, int speed, int baseHitPoints, Skills... skills) {
        this.baseStrength =  baseStrength;
        this.baseDexterity = baseDexterity;
        this.baseConstitution = baseConstitution;
        this.baseIntelligence = baseIntelligence;
        this.baseWisdom = baseWisdom;
        this.baseCharisma = baseCharisma;
        this.size = size;
        this.speed = speed;
        this.baseHitPoints = baseHitPoints;
        this.speciesSkills = Arrays.asList(skills);


    }

}
