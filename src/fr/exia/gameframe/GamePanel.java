package fr.exia.gameframe;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GamePanel extends JPanel implements Observer {

    private Observable observable;
    private IGraphicsBuilder iGraphicsBuilder;

    public GamePanel(IGraphicsBuilder graphicsBuilder) {
        iGraphicsBuilder = graphicsBuilder;
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    public void paintComponent(Graphics graphics) {

    }

}
