package Chapter3.Exercises2.Task4;

public class Bus extends AbstractVehicle {
    String capacity;
    Bus(String type, String fuel, String capacity){
        super(type, fuel);
        this.capacity = capacity;
    }
    @Override
    public void start() {
        System.out.println("bus is starting...");
    }
    @Override
    public void stop() {
        System.out.println("bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus info:\nType: "+this.type+"\nFuel: "+this.fuel+"\nCapacity: "+this.capacity);
    }

    @Override
    public void calculateFuelEfficiency(Double distanceKilometers, Double fuelLiters) {

    }

}
