package Chapter1.Exercise1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        float first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        float second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        float third = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The average of the numbers is " + ((first + second + third)/3));
        System.out.println("The product of the numbers is " + (first * second * third));
        /*
        * The average of numbers 4 because the variable type of asked numbers was "int"
        * I changed all to float, and then it works :)
         */

    }
}