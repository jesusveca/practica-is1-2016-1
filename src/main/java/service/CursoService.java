package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repository.CursoRepository;
import domain.Curso;

@Service
public class CursoService {

	@Autowired
	CursoRepository cursoRepository;

	@Transactional
	public void save(Curso curso) {
		if (curso.getId() == null) {
			cursoRepository.persist(curso);
		} else {
			cursoRepository.merge(curso);
		}
	}

	public Curso get(Long id) {
		return cursoRepository.find(id);
	}
	
	public Curso getCod(String codigo) {
		return cursoRepository.findByCod(codigo);
	}
	public Curso getNom(String nombre) {
		return cursoRepository.findByNom(nombre);
	}
	public Collection<Curso> getAll() {
		return cursoRepository.findAll();
	}
}
