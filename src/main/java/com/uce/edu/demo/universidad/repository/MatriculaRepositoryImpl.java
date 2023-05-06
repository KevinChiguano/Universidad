package com.uce.edu.demo.universidad.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.universidad.repository.modelo.Matricula;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Matricula.class, id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(matricula);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Matricula matricula = this.buscar(id);
		this.entityManager.remove(matricula);
	}

}
