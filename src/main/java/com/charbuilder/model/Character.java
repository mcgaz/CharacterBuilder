package com.charbuilder.model;

import java.util.ArrayList;

import com.charbuilder.model.items.Armour;
import com.charbuilder.model.items.Weapons;
import com.charbuilder.model.species.Role;
import com.charbuilder.model.species.Species;
import com.charbuilder.model.traits.Proficiencies;
import com.charbuilder.model.traits.SavingThrows;
import com.charbuilder.model.traits.Size;
import com.charbuilder.model.traits.Skills;
import com.charbuilder.service.CharacterFactory;
import com.charbuilder.service.dice.D20;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.charbuilder.service.CharacterFactory.*;


public class Character {

    private final String name;
    private final Species species;
    private Role role;
    private final Size size;
    private int speed;

    private int level;
    private int baseArmourClass;
    private int initiative;

    private Boolean hidden;
    private final Background background;
    private int attacks;

    private AbilityScores abilityScores;
    private Health health;

    private ArrayList<Proficiencies> skillProficiencies;
    private ArrayList<Proficiencies> armourProficiencies;
    private ArrayList<Proficiencies> weaponProficiencies;
    private ArrayList<SavingThrows> savingThrowProficiencies;

    public Character() {

        this(getRandomName(), getRandomSpecies(), getRandomRole(), getRandomBackground(), new AbilityScores());

    }

    public Character(String name, Species species, Role role, Background background, AbilityScores abilityScores){
        this.name = name;
        this.level = 1;
        this.species = species;
        this.role = role;
        this.background = background;
        this.size = species.size;
        this.speed = species.speed;
        this.abilityScores = abilityScores;
        this.health = new Health(role, level, abilityScores.getConstitutionModifier());
        this.baseArmourClass = 10 + abilityScores.getDexterityModifier();
        this.skillProficiencies = background.skillProficiencies();
        this.initiative = D20.rollOne() + abilityScores.getDexterityModifier();

        if (this.role == Role.BARBARIAN) { this.baseArmourClass += this.abilityScores.getConstitutionModifier(); }


        // TODO implement logging
        // TODO unit tests
        // TODO halfling luck
        // TODO half orc relentless endurance, savage attacks
        // TODO barbarian reckless attack
        // TODO species resistances / advantages / disadvantages
        // TODO random class skill choice
        // TODO resolve background / class random skill choice clash
        // TODO barbarian unarmoured AC
        // TODO format response json
        // TODO call out to name generator
        // TODO impose ability limits
        // TODO include half elf 2 random proficiencies

    }

    public void isProficientSkill(Skills proficiency) {
        this.skillProficiencies.add(proficiency);
    }

    public void isProficientWeapon(Weapons proficiency) {
        this.weaponProficiencies.add(proficiency);
    }

    public void isProficientArmour(Armour proficiency) {
        this.armourProficiencies.add(proficiency);
    }

    public void isProficientSavingThrow(SavingThrows proficiency) {
        this.savingThrowProficiencies.add(proficiency);
    }

    public void levelUp(int level) {
//        TODO ability score level up dependent on level
    }



//    @Override
//    public String toString() {
//        return "Species: " + this.species + "\n" +
//                "Role: " + this.role + "\n" +
//                "Level: " + this.level + "\n";
//    }
    public String toJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

}

