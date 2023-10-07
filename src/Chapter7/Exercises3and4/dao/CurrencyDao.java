package Chapter7.Exercises3and4.dao;


import Chapter7.Exercises3and4.datasource.MariaDbJpaConnection;
import Chapter7.Exercises3and4.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class CurrencyDao {

    public void persist(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public Currency find(String cur) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        Currency currency = em.find(Currency.class, cur);
        return currency;
    }

    public Currency update(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency);
        em.getTransaction().commit();
        return currency;
    }

    public void delete(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency);
        em.getTransaction().commit();
    }

    public List<Currency> getAll() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        TypedQuery<Currency> query = em.createQuery("SELECT c FROM Currency c", Currency.class);
        List<Currency> currencies = query.getResultList();
        return currencies;
    }

    public ObservableList<String> getAllCurrency() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        TypedQuery<Currency> query = em.createQuery("SELECT c FROM Currency c", Currency.class);
        List<Currency> currencies = query.getResultList();
        ObservableList<String> items = FXCollections.observableArrayList();
        for (Currency currency : currencies) {
            items.add(currency.getCurrency());
        }
        return items;
    }
}