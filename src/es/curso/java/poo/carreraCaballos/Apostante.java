package es.curso.java.poo.carreraCaballos;

public class Apostante {
	
	private String nombre;
	private double saldo;
	private long apuesta;
	
	public Apostante(String nombre, double saldo, long apuesta) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public long getApuesta() {
		return apuesta;
	}

	public void setApuesta(long apuesta) {
		this.apuesta = apuesta;
	}
	
	
}
