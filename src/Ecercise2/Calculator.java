package Ecercise2;

public class Calculator {
    private int value = 0;
    //Method for reseting the value
    public void reset() {
        System.out.println("Resetting the value");
        this.value = 0;
    }
    //Method for adding a value to the value
    //Throw exception if value is negative
    public void add(int value) {
        try {
            if (value < 0) {
                throw new IllegalArgumentException("Value cannot be negative");
            } else {
                this.value += value;
                System.out.println("Value added: " + value);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    //Method for returning the value
    public int getValue() {
        return this.value;
    }
    //Method for calculating sum of two values
    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(-5);
        System.out.println("Current value: "+calculator.getValue());
        System.out.println();

        calculator.reset();
        System.out.println("Current value: "+calculator.getValue());
        System.out.println(calculator.sum(5,5));
    }
}
