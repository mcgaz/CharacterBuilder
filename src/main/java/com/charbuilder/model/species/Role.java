package com.charbuilder.model.species;

import com.charbuilder.service.dice.Die;
import com.charbuilder.model.AbilityModifier;
import com.charbuilder.model.traits.SavingThrows;

import java.util.Arrays;
import java.util.List;

public enum Role {

    BARBARIAN {
        @Override
        public Die hitDie() {
            return Die.D12;
        }

        @Override
        public AbilityModifier abilityModifier() {
            return AbilityModifier.CONSTITUTION;
        }

        @Override
        public List<SavingThrows> savingThrows() {
            return Arrays.asList(SavingThrows.STRENGTH, SavingThrows.CONSTITUTION);
        }

    };

    public abstract Die hitDie();

    public abstract AbilityModifier abilityModifier();

    public abstract List<SavingThrows> savingThrows();
}
