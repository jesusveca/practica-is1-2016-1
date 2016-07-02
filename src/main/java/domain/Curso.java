package domain;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import java.util.List;
@Entity
public class Curso implements BaseEntity<Long> {
	@Id
	@SequenceGenerator(name = "curso_id_generator", sequenceName = "curso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_id_generator")
	private Long id;
	@Column
	public String codigo;
	@Column(length=50)
	public String nombre;
	@Column(length=1)
	private Integer creditos;
	@ManyToOne
	private Curso idPrerequsito;
	@OneToMany(mappedBy = "idPrerequsito")
	private List<Curso> prerequisitos;
	@OneToMany(mappedBy ="curso")
	private Collection<Matricula> matriculas;
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public List<Curso> getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(List<Curso> prerequisitos) {
		this.prerequisitos = prerequisitos;
	}

}
