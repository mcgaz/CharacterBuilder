package com.charbuilder.service;

import com.charbuilder.model.Background;
import com.charbuilder.model.species.Role;
import com.charbuilder.model.species.Species;
import com.charbuilder.service.dice.D6;

import java.util.Arrays;
import java.util.Random;

public class CharacterFactory {

    public static int creationRoll(){
        int result;
        try {
            result = Arrays.stream(D6.rollHighest(4, 3)).sum();
            if (result < 3 || result > 18) {throw new IllegalStateException();}
            return result;

        } catch (IllegalStateException e){
            System.out.println("Creation Roll can't be less than 3 or greater than 18: " + e.getMessage());
            System.out.println("Defaulting to 10");
            result = 10;
            return result;
        }
    }

    public static String getRandomName() {
        final Random RANDOM = new Random();
        String[] nameArray = {"Angry Fletcher", "Tired Cook", "Sassy Duck", "Handsy Priest"};
        int randomIndex = RANDOM.nextInt(nameArray.length);
        return nameArray[randomIndex];
    }

    public static Species getRandomSpecies() {
        final Random RANDOM = new Random();
        Species[] speciesArray = Species.values();
        int randomIndex = RANDOM.nextInt(speciesArray.length);
        return speciesArray[randomIndex];
    }

    public static Role getRandomRole() {
        final Random RANDOM = new Random();
        Role[] rolesArray = Role.values();
        int randomIndex = RANDOM.nextInt(rolesArray.length);
//        System.out.println(randomIndex);
        return rolesArray[randomIndex];
    }

    public static Background getRandomBackground() {
        final Random RANDOM = new Random();
        Background[] backgroundsArray = Background.values();
        int randomIndex = RANDOM.nextInt(backgroundsArray.length);
        return backgroundsArray[randomIndex];
    }

    public static int getRandomLevel() {
//        System.out.println("RANDOM LEVEL: " + level);
        return com.charbuilder.service.dice.D20.rollOne();
    }
}
