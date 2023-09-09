package Chapter3.Exercises1.Task1;

public class Car {
    public int tank_capacity, top_speed;
    private float speed, gasolineLevel;
    private String typeName;
    public Car(String typeName, int tank_capacity, int top_speed) {
        this.typeName = typeName;
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        speed = 0; gasolineLevel = 0;
    }
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            System.out.println("Accelerating to: " +speed);
            gasolineLevel -= 10;
        } else {
            System.out.println("Cant accelerate over top speed");
            speed = 0;
        }
    }
    void decelerate() {
        if (gasolineLevel > 0 && speed < this.top_speed) {
            System.out.println();
            speed -= 10;
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
    public static void main(String[] args) {
        Car car = new Car("Toyota",200,200);
        car.fillTank();
        System.out.println(car.getSpeed());
        car.accelerate();
        car.accelerate();
        System.out.println(car.getSpeed());
        System.out.println(car.getGasolineLevel());
        car.decelerate();
        System.out.println(car.getSpeed());
        System.out.println(car.getGasolineLevel());
    }
}
