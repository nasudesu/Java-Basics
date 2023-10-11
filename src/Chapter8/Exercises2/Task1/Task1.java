package Chapter8.Exercises2.Task1;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 5, 8, 20, 15, 3, 12);
        int mean = numbers.stream().mapToInt(Integer::intValue).sum() / numbers.size();
        System.out.println(mean);

    }
}
