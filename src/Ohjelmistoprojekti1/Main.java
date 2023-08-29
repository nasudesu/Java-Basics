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
                list.add(new Customer());
                Customer customer = list.getLast();
                System.out.println("Serving customer: " + customer.id);
            } else if (add == 2) {
                Customer customer = list.poll();
                assert customer != null;
                long end_time = customer.getEnd_time() - customer.getStart_time();
                System.out.println("Served customer: " + customer.id);
                System.out.println("Serving time: " + end_time/1000);
            } else if (add == 3) {
                empy = false;
            }
        } while (empy);
    }
}
