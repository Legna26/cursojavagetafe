package es.curso.java.introduccion.funciones;

import es.curso.java.utils.Utilidades;

public class Calculadora {

	final static String MENU  = "1. Suma:"
			+ "2. Resta:"
			+ "3. Multiplicación:"
			+ "4. División:"
			+ "5. Científica:"
			+ "6. Apagar";
	
	final static String MENU2 = "1. Potencia:"
			+ "2. Raíz Cuadrada:"
			+ "3. Seno:"
			+ "4. Coseno:"
			+ "5. Volver";
			
	public static void main(String[] args) {
		
		int opcion = 0;
		int opcion2 = 0;
		double numero = 0;
		do {
		
		opcion = Utilidades.pintarMenu(MENU);
		
		switch(opcion) {
		
			case 1: 
				numero = operar(numero, "sumar");
				break;
			
			case 2:
				numero = operar(numero, "restar");
				break;
			
			case 3:
				numero = operar (numero, "multiplicar");
				break;
			
			case 4: 
				numero = operar(numero,"dividir");
				break;
				
			case 5: 
				do {
					opcion2 = Utilidades.pintarMenu(MENU2);
					switch(opcion2) {
						case 1:
							numero = potencia(numero);
							break;
						
						case 2: 
							numero = raizCuadrada(numero);
							break;
						
						case 3:
							numero = seno(numero);
							break;
							
						case 4:
							numero = coseno(numero);
							break;
							
						case 5:
							opcion = Utilidades.pintarMenu(MENU);
							break;
					}
					}while(opcion2!=5);
					
				
				break;
			
			case 6: System.out.println("Gracias por usar la calculadora");
				break;
			default: System.out.println("Opcion incorrecta");
		}
		} while(opcion!=6);
	}
	
	public static double operar (double num , String operacion) {
		 int num1 = Utilidades.pideDatoNumerico("Inserte número a  " + operacion);
		 
		 switch (operacion) {
		 
		 case "sumar": num += num1; break;
		 case "restar": num -= num1; break;
		 case "multiplicar": num *= num1; break;
		 case "dividir": num /= num1; break;
		 
		 }
		 System.out.println("Resultado: " + num);
		 
		return num;
	}
	
//	public static double suma (double num) {
//		
//		double num1 = Utilidades.pideDatoNumerico("Inserte número a sumar: ");
//		num += num1;
//		System.out.println(num + " + " + num1 + " = " + num);
//		return num;
//	}
//	
//	public static double resta (double num) {
//		
//		double num1 = Utilidades.pideDatoNumerico("Inserte número a restar: ");
//		double resta = num - num1;
//		System.out.println(num + " - " + num1 + " = " + resta);
//		return resta;
//	}
//	
//	public static double multi (double num) {
//		
//		double num1 = Utilidades.pideDatoNumerico("Inserte número a multiplicar: ");
//		double multi = num * num1;
//		System.out.println(num + " * " + num1 + " = " + multi);
//		return multi;
//	}
//	
//	public static double division (double num) {
//		
//		double num1 = Utilidades.pideDatoNumerico("Inserte número a dividir: ");
//		double div = num / num1;
//		System.out.println(num + " :  " + num1 + " = " +div);
//		return div;
//	}

	public static double potencia (double num) {
		
		double num1 = Utilidades.pideDatoNumerico("Inserte número : ");
		double potencia = Math.pow(num,num1);
		System.out.println(num + " ^ " + num1 + " = " + potencia);
		return potencia;
	}
	
	public static double raizCuadrada (double num) {
		
		double raiz = Math.sqrt(num);
		System.out.println("La raíz cuadrada de " + num + " es " + raiz);
		return raiz;
	}
	
	public static double seno (double num) {
		
		double num1 = Math.toRadians(num);
		double seno = Math.sin(num1);
		System.out.println("El seno de  " + num + " es " + seno);
		return seno;
	}
	
	public static double coseno (double num) {
		
		double num1 = Math.toRadians(num);
		double coseno = Math.cos(num1);
		System.out.println("El coseno de  " + num + " es " + coseno);
		return coseno;
	}
}
