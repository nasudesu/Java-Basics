package Ohjemistoprojekti2;

import Ohjelmistoprojekti1.Customer;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Eventlist eventlist = new Eventlist();
        boolean stopper = true;

        do {
            System.out.println("Add Event: 1 Remove Event: 2 Show events: 3 Stop: 4");
            int button = scanner.nextInt();
            if (button == 1) {
                eventlist.setEvent();
            } else if (button == 2) {
                eventlist.removeEvent();
            } else if (button == 3) {
                eventlist.getEvents();
            } else if (button == 4) {
                stopper = false;
            }
            System.out.println();
            eventlist.checkIfempty();
        } while (stopper);
    }

}
