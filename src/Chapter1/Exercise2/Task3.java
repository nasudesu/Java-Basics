package Chapter1.Exercise2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight (g):");
        double grams = scanner.nextDouble();

        double luoti = 13.28;
        double naula = (32 * luoti);
        double leiviska = 20 * naula;

        double multi1 = (int)(grams/leiviska);
        double grams_left1 = grams - leiviska * multi1;
        double multi2 = (int)(grams_left1/naula);
        double grams_left2 = grams_left1 - multi2 * naula;
        double multi3 = (grams_left2/luoti);

        System.out.printf("%,.0f grams is %.0f leiviskä, %.0f naula, and %.2f luoti.",grams, multi1, multi2, multi3);


    }
}
