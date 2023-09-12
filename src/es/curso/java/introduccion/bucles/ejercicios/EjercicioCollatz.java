package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioCollatz {

	public static void main (String[] args) {
				
		System.out.println("Indicar un número:");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		
//		for (int i = numero; i!=1 ; ) {
//			
//			if (i%2 == 0) {
//				i = i/2 ;
//				
//			} else {
//				i = i*3+1 ;	
//			}
//				
//////			Operador Ternario
//////			i = i%2==0 ? i/=2 : i*3+1;
//			
//			System.out.println(i);
//		}
//		
		while (numero!=1) {
			
			if (numero%2 == 0) {
				numero/=2;
			} else {
				numero = numero*3+1;
				
			}
		//	numero = numero%2==0 ? numero/=2 : numero*3+1;
			
			System.out.println(numero);		
		}
	}
}
	

