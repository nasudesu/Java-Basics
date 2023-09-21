package Chapter5.Exercises2.Task1;

import java.util.Random;

public class Customer extends Thread {
    private static int customers = 0;
    private int id;
    private int reservedTicket;
    private Theater theater;
    private Random random = new Random();

    Customer(Theater theater) {
        this.theater = theater;
        this.id = ++customers;
    }

    @Override
    public void run() {
        int ticketsToReserve = random.nextInt(3) + 1;
        for (int i = 0; i < ticketsToReserve; i++) {
            if (theater.getTicket()) {
                reservedTicket++;
            }
        }
        if (reservedTicket > 0) {
            System.out.println("Customer: " + id + " reserved: " + reservedTicket + " Tickets");
        } else {
            System.out.println("Customer: " + id + " couldn't reserve Tickets: " + reservedTicket);
        }
    }
}
