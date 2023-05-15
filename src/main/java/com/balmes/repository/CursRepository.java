package com.balmes.repository;

import com.balmes.model.Curs;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CursRepository implements CrudRepository<Curs> {

  public List<Curs> findAll() {
    // TODO Auto-generated method stub
    List<Curs> cursos = new ArrayList<Curs>();

//instancio dos cursos i els afegir� a la llista
    Curs accesADades = new Curs(1, "Modul 6", "Acces a dades",
                                "https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m06_/web/fp_dam_m06_htmlindex/index.html");

    Curs programacioMultimedia = new Curs(2, "Modul 8", "Programacio Multimedia",
                                          "https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m08_/web/fp_dam_m08_htmlindex/index.html");

    Curs interficies = new Curs(3, "Modul 7", "Disseny i implementació d'interfícies",
            "https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m07_/web/fp_dam_m07_htmlindex/index.html");

    cursos.add(accesADades);
    cursos.add(programacioMultimedia);
    cursos.add(interficies);

    return cursos;
  }
}
