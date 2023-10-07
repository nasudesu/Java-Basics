package Chapter7.Exercises3and4.dao;

import Chapter7.Exercises3and4.datasource.MariaDbJpaConnection;
import Chapter7.Exercises3and4.entity.Transaction;
import jakarta.persistence.EntityManager;

public class TransactionDao {
    public void persist(Transaction transaction) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }
}
