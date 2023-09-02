package Chapter2.Exercises1;
public class Car {
    private int tank_capacity;
    private int top_speed;
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private boolean cruiseControl = false;

    public Car(String typeName, int tank_capacity, int top_speed) {
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }
    public void accelerate(int a) {
        if (gasolineLevel > 0 && a < top_speed) {
            speed += a;
            System.out.println("Accelerating to: " +speed);
        } else {
            System.out.println("Cant accelerate over top speed");
            speed = 0;
        }
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0 && speed < this.top_speed) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = this.tank_capacity;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }
    void cruiseControl(int a) {
        if (!cruiseControl) {
            System.out.println("Turn on CC");
        } else if (speed < (float) top_speed / 2) {
            System.out.println("You need to accelerate to use CC");
        } else if (a > top_speed) {
            System.out.println("You can't accelerate over top speed");
        } else if (a < (float) top_speed / 2) {
            System.out.println("You can't decelerate below half of the top speed");
        } else if (a > speed) {
            speed = a;
            System.out.println("Accelerating");
        } else if (a < speed) {
            System.out.println("Decelerating");
            speed = a;
        }
        System.out.println("Current speed: " + speed);
    }

    void onCruiseControl() {
        cruiseControl = true;
    }
    public static void main(String[] args) {
        Car car = new Car("Ferrari",200, 200);
        car.fillTank();
        car.onCruiseControl();
        car.accelerate(150);
        car.cruiseControl(110);
    }
}
