package Chapter1.Exercise3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiples;

        System.out.println("Enter a binary number (composed of 0s and 1s)");
        String binary_num = scanner.nextLine();
        //int decimal = Integer.parseInt(binary_num, 2);

        int decimal = 0;

        for (int i = 1; i <= binary_num.length(); i++) {
            multiples = (int)Math.pow(2, binary_num.length() - i);
            char b = binary_num.charAt(i-1);
            decimal += Character.getNumericValue(b) * multiples;
            System.out.println(multiples);
        }
        System.out.printf("Binary num %s in decimals is %d", binary_num, decimal);
    }

}
