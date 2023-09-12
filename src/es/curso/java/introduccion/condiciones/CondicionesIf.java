package es.curso.java.introduccion.condiciones;

public class CondicionesIf {

	public static void main(String[] args) {
		
		int numero = 100;
		boolean esMayorEdad = false; 
		
		if ( numero>100 && (esMayorEdad || numero<200) ) {
			System.out.println("1");
			System.out.println("2");
			
		} else if (numero == 100) {
			System.out.println("3");
			System.out.println("4");
			
		} else {
			System.out.println("5");
			System.out.println("6");
		}
	}
	
}
