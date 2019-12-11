package com.thoughtworks.aceleradora.service;

public class MarvelClient {
    private static final String PUBLIC_KEY = System.getProperty("marvelPublicApiKey.txt");
    private static final String PRIVATE_KEY = System.getProperty("marvelPrivateApiKey.txt");

    public String getkEY() {
        return PUBLIC_KEY;
    }


//    public void componentDidMount() {
//        const timestamp = Number(new Date())
//        const hash = md5.create()
//        hash.update(timestamp + PRIVATE_KEY + PUBLIC_KEY);
//
//        const response = await fetch(`https://gateway.marvel.com/v1/public/characters?ts=${timestamp}&orderBy=name&limit=10&apikey=${PUBLIC_KEY}&hash=${hash.hex()}`)
//        const responseJson = await response.json()
//        this.setState({data: responseJson.data.results})
//    }


}
