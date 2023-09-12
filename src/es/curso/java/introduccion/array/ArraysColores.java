package es.curso.java.introduccion.array;

import java.util.Scanner;

public class ArraysColores {

	public static void main(String[] args) {
		
		System.out.println("¿Cuántos colores desea guardar?");
		Scanner scan = new Scanner(System.in);
		int numColor = scan.nextInt();
		
		String [] colores = new String [numColor];
		
		for (int i = 0 ; i < colores.length ; i++ ) {
			
			System.out.println("¿Cuál es el color nº" + (i+1) + "?");
			scan = new Scanner(System.in);
			String color = scan.nextLine();
			
			colores[i] = color.trim();
			
		}
		
//		for (int i=0 ; i < colores.length ; i++) {
//			
//			System.out.println(colores[i]);
//		}
		
		//Bucle for-each
		
		for (String color : colores) {
			System.out.println(color);
		}
		
		for (int i=0 ; i < colores.length ; i++) {
			
			if (colores[i].contains("o") && colores[i].startsWith("a")) {
			System.out.println(colores[i]);
		}
			

		}
	}

}
