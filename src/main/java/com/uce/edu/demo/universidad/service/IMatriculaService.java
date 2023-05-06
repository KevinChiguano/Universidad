package com.uce.edu.demo.universidad.service;

import com.uce.edu.demo.universidad.repository.modelo.Matricula;

public interface IMatriculaService {
	
	public void insertar(Matricula matricula);
	public Matricula buscar(Integer id);
	public void actualizar(Matricula matricula);
	public void eliminar(Integer id);
	
}
