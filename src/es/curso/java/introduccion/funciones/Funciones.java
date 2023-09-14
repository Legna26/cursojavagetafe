package es.curso.java.introduccion.funciones;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		

		for (String valor : args) {
			System.out.println(valor);
		}
		/*
		
		String msg = new String("Hola");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		Math.random();
		*/
		
		Funciones f1 = new Funciones();
		
		f1.metodo1();
		metodoEstatico();
		Funciones2.metodo3();
		
		Funciones2 f2 = new Funciones2();
		
		f2.metodo4();
		
		
		
		String texto = metodo6();
		System.out.println(texto);
	
		String textoPar = "asdasdasd";
		boolean numeroPar = numeroParCaracteres(textoPar);
		String mensaje = numeroPar?"Es par":"Es impar";
		System.out.println(mensaje + " con " + textoPar.length() + " caracteres.");

	}
	
	//Declaración de un método
	
	//1. Modificador de acceso:
	
	//+ public 
	//+ private
	//+ package ()
	
	//2. static
	
	static void metodo1() {
		
		System.out.println("Metodo 1");
		
	}
	
	static void metodoEstatico() {
		
		System.out.println("Metodo estático");
	}
	
	//3. Devolucion de objetos
	
	//+ void
	//+ objeto o tipo primitivo
	
	static String metodo6 () {
		
		String mensaje = "Hola";
		return mensaje;
	}
	
	static boolean numeroParCaracteres (String cadena) {
		
		int numCaracteres = cadena.length();
		
		boolean esPar = true;
		
		if (numCaracteres%2!=0) {
			
			esPar = false;
		}
		
		return esPar;
	}
 
}
