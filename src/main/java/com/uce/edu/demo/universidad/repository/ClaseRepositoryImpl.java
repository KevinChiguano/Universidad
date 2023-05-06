package com.uce.edu.demo.universidad.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.universidad.repository.modelo.Clase;
import com.uce.edu.demo.universidad.repository.modelo.EstudianteContador;

@Repository
@Transactional
public class ClaseRepositoryImpl implements IClaseRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Clase clase) {
		// TODO Auto-generated method stub
		this.entityManager.persist(clase);
	}

	@Override
	public Clase buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Clase.class, id);
	}

	@Override
	public void actualizar(Clase clase) {
		// TODO Auto-generated method stub
		this.entityManager.merge(clase);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Clase clase = this.buscar(id);
		this.entityManager.remove(clase);
	}

	@Override
	public Clase buscarClasePorNombre(String nombre) {
		// TODO Auto-generated method stub
		
		TypedQuery<Clase> myQuery = this.entityManager.createNamedQuery("Clase.buscarPorTitulo", Clase.class);
		myQuery.setParameter("datoTitulo", nombre);
		
		return myQuery.getSingleResult();
	}

	

}
