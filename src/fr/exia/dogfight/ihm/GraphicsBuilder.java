package fr.exia.dogfight.ihm;

import fr.exia.dogfight.model.IDogfightModel;
import fr.exia.gameframe.IGraphicsBuilder;

import java.awt.*;
import java.util.Observable;

public class GraphicsBuilder implements IGraphicsBuilder {

    public GraphicsBuilder(IDogfightModel dogfightModel) {

    }

    @Override
    public void applyModelToGraphic(Graphics graphics, Observable observable) {


    }

    @Override
    public int getGlobalWidth() {
        return 0;
    }

    @Override
    public int getGlobalHeight() {
        return 0;
    }
}
