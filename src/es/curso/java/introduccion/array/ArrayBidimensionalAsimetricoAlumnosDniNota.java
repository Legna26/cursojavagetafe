package es.curso.java.introduccion.array;

import java.util.Scanner;

public class ArrayBidimensionalAsimetricoAlumnosDniNota {

	public static void main(String[] args) {

		System.out.println("¿Cuántas aulas hay?");
		Scanner scan = new Scanner(System.in);
		int numAulas = scan.nextInt();

		String [][] colegio = new String [numAulas][];
		
		for (int i = 0; i < colegio.length; i++){	
			
			System.out.println("¿Cuántas alumnos hay en la aula " + (i+1) + "?");
			scan = new Scanner(System.in);
			int numAlumnos = scan.nextInt();
			
			colegio [i] = new String [numAlumnos];
		}
		
		//Insertamos los datos
		for (int i = 0; i < colegio.length; i++){	
			
			for (int j = 0; j < colegio[i].length ; j++) {
				
				System.out.println("Nombre del Alumno " + (j+1) + " del aula " + (i+1));
				scan = new Scanner(System.in);
				String nombre = scan.nextLine();
				
				System.out.println("DNI del Alumno " + (j+1) + " del aula " + (i+1));
				scan = new Scanner(System.in);
				String dni = scan.nextLine();		
				
				System.out.println("Nota del Alumno " + (j+1) + " del aula " + (i+1));
				scan = new Scanner(System.in);
				String nota = scan.nextLine();
				
				colegio[i][j] = nombre+":"+dni+":"+nota;
			}
		}
		
		
		for (int i = 0; i < colegio.length; i++) {	
			System.out.println("Aula " + i);
			for (int j = 0; j < colegio[i].length ; j++) {
					
				
				System.out.println("\t"+colegio[i][j]);
								
			}
			
			System.out.println();
		}	
		
		
		System.out.println("Los alumnos aprobados son:");
		for(int i=0; i<colegio.length;i++) {
			
			for (int j = 0; j < colegio[i].length ; j++) {
			
			String datoNota = colegio[i][j];
									
			String nombre = datoNota.split(":")[0];
			
		    String notaStr = datoNota.split(":")[2];
						
			int notaFinal = Integer.parseInt(notaStr);
			
			
				if (notaFinal>=5) {
					
					System.out.println(nombre + " " + datoNota.split(":")[1] + " " + notaStr);
					
				}
			
			}
		}
		
	}

}
