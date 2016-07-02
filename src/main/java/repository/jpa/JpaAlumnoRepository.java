package repository.jpa;

import org.springframework.stereotype.Repository;

import repository.AlumnoRepository;
import domain.Alumno;

@Repository
public class JpaAlumnoRepository extends JpaBaseRepository<Alumno, Long> implements
		AlumnoRepository {
}
