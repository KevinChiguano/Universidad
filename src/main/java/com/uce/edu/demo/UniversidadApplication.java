package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.universidad.repository.modelo.Clase;
import com.uce.edu.demo.universidad.repository.modelo.Estudiante;
import com.uce.edu.demo.universidad.repository.modelo.Matricula;
import com.uce.edu.demo.universidad.service.IClaseService;
import com.uce.edu.demo.universidad.service.IEstudianteService;
import com.uce.edu.demo.universidad.service.IMatriculaService;

@SpringBootApplication
public class UniversidadApplication implements CommandLineRunner{

	
	private static final Logger LOGGER = Logger.getLogger(UniversidadApplication.class);
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IClaseService claseService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(UniversidadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Alonso");
		estudiante.setApellido("Angulo");
		estudiante.setTipo("Pos Grado");
		
		//this.estudianteService.insertar(estudiante);
		
		Clase clase = new Clase();
		clase.setTitulo("Algebra Lineal");
		clase.setDescripcion("Materia del tronco comun");
		//this.claseService.insertar(clase);
		
		estudiante.setId(1);
		clase.setId(2);
		
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setEstudiante(estudiante);
		matricula.setClase(clase);
		
		//this.matriculaService.insertar(matricula);
		
		/*Estudiante estudiante2 = new Estudiante();
		estudiante2 = this.estudianteService.buscar(1);
		
		List<Matricula> matriculas = estudiante2.getMatriculas();
		LOGGER.info(estudiante2);
		for(Matricula item: matriculas) {
			LOGGER.info(item);
		}*/
		
		/*Matricula matricula2 = this.matriculaService.buscar(1);
		Estudiante estudiante2 = matricula2.getEstudiante();
		Clase clase2 = matricula2.getClase();
		LOGGER.info(matricula2);
		LOGGER.info(estudiante2);
		LOGGER.info(clase2);*/
		
		//LOGGER.info(this.estudianteService.contarEstudiantePorMateria());
		//LOGGER.info(this.claseService.buscarClasePorNombre("Algebra Lineal"));
		
		//estudiante.setId(1);
		//this.estudianteService.actualizar(estudiante);
		
		LOGGER.info(estudianteService.buscarDinamicoEstudianteTipo("Paul", "Chiguano", "Pos Grado"));
	}

}
