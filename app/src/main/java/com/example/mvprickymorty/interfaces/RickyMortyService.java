package com.example.mvprickymorty.interfaces;

import com.example.mvprickymorty.modelos.InformacionRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RickyMortyService {

    @GET("api/character")
    Call<InformacionRespuesta> getCharacterList();

}
