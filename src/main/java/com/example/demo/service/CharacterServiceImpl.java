package com.example.demo.service;

import com.example.demo.entity.Character;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final RestTemplate restTemplate;

    public CharacterServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<Character[]> list(String url) {
        return restTemplate.getForEntity(url, Character[].class);
    }

}
