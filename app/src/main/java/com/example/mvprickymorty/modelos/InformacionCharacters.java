package com.example.mvprickymorty.modelos;

import java.util.ArrayList;

public class InformacionCharacters {


    ArrayList<CharactersRickyMorty> results;
    Info info;


    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public ArrayList<CharactersRickyMorty> getResults() {
        return results;
    }

    public void setResults(ArrayList<CharactersRickyMorty> results) {
        this.results = results;
    }

}
