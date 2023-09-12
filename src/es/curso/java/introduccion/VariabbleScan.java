package es.curso.java.introduccion;

import java.util.Scanner;

public class VariabbleScan {

public static void main(String[] args) {
		
		System.out.println("Introduce un mes: ");
		Scanner scan = new Scanner(System.in);
				
		String mes = scan.nextLine();
		
		System.out.println("El mes es: " + mes);
		
	}
}
