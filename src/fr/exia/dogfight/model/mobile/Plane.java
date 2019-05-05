package fr.exia.dogfight.model.mobile;

import fr.exia.dogfight.model.Dimension;
import fr.exia.dogfight.model.Direction;
import fr.exia.dogfight.model.Mobile;
import fr.exia.dogfight.model.Position;

public class Plane extends Mobile {

    private static final int SPEED = 2;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 30;
    private static final String IMAGE = "plane.png"; // TODO
    private int player;

    public Plane(Direction direction, Dimension dimension) {
        super(direction, null, dimension, SPEED, IMAGE);
    }

    public boolean isPlayer(int player) {
        return false;
    }

    public boolean hit() {
        return false;
    }

}
