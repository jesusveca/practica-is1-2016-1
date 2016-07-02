package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import domain.Matricula;

public interface MatriculaRepository extends CrudRepository<Matricula, String> {
	List<Matricula> findAll();
}