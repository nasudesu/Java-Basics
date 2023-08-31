package Chapter2.Exercises1;

public class CoffeeMaker {
    String normalType = "normalType", espressoType = "espressoType";
    String coffeeType;
    int coffeeAmount;
    boolean isOn = false;
    public void setNormalType() {
        if (!isOn) {
            System.out.println("Turn on cofee maker");
        } else {
            this.coffeeType = normalType;
        }
    }
    public void setEspressoType() {
        this.coffeeType = espressoType;
    }
    public void pressOn() {
        System.out.println("Power On");
        this.isOn = true;
    }
    public void pressOff() {
        System.out.println("Power Off");
        this.isOn = false;
    }
    public void setCoffeeAmount(int amount) {
        if (!isOn) {
            System.out.println("Turn on cofee maker");
        } else if (amount > 10 && amount < 80) {
            this.coffeeAmount = amount;
        } else {
            System.out.println("Wrong amount");
        }
    }
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.pressOn();
        coffeeMaker.setNormalType();
        coffeeMaker.setCoffeeAmount(50);
        System.out.println("Coffee type: " +coffeeMaker.coffeeType);
        System.out.println("Coffee amount: " +coffeeMaker.coffeeAmount);
        coffeeMaker.pressOff();
    }
}





