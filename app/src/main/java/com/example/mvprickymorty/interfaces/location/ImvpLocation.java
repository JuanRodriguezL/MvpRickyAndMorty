package com.example.mvprickymorty.interfaces.location;

import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.modelos.InformationLocation;

public interface ImvpLocation {

    interface View{
        void ShowRecyclerVLocation(InformationLocation locationRickyMortyArrayList);

    }

    interface Presenter{
        void ShowRecyclerPLocation(InformationLocation locationRickyMortyArrayList);
        void consultarListaLocation();
    }

    interface Model{
        void consultarListaLocation();

    }
}
