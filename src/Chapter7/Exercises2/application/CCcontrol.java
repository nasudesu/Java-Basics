package Chapter7.Exercises2.application;

import Chapter7.Exercises2.dao.CurrencyConvertDao;
import Chapter7.Exercises2.entity.CurrencyConvert;
import Chapter7.Exercises2.entity.CurrencyConverGUI;

public class CCcontrol {

    CurrencyConvert currencyConvert;
    CurrencyConverGUI currencyConverGUI;

    CurrencyConvertDao currencyConvertDao;

    public CCcontrol(CurrencyConverGUI currencyConverGUI) {
        this.currencyConverGUI = currencyConverGUI;
        this.currencyConvert = new CurrencyConvert("","");
        this.currencyConvertDao = new CurrencyConvertDao(this);
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
