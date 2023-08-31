package Chapter2.Exercises;
public class Car {
    private int tank_capacity;
    private int top_speed;
    private float speed;
    private float gasolineLevel;
    private String typeName;

    public Car(String typeName, int tank_capacity, int top_speed) {
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
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
}
