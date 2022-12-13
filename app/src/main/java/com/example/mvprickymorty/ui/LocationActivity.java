package com.example.mvprickymorty.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.adapter.LocationAdapter;
import com.example.mvprickymorty.interfaces.location.ImvpLocation;
import com.example.mvprickymorty.modelos.InformationLocation;
import com.example.mvprickymorty.presenter.LocationPresenter;

public class LocationActivity extends AppCompatActivity implements ImvpLocation.View {

    RecyclerView recyclerViewL;
    LocationAdapter locationAdapter;
    ImvpLocation.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        presenter = new LocationPresenter();
        presenter.consultarListaLocation();
        recyclerViewL = findViewById(R.id.recyclreLocation);
        locationAdapter = new LocationAdapter(this);


    }

    @Override
    public void ShowRecyclerVLocation(InformationLocation locationRickyMortyArrayList) {
        locationAdapter.setAdicion(locationRickyMortyArrayList);
        recyclerViewL.setLayoutManager(new GridLayoutManager(LocationActivity.this, 2));
        recyclerViewL.setAdapter(locationAdapter);
    }
}