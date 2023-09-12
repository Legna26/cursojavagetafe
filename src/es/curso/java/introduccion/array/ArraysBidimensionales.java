package es.curso.java.introduccion.array;

public class ArraysBidimensionales {

	public static void main(String[] args) {

		// array bidimensionales, es tener dos dimensiones (filas y columnas) de datos
		
		String [][] animales = new String [3][5];
		
		// System.out.println (animales [2][1]);
		
			
		// System.out.println (animales.length); //Numero de filas
		// System.out.println (animales[0].length); // Numero de columnas
		
		for (int i = 0; i < animales.length; i++){	
			
			System.out.println("Fila " + (i+1));
			
			for (int j = 0; j < animales[i].length ; j++) {
				
				System.out.println("\tColumna " + (j+1));
				animales[i][j] = "*";
							
			}
			
		}
			
		for (int i = 0; i < animales.length; i++) {	
								
			for (int j = 0; j < animales[i].length ; j++) {
					
				System.out.print(animales[i][j]);
								
			}
			
			System.out.println();
		}
		
		System.out.println("--------");
		
		for (String [] i : animales) {
			
			for (String j : i ) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}

}
