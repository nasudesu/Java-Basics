package Chapter3.Exercises2.Task4;

public class VehicleDemo {
    public static void main(String[] args) {

        Car car = new Car("Car","Petrol","Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle","Gasoline","Black");
        Bus bus = new Bus("Bus","Diesel","40");

        System.out.println("Car fuel efficiency: "+car.calculateFuelEfficiency(200,15)+" Km/L");
        System.out.println("Motorcycle fuel efficiency: "+motorcycle.calculateFuelEfficiency(150,15)+" Km/L");
        System.out.println("Bus fuel efficiency: "+bus.calculateFuelEfficiency(100,15)+" Km/L");





    }
}
