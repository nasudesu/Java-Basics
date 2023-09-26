package Chapter3.Exercises1.Task2;

import Chapter3.Exercises1.Task1.Car;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Car {
    List<Integer> passengers;
    Bus(String typeName, int tank_capacity, int top_speed){
        super(typeName, tank_capacity, top_speed);
        this.passengers =  new ArrayList<>();
    }
    void passengerEnter(int passenger){
        for (int i = 1; i < passenger+1; i++) {
            passengers.add(i);
            System.out.println(i+" Passenger entered Bus");
        }
    }
    void passengerExit(){
        passengers.clear();
        System.out.println("All passengers exited");
    }
    int displayPassengers(){
        return passengers.size();
    }

    public static void main(String[] args) {
        Bus bus = new Bus("OnniBus",200,200);

        bus.passengerEnter(5);
        bus.passengerExit();
        System.out.println(bus.displayPassengers());
    }
}
