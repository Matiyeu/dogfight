package fr.exia.dogfight.model;


import java.awt.*;

public class Mobile implements IMobile {

    private Image image;

    private Point position;
    private Direction direction;
    private Dimension dimension;
    private int speed;
    private String imageName;

    public Mobile(Point position, Direction direction, Dimension dimension, int speed, String imageName) {
        this.position = position;
        this.direction = direction;
        this.dimension = dimension;
        this.speed = speed;
        this.imageName = imageName;
    }

    public Image getImage() {
        return image;
    }

    @Override
    public void move() {

    }

    @Override
    public void placeInArea(IArea area) {

    }

    @Override
    public boolean isPlayer(int player) {
        return false;
    }

    @Override
    public void setDogfightModel(DogfightModel dogfightModel) {

    }

    @Override
    public boolean hit() {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
