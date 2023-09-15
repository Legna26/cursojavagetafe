package es.curso.java.introduccion.funciones.utils;

import java.util.Scanner;

public class Utilidades {

	public static String pideDatoTexto(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String txt3 = scan.nextLine();
				
		return txt3;
	}
	
	public static int pideDatoNumerico(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
			
		return num;
	}
	

}
