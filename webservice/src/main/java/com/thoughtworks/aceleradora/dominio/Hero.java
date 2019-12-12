package com.thoughtworks.aceleradora.dominio;

public class Hero {
    private Long id;
    private String name;
    private String history;

    private Hero() {
    }

    public Hero(Long id, String name, String history) {
        this.id = id;
        this.name = name;
        this.history = history;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return name;
    }

    public String getHistory() {
        return history;
    }
}
