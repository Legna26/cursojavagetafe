package es.curso.java.ejercicios;

import java.util.Scanner;

public class MenuOpcion {
	
	public static void main(String[] args) {
		
		String menu = "1. Opción 1\n2. Opción 2\n3. Opción 3\n4. Opción 4\n5. Salir";
		System.out.println (menu);
		System.out.println ("Selecciona una opción:");
		
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();
		
		switch(opcion) {
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Has elegido la opción "+opcion);break;
		case 5: System.out.println("Adios!!!");break;
		default: System.out.println("Opcion incorrecta");
		}
	}

}
