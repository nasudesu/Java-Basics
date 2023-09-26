package Chapter1.Exercise2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit");
        double fahrenheit = scanner.nextDouble();
        double celsius = ((fahrenheit-32)*5)/9;
        System.out.printf("%.1f Fahrenheit in celsus are %.1f", fahrenheit, celsius);

    }
}
