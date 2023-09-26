package Chapter3.Exercises4.Task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Task2 {

    public static void main(String[] args) {

        long a = 0,b = 1,total;
        try (Writer writer = new FileWriter("fibo.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (int i = 0; i < 100; i++) {
                total = a + b;
                a = b;
                b = total;
                String totalString = ""+total;
                bufferedWriter.write(totalString);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
