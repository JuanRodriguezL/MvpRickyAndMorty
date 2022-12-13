package com.example.mvprickymorty.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.adapter.RickyMortyAdapter;
import com.example.mvprickymorty.interfaces.personajes.ImvpCharacters;
import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.presenter.RickyMortyPresenter;

public class HomePersonajesActivity extends AppCompatActivity implements ImvpCharacters.View {
    RecyclerView recyclerView;
    ImvpCharacters.Presenter presenter;
    RickyMortyAdapter rickyMortyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_personajes);
        presenter = new RickyMortyPresenter(this);
        presenter.consultarListaPersonajes();
        recyclerView = findViewById(R.id.recyclerhome);
        rickyMortyAdapter = new RickyMortyAdapter(this);
    }

    @Override
    public void ShowRecyclerV(InformacionCharacters modelosRickyMortyArrayList) {
        rickyMortyAdapter.setAdicion(modelosRickyMortyArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(HomePersonajesActivity.this, 2));
        recyclerView.setAdapter(rickyMortyAdapter);


    }


}