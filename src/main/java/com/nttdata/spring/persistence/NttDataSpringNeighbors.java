package com.nttdata.spring.persistence;

/**
 * Clase NttDataSpringNeighbors
 * 
 * @author jramlope
 *
 */
public class NttDataSpringNeighbors {

	/** Neighbor Name **/
	private String name;

	/** Neighbor firstSurname **/
	private String firstSurname;

	/** Método constructor **/
	public NttDataSpringNeighbors(String n, String fs) {
		this.name = n;
		this.firstSurname = fs;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstSurname
	 */
	public String getFirstSurname() {
		return firstSurname;
	}

	/**
	 * @param firstSurname the firstSurname to set
	 */
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	@Override
	public String toString() {
		return "NttDataSpringNeighbors [name=" + name + ", firstSurname=" + firstSurname + "]";
	}

}
