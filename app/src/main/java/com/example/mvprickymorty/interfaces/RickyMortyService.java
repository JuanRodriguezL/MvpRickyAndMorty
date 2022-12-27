package com.example.mvprickymorty.interfaces;

import com.example.mvprickymorty.modelos.InformacionCharacters;
import com.example.mvprickymorty.modelos.InformacionEpisodes;
import com.example.mvprickymorty.modelos.InformationLocation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RickyMortyService {

    @GET("api/character")
    Call<InformacionCharacters> getCharacterList(@Query("page") int pages);

    @GET("api/location")
    Call<InformationLocation> getLocationList();


    @GET("api/episode")
    Call<InformacionEpisodes> getEpisodeList();

}
