package Chapter1.Exercise3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficient A");
        double coefficient_A = scanner.nextInt();
        System.out.println("Enter the coefficient B");
        double coefficient_B = scanner.nextInt();
        System.out.println("Enter the coefficient C");
        double coefficient_C = scanner.nextInt();

        double Discriminant = Math.sqrt(Math.pow(coefficient_B, 2) - (4 * coefficient_A * coefficient_C));
        double Positive_root = (- coefficient_B + Discriminant) / 2 * coefficient_A;
        double Negative_root = (- coefficient_B - Discriminant) / 2 * coefficient_A;

        if (Discriminant > 0) {
            System.out.println("Positive Discriminant");
            System.out.printf("Root1: %.2f Root2: %.2f",Positive_root, Negative_root);
        } else if (Discriminant == 0) {
            double root = - coefficient_B / 2 * coefficient_A;
            System.out.printf("One Root: %.2f", root);
        } else {
            System.out.println("No real roots");
        }
    }
}
