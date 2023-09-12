package es.curso.java.introduccion.condiciones.ejercicios;

import java.util.Scanner;

public class EjercicioCondicionesIf {
	
	public static void main(String[] args) {
		
		String mes = "agosto";
		String estacion = "";
		
		if ( mes == "enero" || mes == "febrero" || mes == "marzo" ) {
			 estacion = "invierno";
			
		} else if ( mes == "abril" || mes == "mayo" || mes == "junio") {
			 estacion = "primavera";
			
		} else if ( mes == "julio" || mes == "agosto" || mes == "setiembre") {
			estacion = "verano";
			
			if ( mes == "agosto") {
				estacion += "\nSon vacaciones de verano.";
			}
					
		} else if ( mes == "octubre" || mes == "noviembre" || mes == "diciembre" ) {
			estacion = "otoño";
			
			if ( mes == "diciembre") {
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
