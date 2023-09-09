package Chapter3.Exercises2.Task1;


public class Bus implements Vehicle {
    String type;
    String fuel;
    String capacity;
    Bus(String type, String fuel, String capacity){
        this.type = type;
        this.fuel = fuel;
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

}
