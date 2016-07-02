//package repository;
//
//public class AlumnoRepository {
//
//}



package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import domain.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
	List<Alumno> findAll();
}
