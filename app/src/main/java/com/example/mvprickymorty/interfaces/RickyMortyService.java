package com.example.mvprickymorty.interfaces;

import com.example.mvprickymorty.modelos.InformacionRespuesta;
import com.example.mvprickymorty.modelos.ModelosRickyMorty;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RickyMortyService {

    @GET("api/character")
    Call<InformacionRespuesta> getCharacterList();

}
