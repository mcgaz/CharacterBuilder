package com.charbuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;




@RestController
public class HelloController {
    @GetMapping("/randomCharacter")
    public String randomCharacter() throws Exception {

        Character testCharacter = new Character();
        System.out.println(testCharacter.toJson());

//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(testCharacter);
//        System.out.println("CHAR: " + json);
//        return testCharacter.toString();

        return testCharacter.toJson();
    }
}