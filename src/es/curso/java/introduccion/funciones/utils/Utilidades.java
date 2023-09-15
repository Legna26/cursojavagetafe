package es.curso.java.introduccion.funciones.utils;

import java.util.Scanner;

public class Utilidades {

	public static String pideDatoTexto() {
		
		System.out.println("Indique texto: ");
		Scanner scan = new Scanner(System.in);
		String txt3 = scan.nextLine();
				
		return txt3;
	}
	
	public static int pideDatoNumerico() {
		
		System.out.println("Indique número: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
			
		return num;
	}
	

}
