package com.charbuilder.utils;

import java.util.ArrayList;

public enum Background implements Proficiencies {


    ACOLYTE {
        @Override
        public ArrayList<Proficiencies> skillProficiencies(){
            ArrayList<Proficiencies> skills = new ArrayList<>();
            skills.add(Skills.INSIGHT);
            skills.add(Skills.RELIGION);
            return skills;
        }
    },
    CRIMINAL {
        @Override
        public ArrayList<Proficiencies> skillProficiencies(){
            ArrayList<Proficiencies> skills = new ArrayList<>();
            skills.add(Skills.DECEPTION);
            skills.add(Skills.STEALTH);
            return skills;
        }
    },
    FOLK_HERO {
        @Override
        public ArrayList<Proficiencies> skillProficiencies(){
            ArrayList<Proficiencies> skills = new ArrayList<>();
            skills.add(Skills.ANIMAL_HANDLING);
            skills.add(Skills.SURVIVAL);
            return skills;
        }
    },
    NOBLE {
        @Override
        public ArrayList<Proficiencies> skillProficiencies(){
            ArrayList<Proficiencies> skills = new ArrayList<>();
            skills.add(Skills.HISTORY);
            skills.add(Skills.PERSUASION);
            return skills;
        }
    },
    SAGE {
        @Override
        public ArrayList<Proficiencies> skillProficiencies(){
            ArrayList<Proficiencies> skills = new ArrayList<>();
            skills.add(Skills.ARCANA);
            skills.add(Skills.HISTORY);
            return skills;
        }
    },
    SOLDIER {
        @Override
        public ArrayList<Proficiencies> skillProficiencies(){
            ArrayList<Proficiencies> skills = new ArrayList<>();
            skills.add(Skills.ATHLETICS);
            skills.add(Skills.INTIMIDATION);
            return skills;
        }
    };

    public abstract ArrayList<Proficiencies>  skillProficiencies();

}
