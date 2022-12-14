package com.example.mvprickymorty.interfaces.episodes;

import com.example.mvprickymorty.modelos.InformacionEpisodes;

public interface ImvpEpisode {

    interface View {
        void RecyclerEpisodesV(InformacionEpisodes episodesRickyMortyArrayList);
    }

    interface Presenter {
        void RecyclerEpisodesP(InformacionEpisodes episodesRickyMortyArrayList);
        void ConsultarListaEpisodesP();
    }

    interface Model {
        void ConsultarListaEpisodesM();
    }
}
