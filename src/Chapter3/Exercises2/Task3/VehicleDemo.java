package Chapter3.Exercises2.Task3;
public class VehicleDemo {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar("ElectricCar","Battery","Yellow");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("ElectricMotorcycle","Battery","White");

        System.out.println();
        electricCar.charge();
        electricCar.start();
        electricCar.stop();
        electricCar.getInfo();
        System.out.println();
        electricMotorcycle.charge();
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.getInfo();




    }
}
