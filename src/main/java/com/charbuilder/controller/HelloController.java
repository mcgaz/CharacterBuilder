package com.charbuilder.controller;

import com.charbuilder.model.AbilityScores;
import com.charbuilder.model.Character;
import com.charbuilder.service.CharacterFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/randomCharacter")
    public String randomCharacter() throws Exception {

/*        AbilityScores startingStats = new AbilityScores();*/

        Character testCharacter = new Character();
        System.out.println(testCharacter.toJson());

        return testCharacter.toJson();
    }
}