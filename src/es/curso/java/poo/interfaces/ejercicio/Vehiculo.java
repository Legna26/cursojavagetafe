package es.curso.java.poo.interfaces.ejercicio;

public abstract class Vehiculo extends ProductoElectronico {

	private int id;
	private String matricula;
	private String marca;
	
	public Vehiculo(int id, String matricula, String marca) {
		super(false);
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
