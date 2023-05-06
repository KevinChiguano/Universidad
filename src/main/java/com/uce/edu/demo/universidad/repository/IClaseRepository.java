package com.uce.edu.demo.universidad.repository;

import com.uce.edu.demo.universidad.repository.modelo.Clase;

public interface IClaseRepository {

	public void insertar(Clase clase);
	public Clase buscar(Integer id);
	public void actualizar(Clase clase);
	public void eliminar(Integer id);
	
	public Clase buscarClasePorNombre(String nombre);
	
}
