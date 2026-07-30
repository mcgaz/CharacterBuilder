package com.charbuilder.species;

import com.charbuilder.dice.D6;
import com.charbuilder.utils.Size;
import com.charbuilder.utils.Skills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Species {

    DRAGONBORN(2,0,0,0,0,1, Size.MEDIUM, 30),
    DROW(0,2,0,0,0,1, Size.MEDIUM, 30, Skills.PERCEPTION),
    FOREST_GNOME(0,1,0,2, 0, 0, Size.SMALL, 25),
    HALF_ELF(0,0,0,0,0,2,Size.MEDIUM, 30),
    HALF_ORC(2,0,1, 0, 0,0, Size.MEDIUM, 30, Skills.INTIMIDATION),
    HIGH_ELF(0,2,0,1,0,0, Size.MEDIUM, 30, Skills.PERCEPTION),
    HILL_DWARF(0,0,2,0,1,0, Size.MEDIUM, 25),
    HUMAN(1,1,1,1,1,1, Size.MEDIUM, 30),
    LIGHTFOOT_HALFLING(0,2,0,0,0,1, Size.SMALL, 25),
    MOUNTAIN_DWARF(2,0,2,0,0,0, Size.MEDIUM, 25),
    ROCK_GNOME(0,0,1,2,0,0, Size.SMALL, 25),
    STOUT_HALFLING(0,2,1,0,0, 0, Size.SMALL, 25),
    TIEFLING(0,0,0,1,0,2, Size.MEDIUM, 30),
    WOOD_ELF(0,2,0,0,1,0, Size.MEDIUM, 35, Skills.PERCEPTION);

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

    Species(int baseStrength, int baseDexterity, int baseConstitution, int baseIntelligence, int baseWisdom, int baseCharisma, Size size, int speed, Skills... skills) {
        this.baseStrength =  baseStrength;
        this.baseDexterity = baseDexterity;
        this.baseConstitution = baseConstitution;
        this.baseIntelligence = baseIntelligence;
        this.baseWisdom = baseWisdom;
        this.baseCharisma = baseCharisma;
        this.size = size;
        this.speed = speed;
        this.speciesSkills = Arrays.asList(skills);


    }

}
