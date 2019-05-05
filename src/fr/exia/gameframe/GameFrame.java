package fr.exia.gameframe;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class GameFrame extends JFrame implements KeyListener {

    private KeyListener keyListener;
    private IEventPerformer performer;
    private String title;
    private IGraphicsBuilder graphicsBuilder;

    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable) {

        this.performer = performer;
        this.title = title;
        this.graphicsBuilder = graphicsBuilder;

    }

    public void keyPressed(KeyEvent keyEvent) {

    }

    public void keyReleased(KeyEvent keyEvent) {
        this.keyListener = keyListener;
    }

    public void keyTyped(KeyEvent keyEvent) {

    }


}

