package com.thoughtworks.aceleradora.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws/pessoas")
public class HeroesController {

    public HeroesController() {
    }

    @GetMapping("")
    public String getAll() {
        return "Okayy";
    }
}
