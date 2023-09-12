package es.curso.java.introduccion.array;

import java.util.Scanner;

public class ArrayDiagonalSecundaria {

	public static void main(String[] args) {
		
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
		
		System.out.println("__________________");
		
		int num1 = 0;
		int num2 = 0;
		
		for (int i=0 ; i < numFila/2 ; i++) {
			
			//num1 = numeros[i][i];
			//numeros[i][i] = numeros[numFila-i-1][numFila-i-1];
			//numeros[numFila-i-1][numFila-i-1] = num1;
			
			num2 = numeros[i][numFila-i-1];
			numeros[i][numFila-i-1] = numeros[numFila-i-1][i];
			numeros[numFila-i-1][i] = num2;
			
			
		}
		
		for (int i = 0; i < numeros.length; i++) {	
			
			for (int j = 0; j < numeros[i].length ; j++) {
					
				System.out.print(numeros[i][j]+"\t");
								
			}
			
			System.out.println();
		}

	}

}
