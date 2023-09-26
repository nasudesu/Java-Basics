package Chapter5.Exercises2.Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Theater theater = new Theater(20);
        Customer[] customers = new Customer[20];

        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(theater);
            customers[i].start();
        }
    }
}
