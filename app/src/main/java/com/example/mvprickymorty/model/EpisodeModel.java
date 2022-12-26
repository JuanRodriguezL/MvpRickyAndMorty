package com.example.mvprickymorty.model;

import com.example.mvprickymorty.interfaces.RickyMortyService;
import com.example.mvprickymorty.interfaces.episodes.ImvpEpisode;
import com.example.mvprickymorty.modelos.InformacionEpisodes;
import com.example.mvprickymorty.modelos.InformationLocation;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EpisodeModel implements ImvpEpisode.Model {

    ImvpEpisode.Presenter presenter;
    InformacionEpisodes informacionEpisodes;

public EpisodeModel(ImvpEpisode.Presenter presenterE){
    this.presenter = presenterE;

}

    @Override
    public void ConsultarListaEpisodesM() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RickyMortyService rickyMortyService = retrofit.create(RickyMortyService.class);
        Call<InformacionEpisodes> call = rickyMortyService.getEpisodeList();

        call.enqueue(new Callback<InformacionEpisodes>() {
            @Override
            public void onResponse(Call<InformacionEpisodes> call, Response<InformacionEpisodes> response) {
                informacionEpisodes = response.body();
                presenter.RecyclerEpisodesP(informacionEpisodes);
            }

            @Override
            public void onFailure(Call<InformacionEpisodes> call, Throwable t) {

            }
        });
    }
}


