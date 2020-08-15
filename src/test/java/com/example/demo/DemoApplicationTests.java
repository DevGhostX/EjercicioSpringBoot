package com.example.demo;

import com.example.demo.controller.CharacterController;
import com.example.demo.service.CharacterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private CharacterController characterController;

    @Autowired
    private CharacterService characterService;

    @Test
    void controller() {
        String url2 = "{\"url\":\"https://dragon-ball-api.herokuapp.com/api/character\"}";
        characterController.listCharacter(url2);
    }

    @Test
    void service() {
        String url = "https://dragon-ball-api.herokuapp.com/api/character";
        characterService.list(url);
    }

}
