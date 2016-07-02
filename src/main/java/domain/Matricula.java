//package domain;
//
//public class Matricula implements BaseEntity<Long> {
//	private Long id;
//
//	private Curso curso;
//
//	private Alumno alumno;
//
//	private Double nota;
//
//	private String semestre;
//
//	@Override
//	public Long getId() {
//		return id;
//	}
//
//	@Override
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Curso getCurso() {
//		return curso;
//	}
//
//	public void setCurso(Curso curso) {
//		this.curso = curso;
//	}
//
//	public Alumno getAlumno() {
//		return alumno;
//	}
//
//	public void setAlumno(Alumno alumno) {
//		this.alumno = alumno;
//	}
//
//	public Double getNota() {
//		return nota;
//	}
//
//	public void setNota(Double nota) {
//		this.nota = nota;
//	}
//
//	public String getSemestre() {
//		return semestre;
//	}
//
//	public void setSemestre(String semestre) {
//		this.semestre = semestre;
//	}
//
//}


package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Matricula {
	@Id
	@SequenceGenerator(name = "Matricula_ID_GENERATOR", sequenceName = "Matricula_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Matricula_ID_GENERATOR")
	public Integer id;
	public Integer alumno_codigo;
	public Integer curso_codigo;
	
	
	
	
	
	public Matricula(){ }
	public Matricula(Integer alumno_codigo, Integer curso_codigo) {
		this.alumno_codigo = alumno_codigo;
		this.curso_codigo = curso_codigo;
	}
}
