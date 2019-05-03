package fr.exia.gameframe;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class GameFrame extends JFrame implements KeyListener {

    private KeyListener keyListener;
    private IEventPerformer iEventPerformer;

    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable) {
        iEventPerformer = performer;
    }

    public void keyPressed(KeyEvent keyEvent) {

    }

    public void keyReleased(KeyEvent keyEvent) {

    }

    public void keyTyped(KeyEvent keyEvent) {

    }


    public GameFrame(KeyListener nomKeyListener) {
        keyListener = nomKeyListener;
    }


}

