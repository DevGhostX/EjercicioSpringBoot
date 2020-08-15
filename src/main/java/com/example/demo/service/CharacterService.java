package com.example.demo.service;

import com.example.demo.entity.Character;
import org.springframework.http.ResponseEntity;

public interface CharacterService {

    ResponseEntity<Character[]> list(String url);
}
