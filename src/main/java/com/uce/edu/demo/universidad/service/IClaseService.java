package com.uce.edu.demo.universidad.service;

import java.util.List;

import com.uce.edu.demo.universidad.repository.modelo.Clase;
import com.uce.edu.demo.universidad.repository.modelo.EstudianteContador;

public interface IClaseService {

	public void insertar(Clase clase);
	public Clase buscar(Integer id);
	public void actualizar(Clase clase);
	public void eliminar(Integer id);
	
	public Clase buscarClasePorNombre(String nombre);
	
}
