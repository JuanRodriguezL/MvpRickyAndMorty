package com.example.mvprickymorty.presenter;

import com.example.mvprickymorty.interfaces.episodes.ImvpEpisode;
import com.example.mvprickymorty.model.EpisodeModel;
import com.example.mvprickymorty.modelos.InformacionEpisodes;

public class EpisodePresenter implements ImvpEpisode.Presenter {
    ImvpEpisode.Model modelE;
    ImvpEpisode.View viewE;


    public EpisodePresenter(ImvpEpisode.View viewEp) {
        modelE = new EpisodeModel(this);
        this.viewE = viewEp;
    }

    @Override
    public void RecyclerEpisodesP(InformacionEpisodes episodesRickyMortyArrayList) {
        if (viewE != null) {
            viewE.RecyclerEpisodesV(episodesRickyMortyArrayList);
        }

    }

    @Override
    public void ConsultarListaEpisodesP() {
        if (modelE != null) {
            modelE.ConsultarListaEpisodesM();

        }
    }
}
