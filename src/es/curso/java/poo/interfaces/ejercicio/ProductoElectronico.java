package es.curso.java.poo.interfaces.ejercicio;

public abstract class ProductoElectronico implements SistemaEncendido {
	
	private boolean encendido;

	public ProductoElectronico(boolean encendido) {
		super();
		this.encendido = encendido;
	}

	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	

}
