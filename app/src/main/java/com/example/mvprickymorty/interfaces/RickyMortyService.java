package com.example.mvprickymorty.interfaces;

import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.modelos.InformationLocation;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RickyMortyService {

    @GET("api/character")
    Call<InformacionCharacters> getCharacterList();

    @GET("api/location")
    Call<InformationLocation> getLocationList();


    @GET("api/episode")
    Call<InformacionCharacters> getEpisodeList();

}
