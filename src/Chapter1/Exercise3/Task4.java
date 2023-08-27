package Chapter1.Exercise3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = 1;
        int score = 0;

        do {
            int ran1 = random.nextInt(10)+1;
            int ran2 = random.nextInt(10)+1;
            System.out.printf("%d. What is %d * %d = ?", number, ran1, ran2);
            int answear = scanner.nextInt();
            if (answear == ran1 * ran2) {
                score += 1;
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
            }
            System.out.println();
            if (score == 10) {
                System.out.println("Congratulations primary schooler. your score: " + score);
            }
            number += 1;
        } while (number != 11);
        if (score < 10) {
            System.out.println("Try againL...");
        }
    }
}
