package com.thoughtworks.aceleradora.dominio;

public class Hero {
    private Long id;
    private String nome;
    private String history;

    private Hero() {
    }

    public Hero(Long id, String nome, String history) {
        this.id = id;
        this.nome = nome;
        this.history = history;
    }
}
