package com.example.mvprickymorty.modelos;

import java.util.ArrayList;

public class InformationLocation {

    public ArrayList<Location> getResults() {
        return results;
    }

    public void setResults(ArrayList<Location> results) {
        this.results = results;
    }

    ArrayList<Location> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    Info info;

}
