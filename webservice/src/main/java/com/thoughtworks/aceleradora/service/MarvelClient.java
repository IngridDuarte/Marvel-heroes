package com.thoughtworks.aceleradora.service;

import com.thoughtworks.aceleradora.controllers.HeroesController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

public class MarvelClient {
    static final String PUBLIC_KEY = "";
    static final String PRIVATE_KEY = "";
    HeroesController heroesController;

    public void encryptHash() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        String convertHash = timestamp + PRIVATE_KEY + PUBLIC_KEY;

        MessageDigest md = null;
        byte[] hashInBytes =null;
        StringBuilder sb = new StringBuilder();
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(convertHash.getBytes());
            hashInBytes = md.digest();

            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        System.out.println(">>>>>>>>>>>>>>>>>>"+sb+">>>>>>>>>>>>>>>>>>>>>"+PUBLIC_KEY+">>>>>>>>>>>>>>>>>>>>>"+timestamp);
        heroesController.getHeroName(timestamp, PUBLIC_KEY, sb);
    }
}
