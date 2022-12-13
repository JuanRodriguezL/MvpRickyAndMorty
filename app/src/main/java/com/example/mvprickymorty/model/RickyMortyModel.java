package com.example.mvprickymorty.model;

import android.content.Context;

import com.example.mvprickymorty.adapter.RickyMortyAdapter;
import com.example.mvprickymorty.interfaces.personajes.ImvpCharacters;
import com.example.mvprickymorty.interfaces.RickyMortyService;
import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.modelos.InformationLocation;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RickyMortyModel implements ImvpCharacters.Model {



    InformacionCharacters informacionCharacters;
    InformationLocation informationLocation;

    private ImvpCharacters.Presenter presenter;


    public RickyMortyModel(ImvpCharacters.Presenter presenterP) {
        this.presenter = presenterP;


    }

    @Override
    public void consultarListaPersonajes() {
        informacionCharacters = new InformacionCharacters();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        RickyMortyService rickyMortyService = retrofit.create(RickyMortyService.class);
        Call<InformacionCharacters> call = rickyMortyService.getCharacterList();
        call.enqueue(new Callback<InformacionCharacters>() {
            @Override
            public void onResponse(Call<InformacionCharacters> call, Response<InformacionCharacters> response) {
                informacionCharacters = response.body();
                presenter.ShowRecyclerP(informacionCharacters);



            }

            @Override
            public void onFailure(Call<InformacionCharacters> call, Throwable t) {
                System.out.println("juan");
            }
        });


    }


    public void consultarListaLocation() {
        informationLocation = new InformationLocation();
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RickyMortyService rickyMortyService = retrofit.create(RickyMortyService.class);
     Call<InformationLocation> call = rickyMortyService.getLocationList();
     call.enqueue(new Callback<InformationLocation>() {
         @Override
         public void onResponse(Call<InformationLocation> call, Response<InformationLocation> response) {
             informationLocation = response.body();


         }

         @Override
         public void onFailure(Call<InformationLocation> call, Throwable t) {

         }
     });


    }
}