package com.example.mvprickymorty.interfaces;

import com.example.mvprickymorty.modelos.InformacionRespuesta;

public interface Imvp {

    interface View{
        void ShowRecyclerV(InformacionRespuesta modelosRickyMortyArrayList);
    }

    interface Presenter{
        void ShowRecyclerP(InformacionRespuesta modelosRickyMortyArrayList);
        void consultarListaPersonajes();
    }

    interface Model{
        void consultarListaPersonajes();
    }
}
