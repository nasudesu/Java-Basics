package Chapter3.Exercises2.Task4;

public class Motorcycle extends AbstractVehicle {
    String color;
    Motorcycle(String type, String fuel, String color){
        super(type,fuel);
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle info:\nType: "+this.type+"\nFuel: "+this.fuel+"\nColor: "+this.color);
    }
}
