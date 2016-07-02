package domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.SequenceGenerator;

import java.util.List;

@Entity
public class Curso {
	@Id
	@SequenceGenerator(name = "Curso_ID_GENERATOR", sequenceName = "Curso_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Curso_ID_GENERATOR")
	public Integer id_curso;

	public String codigo;
	public String nombre;
	public Integer creditos;
	
	//private List<Curso> prerequisitos;
	
    //@OneToMany(mappedBy = "alumno")
//	private List<Integer> prerequisitos; // integer para	

	

	
	public Curso() {
	}

	public Curso(String codigo, String nombre, Integer creditos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	
	
}
