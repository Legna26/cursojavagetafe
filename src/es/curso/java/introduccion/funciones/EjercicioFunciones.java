package es.curso.java.introduccion.funciones;

import java.util.Scanner;

public class EjercicioFunciones {

	public static void main(String[] args) {
		
		System.out.println("Indica tu año de nacimiento: ");
		Scanner scan = new Scanner(System.in);
		String anio = scan.nextLine();
		int edad = calculaEdad(anio);
		System.out.println("Tienes " + edad + " años.");
		
		System.out.println("Indica número que desea mostrar tabla de multiplicar.");
		int numulti = scan.nextInt();
		pintaTablaMultiplicar(numulti);
		
		System.out.println("Indica texto que desea mostrar: ");
		Scanner scan1 = new Scanner(System.in);
		String txt1 = scan1.nextLine();
		System.out.println("¿Cuántas veces desea mostrarlo? ");
		int rep = scan.nextInt();
		juntaDatos(txt1, rep);
		
		calculaVelocidad(30,5);
	}
	
	static int calculaEdad (String anioNacimiento) {
		
		int anio = Integer.parseInt(anioNacimiento);
		
		int edad = 2023 - anio;
		
		return edad;
	}
	
	static void pintaTablaMultiplicar (int numero) {
		
		for (int i = 0; i<=12 ; i++) {
			
			int tabla = numero * i;
			
			System.out.println(numero + " x " + i + " = " + tabla);
			
		}
		
	}
	
	static String [] juntaDatos (String texto, int numRepeticiones) {
		
		String [] datos = new String [texto.length()];
		
		for (int i = 0 ; i < numRepeticiones ; i++){	
			System.out.println(texto);
		}
		
		for (int i = 0 ; i < datos.length ; i++){	
			
			datos[i] = texto.substring(0 , (texto.length()-i));
		}
		
		for (String dato : datos) {
			System.out.println(dato);
		}
		
		return datos;
	}
	
	public static void calculaVelocidad (double espacio , int tiempo) {
		
		double velocidad = espacio / tiempo ; 
		System.out.println("La velocidad es " + velocidad + " km/m");
	}
	
	

}
