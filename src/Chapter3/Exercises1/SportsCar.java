package Chapter3.Exercises1;

public class SportsCar extends Car{
    private float speed, gasolineLevel;
    SportsCar(String typeName, int tank_capacity, int top_speed){
        super(typeName, tank_capacity, top_speed);
        speed = 0;
        gasolineLevel = 0;
    }
    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 20;
            System.out.println("Accelerating to: " +speed);
            gasolineLevel -= 10;
        } else {
            System.out.println("Cant accelerate over top speed");
            speed = 0;
        }
    }
    @Override
    void decelerate() {
        if (gasolineLevel > 0 && speed < this.top_speed) {
            System.out.println();
            speed -= 20;
        } else
            speed = 0;
    }
    @Override
    void fillTank() {
        gasolineLevel = this.tank_capacity;
    }
    float getSpeed(){
         return  super.getSpeed();
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari",200,200);
        sportsCar.fillTank();
        System.out.println(sportsCar.getGasolineLevel());
        sportsCar.accelerate();
        sportsCar.accelerate();
        System.out.println(sportsCar.getSpeed());
        sportsCar.decelerate();
        System.out.println(sportsCar.getSpeed());


    }
}
