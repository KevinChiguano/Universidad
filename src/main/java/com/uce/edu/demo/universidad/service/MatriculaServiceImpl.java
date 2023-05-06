package com.uce.edu.demo.universidad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.universidad.repository.IMatriculaRepository;
import com.uce.edu.demo.universidad.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.insertar(matricula);
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscar(id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizar(matricula);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminar(id);
	}

}
