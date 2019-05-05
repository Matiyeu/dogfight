package fr.exia.dogfight.ihm;

import fr.exia.dogfight.controller.IOrderPerformer;
import fr.exia.dogfight.model.IDogfightModel;

import java.awt.event.KeyEvent;
import java.lang.*;
import java.util.Observable;

public class DogfightView implements Runnable, IViewSystem {

    private IOrderPerformer orderPerformer;
    private  IDogfightModel dogfightModel;


    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
        this.orderPerformer = orderPerformer;
        this.dogfightModel = dogfightModel;
    }

    @Override
    public void run() {

    }

    public void displayMessage(String message) {

    }

    @Override
    public void closeAll() {

    }

}
