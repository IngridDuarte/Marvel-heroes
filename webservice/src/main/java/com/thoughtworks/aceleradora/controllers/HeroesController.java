package com.thoughtworks.aceleradora.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;

@RestController
@RequestMapping("/ws")
public class HeroesController {
    public HeroesController() {}

    @GetMapping("")
    public String getHeroName(Timestamp timestamp, String PUBLIC_KEY, StringBuilder hash) {

        RestTemplate restTemplate = new RestTemplate();
        String teste =  restTemplate.getForObject(
                "http://gateway.marvel.com/v1/public/characters?ts="+timestamp+"&apikey="+PUBLIC_KEY+"&hash="+hash, String.class);
        return teste;
    }
}
