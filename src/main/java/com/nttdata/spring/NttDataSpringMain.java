package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.nttdata.spring.services.NttDataSpringBuildingService;

/**
 * 
 * Clase Main - NttDataSpringMain
 * 
 * @author jramlope
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NttDataSpringMain implements CommandLineRunner {

	/** Servicio buildingService **/
	@Autowired
	private NttDataSpringBuildingService buildingService;

	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Ejecución de la aplicación
		SpringApplication.run(NttDataSpringMain.class, args);

	}

	public void run(String... args) throws Exception {
		System.out.println("\n");

		// Llamada al método de insertar vecino
		buildingService.addNeighbour("Javier", "Ramos");

		// Llamada al método para mostrar todos los vecinos
		buildingService.showAllNeighbour();

		// LLamada al método para buscar por el nombre y el primer apellido
		buildingService.searchByNameAndFirstSurname("Javier", "Ramos");

	}

}
