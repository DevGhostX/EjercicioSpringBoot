package com.example.demo.controller;

import com.example.demo.entity.Character;
import com.example.demo.service.CharacterService;
import com.example.demo.service.CharacterServiceImpl;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterServiceImpl characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    public Map<String, List<Character>> listCharacter(@RequestBody String url) {
        JSONObject jsonObject = new JSONObject(url);
        String urlService = jsonObject.getString("url");
        Map<String, List<Character>> response = new HashMap<>();
        response.put("data", Arrays.asList(Objects.requireNonNull(characterService.list(urlService).getBody())));
        return response;
    }

}
