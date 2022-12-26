package com.example.mvprickymorty.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvprickymorty.MainActivity;
import com.example.mvprickymorty.R;
import com.example.mvprickymorty.adapter.RickyMortyAdapter;
import com.example.mvprickymorty.interfaces.personajes.ImvpCharacters;
import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.presenter.RickyMortyPresenter;


public class HomeFragment extends Fragment implements ImvpCharacters.View  {
    RecyclerView recyclerView;
    ImvpCharacters.Presenter presenter;
    RickyMortyAdapter rickyMortyAdapter;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new RickyMortyPresenter(this);
        presenter.consultarListaPersonajes();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerhomeP);
        rickyMortyAdapter = new RickyMortyAdapter(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void ShowRecyclerV(InformacionCharacters modelosRickyMortyArrayList) {
        rickyMortyAdapter.setAdicion(modelosRickyMortyArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(rickyMortyAdapter);
    }
}