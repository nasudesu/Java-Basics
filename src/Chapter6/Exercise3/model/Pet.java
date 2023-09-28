package Chapter6.Exercise3.model;

public class Pet {
    double locationY;
    double locationX;

    public Pet(double locationY, double locationX) {
        this.locationY = locationY;
        this.locationX = locationX;
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
