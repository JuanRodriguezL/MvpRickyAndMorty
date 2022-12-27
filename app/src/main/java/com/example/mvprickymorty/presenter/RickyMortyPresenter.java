package com.example.mvprickymorty.presenter;

import com.example.mvprickymorty.interfaces.personajes.ImvpCharacters;
import com.example.mvprickymorty.model.RickyMortyModel;
import com.example.mvprickymorty.modelos.InformacionCharacters;

public class RickyMortyPresenter implements ImvpCharacters.Presenter{
    private ImvpCharacters.View viewC;
    private ImvpCharacters.Model modelC;

    public RickyMortyPresenter(ImvpCharacters.View viewI) {
        this.viewC = viewI;
        modelC = new RickyMortyModel(this);
    }

    @Override
    public void ShowRecyclerP(InformacionCharacters modelosRickyMortyArrayList) {
        if(viewC !=null){
            viewC.ShowRecyclerV(modelosRickyMortyArrayList);
        }

    }

    @Override
    public void consultarListaPersonajes(int pageNum) {
        if(modelC !=null){
            modelC.consultarListaPersonajes(pageNum);
        }
    }


}
