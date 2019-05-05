package fr.exia.dogfight.model.mobile;

import fr.exia.dogfight.model.Dimension;
import fr.exia.dogfight.model.Direction;
import fr.exia.dogfight.model.Mobile;
import fr.exia.dogfight.model.Position;

public class Cloud extends Mobile {

    private static final int SPEED = 1;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;
    private static final String IMAGE = "cloud";

    public Cloud(Direction direction, Dimension dimension) {
        super(direction, null, dimension, SPEED, IMAGE);
    }
}
