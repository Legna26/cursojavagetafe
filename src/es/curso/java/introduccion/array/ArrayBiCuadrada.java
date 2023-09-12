package es.curso.java.introduccion.array;

import java.util.Scanner;

public class ArrayBiCuadrada {

	public static void main(String[] args) {
		/* Crear matriz cuadrada
		Pedir numero de filas que va a tener
		
		Pedir los datos para rellenar la matriz indicando la posición
		
		Pintar los datos de la matriz
		
		Crear Array unidimensional con los datos de la diagonal de la matriz (izqda. a derecha)
		
		Invertir diagonal
		
		*/

		System.out.println("¿Cuántas filas desea?");
		Scanner scan = new Scanner(System.in);
		int numFila = scan.nextInt();
		
		int [][] numeros = new int [numFila][numFila];
		
		for (int i = 0; i < numeros.length; i++){	
			
			for (int j = 0; j < numeros[i].length ; j++) {
				
				System.out.println("¿Qué número desea colocar en la posición? Fila: " + i + " Columna: " + j );
				scan = new Scanner(System.in);
				int num = scan.nextInt();
				
				numeros[i][j] = num;
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {	
			
			for (int j = 0; j < numeros[i].length ; j++) {
					
				System.out.print(numeros[i][j]+"\t");
								
			}
			
			System.out.println();
		}
		
		int num2 = 0;
		
		int [] diagonal = new int[numFila];
		
		for (int i = 0; i < numeros.length; i++){	
			
			for (int j = 0; j < numeros[i].length ; j++) {
				
				if (i==j) {
					
					num2 = numeros[i][j];
					diagonal [i] = num2;
				}
				
			}
		}
		
		System.out.println("El array de la diagonal 1 es: ");
		
		for (int i : diagonal) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		
		for (int i = 0; i < numeros.length/2; i++){	
			
			for (int j = 0; j < numeros[i].length ; j++) {
				
				if (i+j == numeros.length-1) {
					
					int num3 = numeros[i][j];
					numeros[i][j]=numeros[j][i];
					numeros[j][i]=num3;
				}
				
			}
		}
			
		/* for (int i = 0; i < numeros.length; i++){	
			
			for (int j = 0; j < numeros[i].length ; j++) {
				
				if (i+j == numeros.length-1) {
					
					numeros[j][i] = diagonal2 [i];
					
				}
				
			}
		
		}
		*/
		
		System.out.println("La nueva matriz es: ");
		
		for (int i = 0; i < numeros.length; i++) {	
			
			for (int j = 0; j < numeros[i].length ; j++) {
					
				System.out.print(numeros[i][j]+"\t");
								
			}
			
			System.out.println();	
		}
	}

}
