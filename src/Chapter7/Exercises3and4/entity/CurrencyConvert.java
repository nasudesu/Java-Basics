package Chapter7.Exercises3and4.entity;

import java.util.HashMap;


public class CurrencyConvert {
    private String currencyType1;
    private String currencyType2;
    private double value;
    private HashMap<String, Double> currency = new HashMap<>();

    public CurrencyConvert(String currencyType1, String currencyType2) {
        this.currencyType1 = currencyType1;
        this.currencyType2 = currencyType2;
    }

    public void addCurrency(String currencyType, double value) {
        currency.put(currencyType, value);
    }

    public void setCurrencyType1(String currencyType1) {
        this.currencyType1 = currencyType1;
    }

    public void setCurrencyType2(String currencyType2) {
        this.currencyType2 = currencyType2;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double convert() {
        return value * currency.get(currencyType2) / currency.get(currencyType1);
    }

}
