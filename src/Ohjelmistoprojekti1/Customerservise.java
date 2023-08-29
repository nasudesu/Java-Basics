package Ohjelmistoprojekti1;

import java.util.LinkedList;
import java.util.Random;

public class Customerservise {

    LinkedList<Customer> queue = new LinkedList<>();
    Random random = new Random();
    public double average;
    public double time;
    public double getAverage() {
        return average;
    }
    public void putInqueue() {
        queue.add(new Customer());
    }
    public void removeFromqueue() {

        queue.poll();
    }
    public void serve() throws InterruptedException {
        System.out.println("Serving Customer: " + queue.getFirst().id);
        int ran = random.nextInt(5)+1;
        average += ran;
        time = ran;
        Thread.sleep(ran* 1000L);
        System.out.println("Served customer: " + queue.getFirst().id);
        System.out.println("Serving time: " + time);
        System.out.println();
    }
    public LinkedList<Customer> getQueue() {
        return queue;
    }
}
