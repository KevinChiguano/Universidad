package com.uce.edu.demo.universidad.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {

	@Id
	@Column(name = "estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq")
	@SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "estu_apellido")
	private String apellido;

	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_tipo")
	private String tipo;

	@OneToMany(mappedBy = "estudiante", fetch = FetchType.EAGER)
	private List<Matricula> matriculas;
	

	

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", apellido=" + apellido + ", tipo=" + tipo + ", nombre=" + nombre + "]";
	}

	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
