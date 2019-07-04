package pe.edu.is445.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.is445.dao.DocenteDao;
import pe.edu.is445.entities.Docente;

@Controller

public class IndexController {

    @Autowired
    DocenteDao docenteDao;

    @GetMapping(path = {"", "index"})
    public String greeting(Model model) {
        
        List<Docente> items = docenteDao.listar();

        model.addAttribute("items", items);

        return "index";
    }

}
