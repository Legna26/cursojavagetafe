package es.curso.java.introduccion.condiciones.ejercicios;

import java.util.Scanner;

public class EjercicioLlamada {

public static void main(String[] args) {
		
		System.out.println("Escribe la duración de la llamada (en minutos): ");
		Scanner scan = new Scanner(System.in);
		int duracion = scan.nextInt();
				
		System.out.println("Escribe el día que realizó la llamada: ");
		Scanner scanner = new Scanner(System.in);
		String dia = scanner.nextLine();
				
		System.out.println("Escribe la hora que realizó la llamada (en formato 24 hrs.): ");
		Scanner scann = new Scanner(System.in);
		int hora = scann.nextInt();
		
		double tarifa = 1;
		double costo1 = 0;
		double impuesto = 0;
		
		if (duracion <= 5) {
			costo1 = tarifa;
			
		} else if (duracion > 5 & duracion <= 8) {
			costo1 = tarifa + 0.8;
						
		} else if (duracion > 8 & duracion <= 10) {
			costo1 = tarifa + 0.8 + 0.7;
			
		} else {
			costo1 = tarifa + 0.8 + 0.7 + (duracion - 10) * 0.50;
					
		}
		
		if (dia.equalsIgnoreCase("domingo")) {
			impuesto = 0.03 * costo1;
			
		} else if (!dia.equalsIgnoreCase("Domingo") & 0 <= hora && hora <= 12) {
			impuesto = 0.15 * costo1;
			
		} else if (!dia.equalsIgnoreCase("Domingo") & 12 < hora & hora <= 24) {
			impuesto = 0.10 * costo1;
			
		} else {
			System.out.println("Hora incorrecta.");
			
		}
			
		
		System.out.println("El costo de llamada es " + (impuesto + costo1));
		
		
	}	
}
