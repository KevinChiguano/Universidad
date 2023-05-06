package com.uce.edu.demo.universidad.repository;

import com.uce.edu.demo.universidad.repository.modelo.Matricula;

public interface IMatriculaRepository {
	
	public void insertar(Matricula matricula);
	public Matricula buscar(Integer id);
	public void actualizar(Matricula matricula);
	public void eliminar(Integer id);

}
