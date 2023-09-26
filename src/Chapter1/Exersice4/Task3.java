package Chapter1.Exersice4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the size of an array: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Enter integer: ");
            array1[i] = scanner.nextInt();
        }

        int newArraySize = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newArraySize; j++) {
                if (array1[i] == array2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array2[newArraySize] = array1[i];
                newArraySize++;
            }
        }

        System.out.println("The array without duplicates: ");
        for (int i = 0; i < newArraySize; i++) {
            System.out.printf("%d ", array2[i]);
        }
    }
}

