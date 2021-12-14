package com.nttdata.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttDataSpringBuilding;

/**
 * Clase NttDataSpringBuildingService - Service
 * 
 * @author jramlope
 *
 */
@Service
public class NttDataSpringBuildingService {

	/** Servicio buildingService **/
	@Autowired
	private NttDataSpringBuilding buildingService;

	/**
	 * Método para añadir un vecino
	 * 
	 * @param newNeighbor
	 */
	public void addNeighbour(final String name, final String firstSurname) {
		// Insercción del nuevo cliente.
		buildingService.addNeighbor(name, firstSurname);
	}

	/**
	 * Método para listar los vecinos
	 */
	public void showAllNeighbour() {
		buildingService.showAllNeighbors();
	}

	/**
	 * Método que realiza la búsqueda de un vecino por su nombre y su primer
	 * apellido
	 * 
	 * @param name
	 * @param firstSurname
	 */
	public void searchByNameAndFirstSurname(String name, String firstSurname) {
		buildingService.searchByNameAndFirstSurname(name, firstSurname);
	}

}
