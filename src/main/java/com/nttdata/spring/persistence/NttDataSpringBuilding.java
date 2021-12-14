package com.nttdata.spring.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

/**
 * Clase NttDataSpringBuilding
 * 
 * @author jramlope
 *
 */
@Repository
public class NttDataSpringBuilding {

	Scanner S = new Scanner(System.in);

	/** Lista vecinos **/
	private List<NttDataSpringNeighbors> vecinos = new ArrayList<NttDataSpringNeighbors>();

	/**
	 * Añadido de vecinos al edificio
	 * 
	 * @param name
	 * @param firstSurname
	 */
	public void addNeighbor(String name, String firstSurname) {

		// Creación de objeto de la clase NttDataSpringNeighbors
		NttDataSpringNeighbors ndsn = new NttDataSpringNeighbors(name, firstSurname);

		// Añadido
		this.vecinos.add(ndsn);

	}

	/**
	 * Muestra de todos los vecinos
	 */
	public void showAllNeighbors() {

		for (NttDataSpringNeighbors neighbours : vecinos) {
			System.out.println(neighbours);
		}

	}

	/**
	 * Método que realiza la búsqueda de un vecino por su nombre y su primer
	 * apellido
	 * 
	 * @param name
	 * @param firstSurname
	 */
	public void searchByNameAndFirstSurname(String name, String firstSurname) {

		for (NttDataSpringNeighbors neighbours : vecinos) {
			if (neighbours.getName().equals(name) && neighbours.getFirstSurname().equals(firstSurname)) {
				System.out.println("¡ Vecino encontrado !");
			} else {
				System.out.println("¡ Vecino no encontrado !");
			}
		}

	}
}
