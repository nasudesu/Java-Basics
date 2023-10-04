package Chapter7.Exercises4.application;

import Chapter7.Exercises4.datasource.MariaDbJpaConnection;
import Chapter7.Exercises4.entity.CurrencyConverGUI;
import Chapter7.Exercises4.entity.CurrencyConvert;

public class CCcontrol {

    CurrencyConvert currencyConvert;
    CurrencyConverGUI currencyConverGUI;

    public CCcontrol(CurrencyConverGUI currencyConverGUI) {
        this.currencyConverGUI = currencyConverGUI;
        this.currencyConvert = new CurrencyConvert("","");
    }

    public double convertValue(){
        return currencyConvert.convert();
    }

    public void addCurrency(String currencyType, double value) {
        currencyConvert.addCurrency(currencyType, value);
    }

    public void setType1(String type1) {
        currencyConvert.setCurrencyType1(type1);
    }

    public void setType2(String type2) {
        currencyConvert.setCurrencyType2(type2);
    }

    public void setValue(double value) {
        currencyConvert.setValue(value);
    }


    public static void main(String[] args) {
        CurrencyConverGUI.launch(CurrencyConverGUI.class);
    }
}
