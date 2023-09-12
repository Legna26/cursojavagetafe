package es.curso.java.introduccion.condiciones.ejercicios;

public class EjercicioCondicionesIf2 {
	
	public static void main(String[] args) {
		
		String mes = "enero";
				
		if ( mes == "enero" || mes == "febrero" || mes == "marzo" ) {
			
			System.out.println("Estás en invierno.");
			
		} else if ( mes == "abril" || mes == "mayo" || mes == "junio" ) {
				
			System.out.println("Estás en primavera.");
			
		} else if ( mes == "julio" || mes == "agosto" || mes == "septiembre" ) {
			
			System.out.println("Estás en verano.");
		 
		} else if ( mes == "octubre" || mes == "noviembre" || mes == "diciembre" ) {
				
			System.out.println("Estás en otoño.");
	    
		} else {
			
			System.out.println("Mes incorrecto.");
		}
	}

}
