package Chapter6.Exercise2.BetterVersion.model;

import java.util.HashMap;

public class CurrencyConvert {
    private String currencyType1;
    private String currencyType2;
    double value;
    HashMap<String, Double> currency = new HashMap<>();

    public CurrencyConvert(String currencyType1, String currencyType2) {
        this.currencyType1 = currencyType1;
        this.currencyType2 = currencyType2;
        currency.put("USD", 1.0);
        currency.put("EUR", 0.95);
        currency.put("GBP", 0.83);
        currency.put("JPY", 149.68);
        currency.put("CNY", 7.21);
        currency.put("CAD", 1.37);
        currency.put("CHF", 0.92);
        currency.put("AUD", 1.58);
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
