package es.curso.java.excepciones.cafeteria;

import java.util.Random;

public class Cafeteria {

	private String nombre;
	
	public Cafeteria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
		abrirCafeteria();
		} catch (TemperatureException t) {
			System.out.println("El clientes se quejó: " + t.getMessage());
		}
	}
	
	public static void abrirCafeteria () throws TemperatureException {
		
		Random rd1 = new Random();
		double randomTemp = rd1.nextInt(1,100);
		
		CoffeCup tazaCafe = new CoffeCup(randomTemp);
		
		ClienteCafeteria cliente = new ClienteCafeteria("Eva");
		
		cliente.tomarTazaCafe(tazaCafe);
		
		
		
	}

}
