package fr.exia.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {

    @Override
    public IArea getArea() {
        return null;
    }

    @Override
    public void buildArea(Dimension dimension) {

    }

    @Override
    public void addMobile(IMobile Mobile) {

    }

    @Override
    public void removeMobile(IMobile Mobile) {

    }

    @Override
    public ArrayList<IMobile> getMobile() {
        return null;
    }

    @Override
    public IMobile getMobileByPlayer(int player) {
        return null;
    }

    @Override
    public void setMobilesHavesMoved() {

    }
}
