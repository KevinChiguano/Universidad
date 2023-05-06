package com.uce.edu.demo.universidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.universidad.repository.IClaseRepository;
import com.uce.edu.demo.universidad.repository.modelo.Clase;
import com.uce.edu.demo.universidad.repository.modelo.EstudianteContador;

@Service
public class ClaseServiceImpl implements IClaseService{

	@Autowired
	private IClaseRepository claseRepository;
	
	@Override
	public void insertar(Clase clase) {
		// TODO Auto-generated method stub
		this.claseRepository.insertar(clase);
	}

	@Override
	public Clase buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.claseRepository.buscar(id);
	}

	@Override
	public void actualizar(Clase clase) {
		// TODO Auto-generated method stub
		this.claseRepository.actualizar(clase);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.claseRepository.eliminar(id);
	}

	@Override
	public Clase buscarClasePorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.claseRepository.buscarClasePorNombre(nombre);
	}


}
