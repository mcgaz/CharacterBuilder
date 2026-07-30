package com.charbuilder.species;

import com.charbuilder.utils.Skills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum SpeciesProficiencies {

//    DRAGONBORN{},
//    DROW{},
//    FOREST_GNOME{},
//    HALF_ORC{},

//    HIGH_ELF{
//        @Override
//        public ArrayList<Skills> skillProficiencies(){
//            ArrayList<Skills> skills = new ArrayList<>();
//            skills.add(Skills.PERCEPTION);
//            return skills;
//        }
//    };

      HIGH_ELF(Skills.PERCEPTION);

//    HILL_DWARF{},
//    HUMAN{},
//    LIGHTFOOT_HALFLING{},
//    MOUNTAIN_DWARF{},
//    ROCK_GNOME{},
//    STOUT_HALFLING{},
//    TIEFLING{},
//    WOOD_ELF{};

    /*
    dragonborn:
    drow:
    dwarf: battleaxe, handaxe, light hammer, warhammer
    forest gnome:
    half orc:
    high elf:
    hill dwarf:
    human:
    lightfoot halfling:
    mountain dwarf: light armour, medium armour
    rock gnome:
    stout halfling:
    tiefling:
    wood elf:
    */

//    public abstract ArrayList<Skills> skillProficiencies();

    private final List<Skills> skillsList;

    SpeciesProficiencies(Skills... listOfSkills) {
        this.skillsList = Arrays.asList(listOfSkills);
    };

    public List<Skills> getSkillProficiencies() {
        return skillsList;
    }
}
