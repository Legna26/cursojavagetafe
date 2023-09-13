package es.curso.java.introduccion.funciones;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		
		/*
		
		String msg = new String("Hola");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		Math.random();
		*/
		
		Funciones f1 = new Funciones();
		
		f1.metodo1();
		metodoestatico();
		Funciones2.metodo3();
		
		Funciones2 f2 = new Funciones2();
		
		f2.metodo4();
		
		
		for (String valor : args) {
			System.out.println(valor);
		}

	}
	
	//Declaración de un método
	
	//1. Modificador de acceso:
	
	//+ public 
	//+ private
	//+ package ()
	
	//2. static
	
	void metodo1() {
		
		System.out.println("Metodo 1");
		
	}
	
	static void metodoestatico() {
		
		System.out.println("Metodo estático");
	}
 
}
