package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class ApuestaProfesor {

	public static void main(String[] args) {
		
		double importe = 1000;
		String respuesta = "";
		
		do {
			
			System.out.println("¿Cuánto quieres apostar de los " + importe + "€?");
			
			System.out.println("¿Quieres seguir jugando?");
			Scanner scan = new Scanner(System.in);
			respuesta = scan.nextLine();
			
//			if(respuesta.equalsIgnoreCase("no")) {
//				break;
//			}
			
			
		} while (importe>0 && !respuesta.equalsIgnoreCase("no"));
		
		
	}
}
