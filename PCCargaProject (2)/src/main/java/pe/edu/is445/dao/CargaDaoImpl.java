package pe.edu.is445.dao;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pe.edu.is445.entities.CargaAcademica;

@Transactional
@Repository
public class CargaDaoImpl implements CargaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<CargaAcademica> listar() {
        return entityManager.createQuery("FROM CargaAcademica ca").getResultList();
    }

    @Override
    public List<CargaAcademica> listarHora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
