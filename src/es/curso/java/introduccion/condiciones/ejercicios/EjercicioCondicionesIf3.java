package es.curso.java.introduccion.condiciones.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionesIf3 {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un mes: ");
		Scanner scan = new Scanner(System.in);
				
		String mes = scan.nextLine();
		
		String estacion = "";
		
		if ( mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("febrero") || mes.equalsIgnoreCase("marzo") ) {
			 estacion = "invierno";
			
		} else if ( mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("mayo") || mes.equalsIgnoreCase("junio") ) {
			 estacion = "primavera";
			
		} else if ( mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("setiembre") ) {
			estacion = "verano";
			
			if ( mes.equalsIgnoreCase("agosto") ) {
				estacion += "\nSon vacaciones de verano.";
			}
					
		} else if ( mes.equalsIgnoreCase("octubre") || mes.equalsIgnoreCase("noviembre") || mes.equalsIgnoreCase("diciembre") ) {
			estacion = "otoño";
			
			if ( mes.equalsIgnoreCase("diciembre") ) {
				estacion += "\nSon vacaciones de navidad.";
			}
			
		} else {
		
			System.out.println("Mes incorrecto.");
			
		} 

		if (estacion != "") {

			System.out.println("Estás en " + estacion);
		
		}
		
	}

}
