package com.uce.edu.demo.universidad.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "clase")
@NamedQuery(name = "Clase.buscarPorTitulo",query = "SELECT c FROM Clase c WHERE c.titulo = :datoTitulo")
public class Clase {

	@Id
	@Column(name = "clas_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clas_id_seq")
	@SequenceGenerator(name = "clas_id_seq", sequenceName = "clas_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "clas_titulo")
	private String titulo;

	@Column(name = "clas_descripcion")
	private String descripcion;

	@OneToMany(mappedBy = "clase", fetch = FetchType.EAGER)
	private List<Matricula> matriculas;

	
	
	@Override
	public String toString() {
		return "Clase [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + "]";
	}

	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

}
