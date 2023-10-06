package Chapter7.Exercises3.datasource;

import jakarta.persistence.*;

public class MariaDbJpaConnection {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getInstance() {
        // you need to add synchronization if you run in a multi-threaded environment

        if (em==null) {
            if (emf==null) {
                emf = Persistence.createEntityManagerFactory("currency");
            }
            em = emf.createEntityManager();
        }
        return em;
    }
}
