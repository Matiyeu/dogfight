package fr.exia.dogfight.ihm;

import fr.exia.dogfight.model.Dimension;
import fr.exia.dogfight.model.IArea;
import fr.exia.dogfight.model.IDogfightModel;
import fr.exia.dogfight.model.IMobile;
import fr.exia.gameframe.IGraphicsBuilder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;


public class GraphicsBuilder implements IGraphicsBuilder {

private IDogfightModel dogfightModel;
private BufferedImage emptySky;

    public GraphicsBuilder(IDogfightModel dogfightModel) {
        this.dogfightModel = dogfightModel;
    }

    @Override
    public void applyModelToGraphic(Graphics graphics, ImageObserver observable) {

    }

    private void buildEmptySky(){

    }

    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){

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
