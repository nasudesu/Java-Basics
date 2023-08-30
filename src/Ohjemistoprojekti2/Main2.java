package Ohjemistoprojekti2;

import Ohjelmistoprojekti1.Customer;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Eventlist eventlist = new Eventlist();
        boolean empy = true;

        do {
            System.out.println("Add Event Press: 1 Remove Event Press: 2 Stop program: 3");
            int add = scanner.nextInt();
            if (add == 1) {

            } else if (add == 2) {

            } else if (add == 3) {
                empy = false;
            }
        } while (empy);
    }

}
