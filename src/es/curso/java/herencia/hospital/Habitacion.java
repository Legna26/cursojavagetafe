package es.curso.java.herencia.hospital;

public class Habitacion {
	
	private int numero;
	private Enfermo enfermo;
	
	
	public Habitacion(int numero) {
		super();
		this.numero = numero;
	}


	public Habitacion(int numero, Enfermo enfermo) {
		super();
		this.numero = numero;
		this.enfermo = enfermo;
	}


	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * @return the enfermo
	 */
	public Enfermo getEnfermo() {
		return enfermo;
	}


	/**
	 * @param enfermo the enfermo to set
	 */
	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}
	
	

}
