package es.curso.java.introduccion.condiciones.ejercicios;

import java.util.Scanner;

public class EjercicioAdivinanza {

	public static void main(String[] args) {
		
		System.out.println("La A, anda. La B, besa. La C, reza. ¿Qué fruta es esa? ");
		Scanner scan = new Scanner(System.in);
				
		String respuesta = scan.nextLine();
		String respCorrect = "Cereza";
				
		if ( respuesta.equalsIgnoreCase(respCorrect) ) {
			
			System.out.println("Respuesta correcta. ¡Ganaste!");
			
		} else {
			
			System.out.println("Respuesta incorrecta.");
		}
		
	}
	
	
}
