package Chapter7.Exercises4.application;

import Chapter7.Exercises4.dao.CurrencyDao;
import Chapter7.Exercises4.entity.Currency;

public class CurrencyApp {
    public static void main(String[] args) {

        CurrencyDao currencyDao = new CurrencyDao();

        currencyDao.persist(new Currency("EUR", 0.95));
        currencyDao.persist(new Currency("USD", 1));

        Currency cur = currencyDao.find(1);
        System.out.println(cur.getCurrency() + " " + cur.getRate());
    }
}
