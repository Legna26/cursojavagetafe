package es.curso.java.poo.supermercado;

public class Supermercado {

	private String nombre;
	private Cajera [] cajeras;
	
	public Supermercado(String nombre, Cajera[] cajeras) {
		super();
		this.nombre = nombre;
		this.cajeras = cajeras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cajera[] getCajeras() {
		return cajeras;
	}

	public void setCajeras(Cajera[] cajeras) {
		this.cajeras = cajeras;
	}
	
	
		



}
