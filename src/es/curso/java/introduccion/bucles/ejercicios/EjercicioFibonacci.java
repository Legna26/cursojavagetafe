package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioFibonacci {

	public static void main (String[] args) {
		
		System.out.println("Indicar números de serie a mostrar.");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		int suma = 0;
				
		System.out.print(num1);
		System.out.print(", " + num1);
		for (int i = 0 ; i < numero -2 ; i++ ) {
			
			suma = num1 + num2;
			System.out.print(", " + suma);
			
			num1 = num2;
			num2 = suma;
								
		}
		
	}
}
