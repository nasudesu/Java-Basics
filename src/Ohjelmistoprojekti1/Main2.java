package Ohjelmistoprojekti1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Customerservise customerservise = new Customerservise();

        System.out.println("How many customers:");
        int customers = scanner.nextInt();
        for (int i = 0; i < customers; i++) {
            customerservise.putInqueue();
        }
        for (int i = 0; i < customers; i++) {
            customerservise.serve();
            customerservise.removeFromqueue();
        }

        System.out.println("Average serving time: " + customerservise.getAverage()/customers + "Sec");








    }
}
