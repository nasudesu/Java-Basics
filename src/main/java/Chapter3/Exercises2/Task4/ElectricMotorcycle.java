package Chapter3.Exercises2.Task4;

public class ElectricMotorcycle extends AbstractVehicle {
    String color;
    ElectricMotorcycle(String type, String fuel, String color){
        super(type,fuel);
        this.color = color;
    }
    @Override
    public void charge() {
        System.out.println("ElectricVehicle is charging");
    }
    @Override
    public void start() {
        System.out.println("ElectricVehicle is starting...");
    }
    @Override
    public void stop() {
        System.out.println("ElectricVehicle is stopping..");
    }
    @Override
    public void getInfo() {
        System.out.println("ElectricVehicle info:\nType: "+this.type+"\nFuel: "+this.fuel+"\nColor: "+this.color);
    }

    @Override
    public void calculateFuelEfficiency(Double distanceKilometers, Double fuelLiters) {

    }
}
