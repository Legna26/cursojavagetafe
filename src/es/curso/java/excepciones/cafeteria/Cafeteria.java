package es.curso.java.excepciones.cafeteria;

import java.util.Random;

public class Cafeteria {

	private String nombre;
	
	public Cafeteria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Cafeteria caf = new Cafeteria("La Cafetería");
	
		caf.abrirCafeteria();
	
	}
	
	private void abrirCafeteria () {
		
		
		boolean clienteSatisfecho;
		do {
			clienteSatisfecho = true;
			
			Random rd = new Random();
			double randomTemp = rd.nextInt(1,100);
			
			CoffeCup tazaCafe = new CoffeCup(randomTemp);
			
			ClienteCafeteria cliente = new ClienteCafeteria("Eva");
			
			try {
				cliente.tomarTazaCafe(tazaCafe);
			} catch (TooHotTemperatureException e) {
				clienteSatisfecho = false;
				System.out.println("El clientes se ha quemado, quiere otro café");
				continue;
			} catch (TooColdTemperatureException t) {
				clienteSatisfecho = false;
				System.out.println("El clientes se quejó, el café está muy frío");
				continue;
			}
		} while (!clienteSatisfecho);
		
	}

}
