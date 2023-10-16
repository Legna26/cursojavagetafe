package es.curso.java.poo.interfaces.ejercicio;

public class Coche extends Vehiculo {

	private int numPuertas;

	public Coche(int id, String matricula, String marca) {
		super(id, matricula, marca);
		// TODO Auto-generated constructor stub
	}

	public Coche(int id, String matricula, String marca, int numPuertas) {
		super(id, matricula, marca);
		this.numPuertas = numPuertas;
	}

	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}

	/**
	 * @param numPuertas the numPuertas to set
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("El coche está encendido.");
		setEncendido(true);
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("El coche está apagado.");
		setEncendido(false);
	}
	
	
}
