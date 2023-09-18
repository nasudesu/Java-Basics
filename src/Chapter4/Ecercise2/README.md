### Calculator class

Idea: Creating a calculator class with methods for adding, reseting and summing values.


```Java
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
```
Explanation: The calculator class has a private variable value,
which is set to 0. The class has four methods: reset, add, getValue and sum.
The reset method sets the value to 0.
The add method adds a value to the value variable except
if value is negative integer then we throw exception that
prints message rather than adding it.
The getValue method returns the value variable.
The sum method calculates the sum of two values.
The main method creates a new calculator object and calls
the add method with a positive and a negative value.
The main method also calls the reset method and the sum method.
