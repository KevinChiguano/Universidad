package com.uce.edu.demo.universidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.universidad.repository.IEstudianteRepository;
import com.uce.edu.demo.universidad.repository.modelo.Estudiante;
import com.uce.edu.demo.universidad.repository.modelo.EstudianteContador;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscar(id);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(id);
	}

	@Override
	public List<EstudianteContador> contarEstudiantePorMateria() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.contarEstudiantePorMateria();
	}

	@Override
	public Estudiante buscarDinamicoEstudianteTipo(String nombre, String apellido, String tipo) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarDinamicoEstudianteTipo(nombre, apellido, tipo);
	}

}
