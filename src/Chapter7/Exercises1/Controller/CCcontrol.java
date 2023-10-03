package Chapter7.Exercises1.Controller;

import Chapter7.Exercises1.Model.CurrencyConvert;
import Chapter7.Exercises1.View.CurrencyConverGUI;

public class CCcontrol {

    CurrencyConvert currencyConvert;
    CurrencyConverGUI currencyConverGUI;

    public CCcontrol(CurrencyConverGUI currencyConverGUI) {
        this.currencyConverGUI = currencyConverGUI;
        this.currencyConvert = new CurrencyConvert(0,0,"","");
    }

    public void setAmount1(double amount1){
        currencyConvert.setAmout1(amount1);
    }

    public void setCurrencyType1(String currencyType1){
        currencyConvert.setCurrencyType1(currencyType1);
    }

    public void setCurrencyType2(String currencyType2){
        currencyConvert.setCurrencyType2(currencyType2);
    }

    public double convertValue(double value1, String type1, String type2){
        switch (type1){
            case "EUR":
                switch (type2){
                    case "EUR":
                        return value1;
                    case "USD":
                        return value1 * 1.18;
                    case "GBP":
                        return value1 * 0.86;
                }
            case "USD":
                switch (type2){
                    case "EUR":
                        return value1 * 0.85;
                    case "USD":
                        return value1;
                    case "GBP":
                        return value1 * 0.73;
                }
            case "GBP":
                switch (type2){
                    case "EUR":
                        return value1 * 1.16;
                    case "USD":
                        return value1 * 1.37;
                    case "GBP":
                        return value1;
                }
        }
        return 0;
    }
    public String getCurrencyType1(){
        return currencyConvert.getCurrencyType1();
    }
    public String getCurrencyType2(){
        return currencyConvert.getCurrencyType2();
    }

    public static void main(String[] args) {
        CurrencyConverGUI.launch(CurrencyConverGUI.class);
    }
}
