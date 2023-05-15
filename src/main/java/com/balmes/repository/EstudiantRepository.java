package com.balmes.repository;

import com.balmes.model.Curs;
import com.balmes.model.Estudiant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EstudiantRepository implements CrudRepository<Estudiant> {

  public List<Estudiant> findAll() {
    // TODO Auto-generated method stub
    List<Estudiant> estudiantList = new ArrayList<>();
    CursRepository cursRepository = new CursRepository();
    final List<Curs> allCursos = cursRepository.findAll();
    estudiantList.add(new Estudiant(1, "Alex", "Cunillera", allCursos.get(0)));
    estudiantList.add(new Estudiant(2, "Eduardo", "Martorell", allCursos.get(1)));
    estudiantList.add(new Estudiant(3, "Noemi", "Valenzuela", allCursos.get(2)));
    estudiantList.add(new Estudiant(4, "Marina", "Moreno", allCursos.get(0)));
    estudiantList.add(new Estudiant(5, "Miguel", "Urdaneta", allCursos.get(1)));
    estudiantList.add(new Estudiant(6, "Pol", "Carne", allCursos.get(2)));
    estudiantList.add(new Estudiant(7, "Alicia", "Sanz", allCursos.get(0)));
    estudiantList.add(new Estudiant(8, "Esther", "Diez", allCursos.get(1)));
    estudiantList.add(new Estudiant(9, "Kevin", "Serres", allCursos.get(2)));
    estudiantList.add(new Estudiant(10, "Marco", "Laureano", allCursos.get(0)));
    return estudiantList;
  }

  public List<Estudiant> getEstudiantsperCurs(int cursId) {
    List<Estudiant> estudiantList = findAll();
    List<Estudiant> estudiantsPerCurs = new ArrayList<>();

    for (Estudiant estudiant : estudiantList) {
      if (estudiant.getCurs().getCursId() == cursId) {
        estudiantsPerCurs.add(estudiant);
      }
    }

    return estudiantsPerCurs;

  }
}
