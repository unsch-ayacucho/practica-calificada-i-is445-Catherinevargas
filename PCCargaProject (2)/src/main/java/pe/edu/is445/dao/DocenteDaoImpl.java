package pe.edu.is445.dao;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pe.edu.is445.entities.Docente;

@Transactional
@Repository
public class DocenteDaoImpl implements DocenteDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Docente> listar() {
        return entityManager.createQuery("FROM Docente d").getResultList();
    }

}
