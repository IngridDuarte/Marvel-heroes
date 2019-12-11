package com.thoughtworks.aceleradora.controllers;

import com.thoughtworks.aceleradora.service.MarvelClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws/pessoas")
public class HeroesController {
    MarvelClient marvelClient = new MarvelClient();

    public HeroesController() {}

    @GetMapping("")
    @ResponseBody
    public String getAll() {
        String teste =  marvelClient.getkEY();
        return teste + "<<<<<<<<<oii";
    }
}
