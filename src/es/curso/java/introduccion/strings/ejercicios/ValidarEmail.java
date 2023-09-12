package es.curso.java.introduccion.strings.ejercicios;

import java.util.Scanner;

public class ValidarEmail {
	
	public static void main(String[] args) {
		
		String mensajeError = "";	
		
		do {
		
		System.out.println("¿Cuál es tu e-mail?");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine().trim();
		
		mensajeError = "";	
				
		if (email.indexOf("@")!=email.lastIndexOf("@") || email.indexOf("@")==-1) {
			
			mensajeError = ", debe tener un @";
						
		} else {
			
			if (!email.substring(email.indexOf("@")).contains(".")) {
				
				mensajeError += ", debe contener un punto despues del @";
				
			} if ( (email.substring(email.indexOf("@")+1, email.indexOf("."))).length() < 2 ) {
				
				mensajeError += ", debe tener al menos 2 caracteres entre el @ y el punto";		
			
			} if ( email.length() - (email.lastIndexOf(".")+1) < 2  || email.length() - (email.lastIndexOf(".")+1) > 6) {
				
				mensajeError += ", debe tener 2 a 6 caracteres después del punto";		
			}
			
		
			
		if (email.contains(" ")) {
			
			mensajeError += ", no debe contener espacios en blanco";
			
		}
		
		
			
		}
		
		if (mensajeError.isEmpty()) {
			
			System.out.println("El email " + email + " es correcto." );		
			
		} else {
			
			System.out.println("El email " + email + " es incorrecto" + mensajeError+ ".");
			
		} 
		
		} while (!mensajeError.isEmpty());
		
		
		
	}
		

		
	
}
