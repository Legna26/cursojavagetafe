package es.curso.java.introduccion.condiciones.ejercicios;

import java.util.Scanner;

public class EjercicioEdad {

public static void main(String[] args) {
		
		System.out.println("Escribe tu nombre: ");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		
		System.out.println("¿Cuál es tu edad?");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		
		String epoca = "";
		
		if (edad > 0) {
			
			if (edad <= 5) {
				epoca = "bebé";
					
			} else if (edad <= 12 ) {
				epoca = "niño";
				
			} else if (edad <= 17) {
				epoca = "adolescente";
				
			} else if (edad <= 40) {
				epoca = "adulto";
				
			} else if (edad <= 60) {
				epoca = "adulto mayor";
				
			} else if (edad <= 80) {
				epoca = "anciano";
				
			} else {
				epoca = "anciano rockstar";
				
			}
			System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " años y eres un " + epoca + ".");
			
		} else {
			System.out.println("Edad incorrecta.");
			
		}		
	}
}
