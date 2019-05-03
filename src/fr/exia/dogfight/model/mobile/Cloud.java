package fr.exia.dogfight.model.mobile;

import fr.exia.dogfight.model.Dimension;
import fr.exia.dogfight.model.Direction;
import fr.exia.dogfight.model.Mobile;
import fr.exia.dogfight.model.Point;

public class Cloud extends Mobile {
    public Cloud(Point position, Direction direction, Dimension dimension, int speed, String imageName) {
        super(position, direction, dimension, speed, imageName);
    }
}
