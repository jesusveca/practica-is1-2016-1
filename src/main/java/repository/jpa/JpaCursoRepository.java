package repository.jpa;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import repository.CursoRepository;
import domain.Curso;

@Repository
public class JpaCursoRepository extends JpaBaseRepository<Curso, Long> implements
		CursoRepository {
	public Curso findByCod(String codigo){
		String jpaQuery = "SELECT a FROM Curso a WHERE a.codigo = :codigo";
		TypedQuery<Curso> query = entityManager.createQuery(jpaQuery, Curso.class);
		query.setParameter("codigo", codigo);
		return getFirstResult(query);
	}
	public Curso findByNom(String nombre){
		String jpaQuery = "SELECT a FROM Curso a WHERE a.nombre LIKE :nombre";
		TypedQuery<Curso> query = entityManager.createQuery(jpaQuery, Curso.class);
		query.setParameter("nombre","%" + nombre + "%");
		return getFirstResult(query);
	}
}
