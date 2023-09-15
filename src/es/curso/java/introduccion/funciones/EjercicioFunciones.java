package es.curso.java.introduccion.funciones;

import java.util.Scanner;

import es.curso.java.introduccion.funciones.utils.Utilidades;

public class EjercicioFunciones {

	public static void main(String[] args) {
		
//		String menu = "1. Año de nacimiento\n2. Tabla Multiplicar\n3. Repetición de Arrays\n4. Repetición borrando carácter\n5. Hallar velocidad\n6. Salir";
//		System.out.println (menu);
//		System.out.println ("Selecciona una opción:");
//		Scanner scanner = new Scanner(System.in);
//		int opcion = scanner.nextInt();
//		
//		
//			System.out.println("Indica tu año de nacimiento: ");
//			String anio = scanner.nextLine();
//			int edad = calculaEdad(anio);
//			System.out.println("Tienes " + edad + " años.");
//			
//			
//			System.out.println("Indica número que desea mostrar tabla de multiplicar.");
//			int numulti = scanner.nextInt();
//			pintaTablaMultiplicar(numulti);
//			
//		
//			System.out.println("Indica texto que desea mostrar: ");
//			scanner = new Scanner(System.in);
//			String txt1 = scanner.nextLine();
//			System.out.println("¿Cuántas veces desea mostrarlo? ");
//			int rep = scanner.nextInt();
//			
//			
//			for (String dato : juntaDatos(txt1, rep)) {
//				System.out.println(dato);
//			};
//			
//		
//			System.out.println("Indica texto que desea mostrar: ");
//			scanner = new Scanner(System.in);
//			String txt2 = scanner.nextLine();
//			System.out.println("¿Cuántas veces desea mostrarlo? ");
//			int rep2 = scanner.nextInt();
//			
//			
//			for (String dato : juntaDatos2(txt2, rep2)) {
//				System.out.println(dato);
//			};
//			
//		
//		
//			System.out.println("Coloque espacio (km) y tiempo (h): ");
//			double espacio = scanner.nextDouble();
//			int tiempo = scanner.nextInt();
//			calculaVelocidad(espacio,tiempo);
			
		
		
		int opcionFinal = pintarMenu();
		
		switch(opcionFinal) {
		case 1:
			
			System.out.println(Utilidades.pideDatoTexto()); break;
			
		case 2:
		
			System.out.println(Utilidades.pideDatoNumerico()); break;
		
		default: System.out.println("Opcion incorrecta");
		}
	}
	
//	public static int calculaEdad (String anioNacimiento) {
//		
//		final int anioActual = 2023;
//		int anio = Integer.parseInt(anioNacimiento);
//		int edad = anioActual - anio;
//		
//		return edad;
//	}
//	
//	public static void pintaTablaMultiplicar (int numero) {
//		
//		for (int i = 0; i<=12 ; i++) {
//			int tabla = numero * i;
//			System.out.println(numero + " x " + i + " = " + tabla);
//		}
//	}
//	
//	/**
//	 * Devolver el texto tantas veces como se indique el numRepeticiones 
//	 * @author Emmy
//	 * @since 1.0
//	 * @param texto, que será almacenado en el array
//	 * @param numRepeticiones, numero de veces que se va a repetir el texto en el array
//	 * @return array
//	 */
//	public static String [] juntaDatos (String texto, int numRepeticiones) {
//		
//		String [] datos = new String [numRepeticiones];
//		for (int i = 0 ; i < datos.length ; i++){	
//			datos[i] = texto;
//		}
//		
//		return datos;
//	}
//	
//	
//	public static String [] juntaDatos2 (String texto, int numRepeticiones) {
//		
//		int tamanio = texto.length()>=numRepeticiones?numRepeticiones:texto.length();
//		String [] datos = new String [tamanio];
//		
//		for (int i = 0 ; i < datos.length ; i++){	
//			datos[i] = texto.substring(0 , (texto.length()-i));
//		}
//		
//		return datos;
//	}
//		
//	
//	
//	public static void calculaVelocidad (double espacio , int tiempo) {
//		
//		double velocidad = espacio / tiempo ; 
//		System.out.println("La velocidad es " + velocidad + " km/h.");
//	}
	
	
	public static int pintarMenu() {
		
		String [] opciones = {"1. Opción Texto","2. Opción Número"};
		
		for (String opcion : opciones) {
			System.out.println(opcion);
		
		}
		
		System.out.println ("Selecciona una opción:");
		Scanner scan = new Scanner(System.in);
		int opc = scan.nextInt();
		
		return opc;
				
	}
	
	
	
}
