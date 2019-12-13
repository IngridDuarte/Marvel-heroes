package com.thoughtworks.aceleradora.service;

import com.thoughtworks.aceleradora.controllers.HeroesController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

@Service
public class MarvelClient {

    @Autowired
    private HeroesController heroesController = new HeroesController();

    public void encryptHash() {
        String PRIVATE_KEY = "";
        String PUBLIC_KEY = "";
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        String convertHash = timestamp + PRIVATE_KEY + PUBLIC_KEY;

        MessageDigest md;
        byte[] hashInBytes;
        StringBuilder hash = new StringBuilder();
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(convertHash.getBytes());
            hashInBytes = md.digest();
            for (byte b : hashInBytes) {
                hash.append(String.format("%02x", b));
            }
            heroesController.getHeroName(timestamp, PUBLIC_KEY, hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
