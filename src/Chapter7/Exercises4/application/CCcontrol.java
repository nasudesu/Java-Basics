package Chapter7.Exercises4.application;

import Chapter7.Exercises4.dao.CurrencyDao;
import Chapter7.Exercises4.entity.CurrencyConverGUI;
import Chapter7.Exercises4.entity.CurrencyConvert;

public class CCcontrol {

    CurrencyConvert currencyConvert;
    CurrencyConverGUI currencyConverGUI;
    CurrencyDao currencyDao;
    public CCcontrol(CurrencyConverGUI currencyConverGUI) {
        this.currencyConverGUI = currencyConverGUI;
        this.currencyConvert = new CurrencyConvert("","");
        this.currencyDao = new CurrencyDao();
    }

    public double convertValue(){
        return currencyConvert.convert();
    }

    public void addCurrency() {
        for (int i = 0; i < currencyDao.getAll().size(); i++) {
            currencyConvert.addCurrency(currencyDao.getAll().get(i).getCurrency(), currencyDao.getAll().get(i).getRate());
        }
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
