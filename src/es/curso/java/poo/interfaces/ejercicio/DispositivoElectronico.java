package es.curso.java.poo.interfaces.ejercicio;

public abstract class DispositivoElectronico extends ProductoElectronico {

	private int id;
	private double precio;
	private String fabricante;
	
	public DispositivoElectronico(int id, double precio, String fabricante) {
		super(false);
		this.id = id;
		this.precio = precio;
		this.fabricante = fabricante;
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
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
