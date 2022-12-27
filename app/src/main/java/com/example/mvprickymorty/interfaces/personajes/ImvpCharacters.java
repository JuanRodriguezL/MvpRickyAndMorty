package com.example.mvprickymorty.interfaces.personajes;

import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.modelos.InformationLocation;

public interface ImvpCharacters {

    interface View{
        void ShowRecyclerV(InformacionCharacters modelosRickyMortyArrayList);

    }

    interface Presenter{
        void ShowRecyclerP(InformacionCharacters modelosRickyMortyArrayList);
        void consultarListaPersonajes(int pageNum);
    }

    interface Model{
        void consultarListaPersonajes(int pageNum);

    }
}
