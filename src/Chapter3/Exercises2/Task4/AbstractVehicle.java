package Chapter3.Exercises2.Task4;


abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    String type;
    String fuel;

    AbstractVehicle(String type, String fuel){
        this.type = type;
        this.fuel = fuel;
    }

    @Override
    public double calculateFuelEfficiency(double distanceKilometers, double fuelLiters) {
        return distanceKilometers/fuelLiters;
    }

    @Override
    public void charge() {
        System.out.println("The vehicle is charging");
    }

    @Override
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Vehicle info:\nType: "+this.type+"\nFuel: "+this.fuel);
    }
}
