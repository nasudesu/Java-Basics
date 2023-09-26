package Chapter3.Exercises2.Task2;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Car","Petrol","Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle","Gasoline","Black");
        Bus bus = new Bus("Bus","Diesel","40");

        //Task1
        car.start();
        car.stop();
        car.getInfo();
        System.out.println();
        motorcycle.stop();
        motorcycle.stop();
        motorcycle.getInfo();
        System.out.println();
        bus.start();
        bus.stop();
        bus.getInfo();




    }
}
