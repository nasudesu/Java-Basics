package Chapter3.Exercises2.Task4;

public class ElectricCar extends AbstractVehicle {
    String color;
    ElectricCar(String type, String fuel, String color){
        super(type,fuel);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("ElectricCar is charging");
    }

    @Override
    public void start() {
        System.out.println("ElectricCar is starting...");
    }
    @Override
    public void stop() {
        System.out.println("ElectricCar is stopping..");
    }

    @Override
    public void getInfo() {
        System.out.println("ElectricCar info:\nType: "+this.type+"\nFuel: "+this.fuel+"\nColor: "+this.color);
    }

}
