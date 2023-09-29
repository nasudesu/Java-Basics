package Chapter6.Exercise3.model;

import javafx.scene.image.Image;

public class Pet {
    double locationY;
    double locationX;
    Image javaMascot;

    public Pet(double locationY, double locationX) {
        this.locationY = locationY;
        this.locationX = locationX;
        this.javaMascot = new Image("Chapter6/Exercise3/model/java_mascot.png");
    }

    public Image getJavaMascot() {
        return javaMascot;
    }

    public double getLocationY() {
        return locationY;
    }

    public double getLocationX() {
        return locationX;
    }

    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }
}
