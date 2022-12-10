package com.example.mvprickymorty.model;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mvprickymorty.adapter.RickyMortyAdapter;
import com.example.mvprickymorty.interfaces.Imvp;
import com.example.mvprickymorty.interfaces.RickyMortyService;
import com.example.mvprickymorty.modelos.InformacionRespuesta;
import com.example.mvprickymorty.modelos.ModelosRickyMorty;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModelRickyMorty implements Imvp.Model {

    Context context;
    RecyclerView recyclerView;

InformacionRespuesta informacionRespuesta;
    RickyMortyAdapter rickyMortyAdapter;
    private Imvp.Presenter presenter;

    public ModelRickyMorty(Imvp.Presenter presenterP) {
        this.presenter = presenterP;


    }


    @Override
    public void consultarListaPersonajes() {
        informacionRespuesta = new InformacionRespuesta();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        RickyMortyService rickyMortyService = retrofit.create(RickyMortyService.class);
        Call<InformacionRespuesta> call = rickyMortyService.getCharacterList();
        call.enqueue(new Callback<InformacionRespuesta>() {
            @Override
            public void onResponse(Call<InformacionRespuesta> call, Response<InformacionRespuesta> response) {
                informacionRespuesta = response.body();
                System.out.println(response);

                presenter.ShowRecyclerP(informacionRespuesta);

                System.out.println(informacionRespuesta.getResults()+"init");

            }

            @Override
            public void onFailure(Call<InformacionRespuesta> call, Throwable t) {
                System.out.println("juan");
            }
        });


    }
}