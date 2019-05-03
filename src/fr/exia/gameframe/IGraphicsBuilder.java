package fr.exia.gameframe;

import java.awt.*;
import java.util.Observable;

public interface IGraphicsBuilder {

    void applyModelToGraphic(Graphics graphics, Observable observable);

    int getGlobalWidth();

    int getGlobalHeight();
}
