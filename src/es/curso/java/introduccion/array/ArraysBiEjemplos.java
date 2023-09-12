package es.curso.java.introduccion.array;

public class ArraysBiEjemplos {

	public static void main(String[] args) {
		
		int [][] numeros = new int [2][3];
		
		int [][] numeros2 = { {1,2,3} , {4,5,6} };
		int valor = 0;
		
		for (int i = 0; i < numeros.length; i++){	
			
			for (int j = 0; j < numeros[i].length ; j++) {
				
				valor++;
				numeros[i][j] = valor;
				
			}
			
		}
		
		for (int i = 0; i < numeros2.length; i++) {	
			
			for (int j = 0; j < numeros2[i].length ; j++) {
					
				System.out.print(numeros2[i][j]);
								
			}
			System.out.println();
			
		}
		

	}

}
