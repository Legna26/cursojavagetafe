package es.curso.java.poo.escaparate;

public class Boton {
	
	private long id;
	private String forma;
	private String color;
	private String tamanio;
	
	public Boton(long id, String forma, String color, String tamanio) {
		super();
		this.id = id;
		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	

}
