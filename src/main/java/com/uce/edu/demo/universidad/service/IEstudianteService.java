package com.uce.edu.demo.universidad.service;

import java.util.List;

import com.uce.edu.demo.universidad.repository.modelo.Estudiante;
import com.uce.edu.demo.universidad.repository.modelo.EstudianteContador;

public interface IEstudianteService {
	
	public void insertar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void actualizar(Estudiante estudiante);
	public void eliminar(Integer id);
	
	public List<EstudianteContador> contarEstudiantePorMateria();
	
	public Estudiante buscarDinamicoEstudianteTipo(String nombre, String apellido, String tipo);

}
