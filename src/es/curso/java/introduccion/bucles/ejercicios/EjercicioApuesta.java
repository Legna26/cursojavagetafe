package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioApuesta {
	
	public static void main(String[] args) {
		
		int importe = 1000;
		int apuesta;
		int dado = 0;
		int premio = 0;
		int opcion = 0;
		int i;
		
		System.out.println("Usted tiene un imprte inicial de " + importe + "€." );
		
		do {
			
		i = (int)(Math.random()*6)+1;
			
		System.out.println("¿Cuánto quieres apostar?");
		Scanner scanner = new Scanner(System.in);
		apuesta = scanner.nextInt();
		
			if (apuesta<=importe) {
				
				System.out.println("¿Por cuál número apuestas? (Del 1 al 6)");
				dado = scanner.nextInt();
				
		
			} else {
				
				System.out.println("Importe insuficiente, vuelva a apostar.");
				continue;
			}
			
			if (dado==i) {
				
				premio = apuesta * 3;
				importe = premio + importe;
				System.out.println("Usted eligió el número " + dado + " y ganó " + premio + "€. Su importe acumulado es: " + importe +"€.");
				
			} else {
				
				importe = importe - apuesta;
				System.out.println("Usted eligió el número " + dado + " y perdió, el número ganador es " + i + ". Su importe actual es: " + importe + "€.");			
				
			}
			
					
			if (importe > 0) {
				
				System.out.println("¿Quiere seguir jugando?");
				System.out.println("1. Sí\n2. No");
				
				opcion = scanner.nextInt();
				
				
			} 

			if (importe==0) {
				System.out.println("Usted perdió todo. Hasta la próxima!");
				
				
			}
			
			
		} while (importe>0 && opcion!=2);
		
		System.out.println("Te has quedado con "+ importe);
	}

}
