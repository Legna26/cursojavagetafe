package es.curso.java.introduccion.array;

import java.util.Scanner;

public class AlumnosMenuNotas {

	public static void main(String[] args) {

		System.out.println("¿Cuántas aulas hay?");
		Scanner scan = new Scanner(System.in);
		int numAulas = scan.nextInt();

		String [][] colegio = new String [numAulas][];		
		
		for (int i = 0; i < colegio.length; i++){	
			
			System.out.println("¿Cuántas alumnos hay en la aula " + i + "?");
			scan = new Scanner(System.in);
			int numAlumnos = scan.nextInt();
			
			colegio [i] = new String [numAlumnos];
			
		}
		
		int opcion;
		
		do {
		
		String menu = "1. Insertar alumno nuevo.\n2. Mostrar Alumnos por aula.\n3. Mostrar todos los alumnos aprobados.\n4. Buscar alumno.\n"
				+ "5. Borrar alumno.\n6. Salir.";
		System.out.println(menu);
		System.out.println("Selecciona una opción.");
		scan = new Scanner(System.in);
		opcion = scan.nextInt();
		System.out.println(opcion);
		
		switch(opcion) {
		case 1:
			
			System.out.println("¿A qué aula quiere ingresar?");
			scan = new Scanner(System.in);
			int numAula = scan.nextInt();
			
			String [] aula = colegio [numAula-1];
				
			for (int i = 0; i < aula.length; i++){	
					
				if (aula[i]==null) {
					System.out.println("Nombre del Alumno: ");
					scan = new Scanner(System.in);
					String nombre = scan.nextLine();
					
					System.out.println("DNI del Alumno: ");
					scan = new Scanner(System.in);
					String dni = scan.nextLine();		
					
					System.out.println("Nota del Alumno: ");
					scan = new Scanner(System.in);
					String nota = scan.nextLine();
					
								
					aula [i]= nombre+":"+dni+":"+nota;
					
					//colegio[numAula-1][i] = dato;
					
					break;
					} 
						
				}
				
				
			
			break;
			
			
			
		case 2:
			
			System.out.println("¿Qué aula quiere mostrar?");
			scan = new Scanner(System.in);
			int aulaMostrar = scan.nextInt();
			
			System.out.println("Aula " + aulaMostrar);
			
			for (int i = 0 ; i < colegio[aulaMostrar].length ; i++) {	
								
			    System.out.println("\t"+colegio[aulaMostrar][i]);
									
				}
			;break;	
			
		case 3:
			
		case 4:
			
			System.out.println("Número de DNI del alumno a buscar:");
			scan = new Scanner(System.in);
			String dniBuscar = scan.nextLine();
			
			boolean alumnoEncontrado = false;
			
			for (int i = 0; i < colegio.length && !alumnoEncontrado; i++){	
								
				for (int j = 0; j < colegio[i].length && !alumnoEncontrado; j++) {
					
					String datosAlumno = colegio [i][j];
					String dniAlumno = datosAlumno.split(":")[1];
					
					if (dniBuscar.equalsIgnoreCase(dniAlumno)) {
						
						System.out.println("El alumno se encuentra en el aula " + (i+1) );
						alumnoEncontrado=true;
						break;
					}						
				}
				
			}
			
		case 5:
			
			System.out.println("Número de DNI del alumno a borrar:");
			scan = new Scanner(System.in);
			String dniBorrar = scan.nextLine();
			
			for (int i = 0; i < colegio.length; i++){	
				
				for (int j = 0; j < colegio[i].length ; j++) {
					
					if (colegio[i][j].contains(dniBorrar)) {
						
						System.out.println("El alumno se encuentra en el aula " + i );
						
					} else {
						
						System.out.println("El alumno no pertenece a ningún aula");
					}
						
				}
				
			}
			
		case 6:System.out.println("Adiós, vuelva pronto!!!");break;
		default: System.out.println("Opción incorrecta");
		
		}
		
		}
		
		while (opcion!=6);
		

		
	}
}
