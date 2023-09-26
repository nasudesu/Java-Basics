package Chapter3.Exercises2.Task4;

public class Car extends AbstractVehicle {
    String color;
    Car(String type, String fuel, String color){
        super(type,fuel);
        this.color = color;
    }
    @Override
    public void start() {
        System.out.println("car is starting...");
    }
    @Override
    public void stop() {
        System.out.println("car is stopping..");
    }

    @Override
    public void getInfo() {
        System.out.println("Car info:\nType: "+this.type+"\nFuel: "+this.fuel+"\nColor: "+this.color);
    }

    @Override
    public void calculateFuelEfficiency(Double distanceKilometers, Double fuelLiters) {

    }
}
