package Chapter8.Exercises1.Task2;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 8, 20, 15, 3, 12);

        numbers.forEach((number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }));

        System.out.println("--------------------------------------------------");

        numbers.forEach((number -> {
            if (number % 2 != 0) {
                System.out.println(number*2);
            }
        }));

        System.out.println("--------------------------------------------------");
        ;
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());

        System.out.println("--------------------------------------------------");
    }
}
