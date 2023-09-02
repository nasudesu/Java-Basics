package Chapter2.Exercises1;

import Chapter2.Exercises1.Car;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 200, 200);
        myCar.fillTank();

        for(int i = 0; i < 6; i++) {
            myCar.accelerate(10);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.onCruiseControl();
        myCar.accelerate(150);
        myCar.cruiseControl(180);
    }
}
