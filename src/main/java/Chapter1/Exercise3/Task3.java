package Chapter1.Exercise3;

import java.util.Scanner;

public class Task3 {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter positive intenger start");
        int start = scanner.nextInt();
        System.out.println("Enter positive intenger end");
        int end = scanner.nextInt();


        for (int i = end; i <= start; i++) {
            if (isPrime(i)) {
                System.out.println("The number " + i + " is prime number");
            } else {
                System.out.println("The number " + i + " is not prime number");
            }
        }
    }
}

