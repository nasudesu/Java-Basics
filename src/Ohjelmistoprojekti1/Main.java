package Ohjelmistoprojekti1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Customer> list = new LinkedList<>();
        boolean empy = true;

        do {
            System.out.println("Add Press: 1 Remove Press: 2 Stop program: 3");
            int add = scanner.nextInt();
            if (add == 1) {
                list.add(new Customer(System.nanoTime(), System.nanoTime()));
            } else if (add == 2) {
                list.remove();
            } else if (add == 3) {
                while (list.size() > 0) {
                    Customer customer = list.poll();
                    System.out.println("Customer ID: " + customer.id);
                    System.out.println("End time: " + customer.getEnd_time());
                }
                empy = false;
            }
        } while (empy);
    }
}
