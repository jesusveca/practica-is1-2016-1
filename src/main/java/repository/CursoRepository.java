package repository;

import domain.Curso;

public interface CursoRepository extends BaseRepository<Curso, Long> {
	Curso findByCod(String codigo);
	Curso findByNom(String nombre);
}
