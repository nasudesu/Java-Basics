package Chapter1.Exercise2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lenght of leg1?");
        double leg1 = scanner.nextDouble();
        System.out.println("Lenght of leg2");
        double leg2 = scanner.nextDouble();
        double hypotenusa = Math.hypot(leg1, leg2);
        System.out.printf("Leg1: %.1f Leg2: %.1f Hypot: %.1f", leg1,leg2, hypotenusa);



    }
}
