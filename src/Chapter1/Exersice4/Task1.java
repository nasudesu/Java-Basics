package Chapter1.Exersice4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] names = {"Nasim", "Saku", "Kimi", "Kasper", "Aapo", "Sami"};
        String[] l_names = {"Zouneibiri", "Tuomennoro", "Taskinen", "Tamm", "Salminen", "Mattila"};

        System.out.println("How many names you want to generate? ");
        int numofnames = scanner.nextInt();

        for (int i = 1; i <= numofnames; i++) {
            int ran1 = random.nextInt(6);
            int ran2 = random.nextInt(6);
            System.out.println(i + ". " + names[ran1] + " " + l_names[ran2]);
        }
    }
}
