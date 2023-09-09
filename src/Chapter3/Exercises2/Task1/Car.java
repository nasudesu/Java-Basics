package Chapter3.Exercises2.Task1;


public class Car implements Vehicle {
    String type;
    String fuel;
    String color;
    Car(String type, String fuel, String color){
        this.type = type;
        this.fuel = fuel;
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
}
