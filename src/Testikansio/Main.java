package Testikansio;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<String, Double> currency = new HashMap<>();
        currency.put("USD", 1.0);
        currency.put("EUR", 0.95);
        currency.put("GBP", 0.83);
        currency.put("JPY", 149.68);
        currency.put("CNY", 7.21);
        currency.put("CAD", 1.37);
        currency.put("CHF", 0.92);
        currency.put("AUD", 1.58);

        System.out.println("Give a value to convert from");
        String input1 = input.nextLine();
        System.out.println("Give a value to convert to");
        String input2 = input.nextLine();
        System.out.println("Give a value");
        double inputvalue = input.nextDouble();

        System.out.println("Converted value is " + inputvalue * currency.get(input2) / currency.get(input1) );


    }
}
