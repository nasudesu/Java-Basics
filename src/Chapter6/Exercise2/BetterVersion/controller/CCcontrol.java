package Chapter6.Exercise2.BetterVersion.controller;

import Chapter6.Exercise2.BetterVersion.model.CurrencyConvert;
import Chapter6.Exercise2.BetterVersion.view.CurrencyConverGUI;


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
