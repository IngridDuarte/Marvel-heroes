package com.thoughtworks.aceleradora;

import com.thoughtworks.aceleradora.service.MarvelClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        MarvelClient marvelClient = new MarvelClient();
        marvelClient.encryptHash();
    }
}
