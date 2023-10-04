package Chapter7.Exercises4.dao;


import Chapter7.Exercises4.datasource.MariaDbJpaConnection;
import Chapter7.Exercises4.entity.*;
import jakarta.persistence.EntityManager;

public class CurrencyDao {

    public void persist(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public Currency find(int id) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        Currency currency = em.find(Currency.class, id);
        return currency;
    }

    public void update(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency);
        em.getTransaction().commit();
    }

    public void delete(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency);
        em.getTransaction().commit();
    }
}