package com.example.mvprickymorty.model;

import com.example.mvprickymorty.interfaces.RickyMortyService;
import com.example.mvprickymorty.interfaces.location.ImvpLocation;
import com.example.mvprickymorty.modelos.InformationLocation;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LocationModel implements ImvpLocation.Model {

    ImvpLocation.Presenter presenter;
    InformationLocation informationLocation;

    public  LocationModel (ImvpLocation.Presenter presenter){
        this.presenter = presenter;

    }

    @Override
    public void consultarListaLocation() {
        informationLocation = new InformationLocation();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RickyMortyService rickyMortyService = retrofit.create(RickyMortyService.class);
        Call<InformationLocation> call = rickyMortyService.getLocationList();
        call.enqueue(new Callback<InformationLocation>() {
            @Override
            public void onResponse(Call<InformationLocation> call, Response<InformationLocation> response) {
                informationLocation = response.body();
                presenter.ShowRecyclerPLocation(informationLocation);


            }

            @Override
            public void onFailure(Call<InformationLocation> call, Throwable t) {

            }
        });


    }
}
