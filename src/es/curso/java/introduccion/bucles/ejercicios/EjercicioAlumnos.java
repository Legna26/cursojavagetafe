package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioAlumnos {

	public static void main (String[] args) {
	
		System.out.println("¿Cuántos alumnos hay?");
		Scanner scanner = new Scanner(System.in);
		int numAlumnos = scanner.nextInt();
		double nota = 0;
		double suma = 0;
		
		for (int num=1 ; num<=numAlumnos ; num++) {
			
			System.out.println("¿Cuál es la nota del Alumno " + num + "?");
			Scanner scan = new Scanner(System.in);
			nota += scan.nextDouble();
			
			//suma = suma + nota;
		}
		
		System.out.println("La nota media es: " + (nota/numAlumnos));
	}
}
