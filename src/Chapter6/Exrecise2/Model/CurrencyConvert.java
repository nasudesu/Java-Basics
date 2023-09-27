package Chapter6.Exrecise2.Model;

public class CurrencyConvert {
    private double amout1;
    private double amout2;
    private String currencyType1;
    private String currencyType2;

    public CurrencyConvert(double amout1, double amout2, String currencyType1, String currencyType2) {
        this.amout1 = amout1;
        this.amout2 = amout2;
        this.currencyType1 = currencyType1;
        this.currencyType2 = currencyType2;
    }

    public double getAmout1() {
        return amout1;
    }

    public String getCurrencyType1() {
        return currencyType1;
    }
    public String getCurrencyType2() {
        return currencyType2;
    }
    public void setAmout1(double amout1) {
        this.amout1 = amout1;
    }

    public void setCurrencyType1(String currencyType1) {
        this.currencyType1 = currencyType1;
    }

    public void setCurrencyType2(String currencyType2) {
        this.currencyType2 = currencyType2;
    }
}
