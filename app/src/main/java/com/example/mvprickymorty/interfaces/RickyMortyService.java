package com.example.mvprickymorty.interfaces;

import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.modelos.InformacionEpisodes;
import com.example.mvprickymorty.modelos.InformationLocation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RickyMortyService {

    @GET("api/character")
    Call<InformacionCharacters> getCharacterList();

    @GET("api/location")
    Call<InformationLocation> getLocationList();


    @GET("api/episode")
    Call<InformacionEpisodes> getEpisodeList();

    @GET("api/character")
    Call<InformacionCharacters> getPages(@Query("page") int pages);

}
