package es.curso.java.poo.interfaces.ejercicio;

public class Moto extends Vehiculo {

	private int numRuedas;

	public Moto(int id, String matricula, String marca) {
		super(id, matricula, marca);
		// TODO Auto-generated constructor stub
	}

	public Moto(int id, String matricula, String marca, int numRuedas) {
		super(id, matricula, marca);
		this.numRuedas = numRuedas;
	}

	/**
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}

	/**
	 * @param numRuedas the numRuedas to set
	 */
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("La moto está encendida.");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("La moto está apagada.");
	}
	
	
	
}
