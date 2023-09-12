package es.curso.java.introduccion.array;

public class Arrays {

	public static void main(String[] args) {
		// arrays (matrices, arreglos) : estructura de datos, almacena una misma clase de datos
		
		String nombre = "Raúl";
		// Si ya conocemos los valores
		String [] nombres = {"n1","n2","n3","n4","n5"};
		
		//System.out.println(nombres.length);
		//System.out.println(nombres[1]);
		
		nombres[2]="n10";
		
		for (int i = 0; i < nombres.length; i++){	
		
			System.out.println(nombres[i]);
			
		}
		
		System.out.println(nombres[4]);
		
		//Si no conocemos los valores
		int [] numeros = new int[3];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
		}
		
		
	}

}
