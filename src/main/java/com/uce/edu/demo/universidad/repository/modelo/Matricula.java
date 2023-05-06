package com.uce.edu.demo.universidad.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {
	
	@Id
	@Column(name = "matr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matr_id_seq")
	@SequenceGenerator(name = "matr_id_seq", sequenceName = "matr_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "matr_fecha")
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "matr_estu_id")
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "matr_clas_id")
	private Clase clase;
	

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + "]";
	}
	
	
	//SET y GET


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}
	
	
	

}
