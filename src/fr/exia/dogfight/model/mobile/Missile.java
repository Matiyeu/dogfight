package fr.exia.dogfight.model.mobile;

import fr.exia.dogfight.model.Dimension;
import fr.exia.dogfight.model.Direction;
import fr.exia.dogfight.model.Mobile;
import fr.exia.dogfight.model.Position;

public class Missile extends Mobile {

    private static final int SPEED = 4;
    private static final int WIDTH = 30;
    private static final int HEIGHT = 10;
    private static final int MAX_DISTANCE_TRAVELED = 1400;
    private static final String IMAGE = "missile";
    private int distanceTraveled = 0;


    public Missile(Direction direction, Dimension dimension) {
        super(direction, null, dimension, SPEED, IMAGE);
    }

    public int getWidthWithADirection(Direction direction) {
        return 0; // TODO
    }

    public int getHeightWithADirection(Direction direction) {
        return 0; // TODO
    }

    public void move() { //TODO

    }

    public boolean isWeapon() {
        return true;
    }

}
