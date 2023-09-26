package Chapter1.Exersice4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Size of the array: ");
        int array_size = scanner.nextInt();

        int[] intengers = new int[array_size];

        for (int i = 0; i <= array_size-1; i++) {
            System.out.printf("Enter the integer: ");
            intengers[i] = scanner.nextInt();
        }
        System.out.println("Maximum sum:" + maxSubArraySum(intengers));

    }
    static int maxSubArraySum(int[] a) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}


