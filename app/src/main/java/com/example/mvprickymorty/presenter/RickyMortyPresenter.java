package com.example.mvprickymorty.presenter;

import com.example.mvprickymorty.interfaces.Imvp;
import com.example.mvprickymorty.model.ModelRickyMorty;
import com.example.mvprickymorty.modelos.InformacionRespuesta;

public class RickyMortyPresenter implements Imvp.Presenter {
    private Imvp.View viewL;
    private Imvp.Model modelL;

    public RickyMortyPresenter(Imvp.View viewI) {
        this.viewL = viewI;
        modelL = new ModelRickyMorty(this);
    }

    @Override
    public void ShowRecyclerP(InformacionRespuesta modelosRickyMortyArrayList) {
        if(viewL!=null){
            viewL.ShowRecyclerV(modelosRickyMortyArrayList);
        }

    }

    @Override
    public void consultarListaPersonajes() {
        if(modelL!=null){
            modelL.consultarListaPersonajes();
        }
    }
}
