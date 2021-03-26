package Portatil;

import java.util.ArrayList;
public class PC {
	/**
	 * ATRIBUTS
	 */
	private String marca, model;
	private double preu, memoriaRam, memoriaDisk;
	private ArrayList<Periferics> periferics;


	/**
	 * Constructor de la classe on introduïm les característiques principals del portàtil
	 * @param marca
	 * @param model
	 * @param preu
	 * @param memoriaRam
	 * @param memoriaDisk
	 */
	public PC(String marca, String model, double preu, double memoriaRam, double memoriaDisk) {
		this.marca = marca; // sempre que volem utilitzar l'atribut de la classe hem de posar davant this.nomDeAtribut
		this.model = model;	// D'aquesta manera savem quan ens referim a la classe
		this.preu = preu;
		this.memoriaRam = memoriaRam;
		this.memoriaDisk = memoriaDisk;
		this.periferics = new ArrayList<Periferics>();
	}


	/*** GETTERS (important sempre tornen un valor igual al tipus de mètode, per exemple si el mètode és public String aquest retorna una String també ***/
	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public double getPreu() {
		return preu;
	}
	
	public double getMemoriaRam() {
		return memoriaRam;
	}
	
	public double getMemoriaDisk() {
		return memoriaDisk;
	}
	
	
	/*** SETTERS (Com podeu observar els setter són voids, ja que estem modificant els atributs de la classe ***/
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public void setMemoriaRam(double memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public void setMemoriaDisk(double memoriaDisk) {
		this.memoriaDisk = memoriaDisk;
	}
	
	/***METODES **/
	
	/**
	 * Llista de tots els atributs de la classe
	 */
	public String toString() {
		return "Marca: " + this.marca +
				"\nModel: " + this.model + 
				"\nPreu: " + this.preu + 
				"\nMemoria RAM: " + this.memoriaRam + 
				"\nMemoria Disc dur: " + this.memoriaDisk;
	}
	
	

	
}