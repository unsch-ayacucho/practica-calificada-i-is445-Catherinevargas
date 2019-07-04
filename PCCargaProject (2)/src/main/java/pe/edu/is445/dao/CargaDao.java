package pe.edu.is445.dao;

import java.util.List;
import pe.edu.is445.entities.CargaAcademica;

public interface CargaDao {

    List<CargaAcademica> listar();

    List<CargaAcademica> listarHora();
}
