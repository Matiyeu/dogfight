package fr.exia.dogfight.model;

import java.awt.*;


public class Sky implements IArea {

    private Image image;

    private Dimension dimension;

    public Sky(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public Dimension getDimensiont() {
        return null;
    }

    @Override
    public Image getImage() {
        return image;
    }
}
