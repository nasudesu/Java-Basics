package Chapter8.Exercises2.Task2;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 5, 8, 20, 15, 3, 12);

        System.out.println(numbers.stream().filter(number -> number % 2 == 0).mapToInt(e -> e * 2).sum());


    }
}
