package com.example.mvprickymorty.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.interfaces.episodes.ImvpEpisode;
import com.example.mvprickymorty.modelos.InformacionEpisodes;
import com.example.mvprickymorty.presenter.EpisodePresenter;

public class CapitulosActivity extends AppCompatActivity implements ImvpEpisode.View {

    ImvpEpisode.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulos);
        presenter = new EpisodePresenter(this);
        presenter.ConsultarListaEpisodesP();


    }


    @Override
    public void RecyclerEpisodesV(InformacionEpisodes episodesRickyMortyArrayList) {

    }
}