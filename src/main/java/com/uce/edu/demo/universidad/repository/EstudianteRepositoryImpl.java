package com.uce.edu.demo.universidad.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.universidad.repository.modelo.Estudiante;
import com.uce.edu.demo.universidad.repository.modelo.EstudianteContador;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.buscar(id);
		this.entityManager.remove(estudiante);
	}

	@Override
	public List<EstudianteContador> contarEstudiantePorMateria() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteContador> myQuery = this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.universidad.repository.modelo.EstudianteContador(c.titulo,count(e.nombre)) FROM Estudiante e, Matricula m, Clase c WHERE e.id = m.estudiante.id AND m.clase.id = c.id GROUP BY c.titulo", EstudianteContador.class);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarDinamicoEstudianteTipo(String nombre, String apellido, String tipo) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		
		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);
		
		Predicate predicadoNombre = myBuilder.equal(myTabla.get("nombre"), nombre);
		Predicate predicadoApellido = myBuilder.equal(myTabla.get("apellido"), apellido);

		Predicate predicadoFinal = null;
		
		if(tipo.equalsIgnoreCase("Pre Grado")) {
			predicadoFinal = myBuilder.and(predicadoNombre, predicadoApellido);
		}else {
			predicadoFinal = myBuilder.or(predicadoNombre, predicadoApellido);
		}
		
		myQuery.select(myTabla).where(predicadoFinal);
		
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);
		
		return myQueryFinal.getSingleResult();
	}

}
