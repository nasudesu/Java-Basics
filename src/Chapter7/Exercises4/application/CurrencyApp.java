package Chapter7.Exercises4.application;

import Chapter7.Exercises4.dao.CurrencyDao;
import Chapter7.Exercises4.entity.Currency;

public class CurrencyApp {
    public static void main(String[] args) {

        CurrencyDao currencyDao = new CurrencyDao();

        Currency currency = currencyDao.find("USD");

        currencyDao.update(new Currency("LOL", 23));

        Currency currency1 = currencyDao.find("LOL");

        System.out.println(currency1.getCurrency() + " " + currency1.getRate());

        System.out.println(currency.getCurrency() + " " + currency.getRate());

        currencyDao.delete(currency1);





    }
}
