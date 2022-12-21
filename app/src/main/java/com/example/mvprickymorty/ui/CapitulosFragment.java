package com.example.mvprickymorty.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.adapter.EpisodesAdapter;
import com.example.mvprickymorty.interfaces.episodes.ImvpEpisode;
import com.example.mvprickymorty.modelos.InformacionEpisodes;
import com.example.mvprickymorty.presenter.EpisodePresenter;

import java.util.ArrayList;

public class CapitulosFragment extends Fragment implements ImvpEpisode.View {

    RecyclerView recyclerView;
    ImvpEpisode.Presenter presenter;
    EpisodesAdapter episodesAdapter;



    public CapitulosFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new EpisodePresenter(this);
        presenter.ConsultarListaEpisodesP();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerhomeE);
        episodesAdapter =new EpisodesAdapter(getContext());


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_capitulos, container, false);
        return view;
    }

    @Override
    public void RecyclerEpisodesV(InformacionEpisodes episodesRickyMortyArrayList) {

    }
}