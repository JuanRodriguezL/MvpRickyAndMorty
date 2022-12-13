package com.example.mvprickymorty.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.R;
import com.example.mvprickymorty.interfaces.personajes.ImvpCharacters;
import com.example.mvprickymorty.modelos.InformacionCharacters;

public class LocationActivity extends AppCompatActivity implements ImvpCharacters.View {

    RecyclerView recyclerViewL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


    }


    @Override
    public void ShowRecyclerV(InformacionCharacters modelosRickyMortyArrayList) {

    }


}