package Chapter3.Exercises2.Task2;

abstract class AbstractVehicle implements Vehicle{
    String type;
    String fuel;

    AbstractVehicle(String type,String fuel){
        this.type = type;
        this.fuel = fuel;
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
