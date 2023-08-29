package Ohjelmistoprojekti1;

import java.util.LinkedList;
import java.util.Random;

public class Customerservise {

    LinkedList<Customer> queue = new LinkedList<>();
    Random random = new Random();
    public void putInqueue() {
        queue.add(new Customer(System.nanoTime(), System.nanoTime()));
    }
    public void removeFromqueue() {
        queue.poll();
    }
    public void serve() throws InterruptedException {
        System.out.println("Serving Customer" + queue.getFirst().getId());
        int ran = random.nextInt(5)+1;
        Thread.sleep(ran* 1000L);
        System.out.println("Served customer" + queue.getFirst().getId());
    }
    public LinkedList<Customer> getQueue() {
        return queue;
    }
}
