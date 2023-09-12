package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioCoches {

	public static void main (String[] args) {
	
	System.out.println("¿Cuántos coches hay en la carrera?");
	Scanner scanner = new Scanner(System.in);
	int numCoches = scanner.nextInt();
	double vel = 0;
	double velMin = 350;
	double velMax = 0;
	
	for (int num=1 ; num<=numCoches ; num++) {
		
		System.out.println("¿Cuál fue la velocidad máxima del coche " + num + "?");
		Scanner scan = new Scanner(System.in);
		vel = scan.nextDouble();
			
		if (velMin>vel) {
			velMin = vel;
		}
		
		if (velMax<vel) {
			velMax = vel;
		}
	}
	System.out.println("La velocidad mínima es: " + velMin);
	System.out.println("La velocidad máxima es: " + velMax);
	}
}
