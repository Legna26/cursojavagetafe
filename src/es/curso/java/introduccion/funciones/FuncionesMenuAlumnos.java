package es.curso.java.introduccion.funciones;

import es.curso.java.introduccion.funciones.utils.Utilidades;

public class FuncionesMenuAlumnos {

	final static String [] OPCIONES = {"1. Insertar alumno nuevo.","2. Mostrar Alumnos por aula.","3. Mostrar todos los alumnos aprobados.","4. Buscar alumno.",
			"5. Borrar alumno","6. Salir."};
	
	private static String [][] colegio;
	
	public static void main(String[] args) {
		
		int numAulas = Utilidades.pideDatoNumerico("¿Cuántas aulas hay en el colegio?");
		colegio = new String [numAulas][];	
		
		for (int i = 0; i < colegio.length; i++){	
			System.out.println("Aula" + (i+1));
			colegio [i] = new String [Utilidades.pideDatoNumerico("¿Cuántas alumnos hay en la aula?"+(i+1))];
		}
		
		int opcionFinal = 0;
		do {
		
		opcionFinal = Utilidades.pintarMenu(OPCIONES,"Introduce una opción:");
		
		switch(opcionFinal) {
		case 1: inserteAlumno();
			break;
		
		case 2: mostrarAlumno();
			break;
			
		case 3: mostrarAlumnosAprobados();
			break;
			
		case 4: buscarAlumno();
			break;
			
		case 5: borrarAlumno();
			break;
			
		case 6: System.out.println("Adios");
			break;
		
		default: System.out.println("Opcion incorrecta");
		}
		
	} while(opcionFinal!=6);
		

	}
	
	public static void inserteAlumno () {
	
	int numAula = Utilidades.pideDatoNumerico("¿En qué aula quieres insertarlo?");
	String[] aula = colegio[numAula-1];
	
	boolean claseLlena = true;
	for (int i = 0; i < aula.length; i++) {
		if (aula[i]==null) {
			System.out.println("Posición "+(i+1)+ " libre");
			claseLlena=false;
			String nombre = Utilidades.pideDatoTexto("Introduce el nombre");
			
			String dni = Utilidades.pideDatoTexto("Introduce el dni");
			
			String nota = Utilidades.pideDatoTexto("Introduce la nota");
			
			aula[i]=nombre+":"+dni+":"+nota;
			
			break;
		}
	}
	if (claseLlena) {
		System.out.println("El aula está llena");
	}

	}
	
	public static void mostrarAlumno () {
	
	for (int i=0;i<colegio.length;i++) {
		System.out.println("Aula: "+(i+1));
		for(int j=0;j<colegio[i].length;j++) {
			String datosAlumno = colegio[i][j];
			if (datosAlumno!=null) {
				String [] datosAlumnosArray = datosAlumno.split(":");
				System.out.println("\t"+datosAlumnosArray[0]+ " " 
					+datosAlumnosArray[1]+ " "+ datosAlumnosArray[2]);
			}
		}
	}
	}
	
	public static void mostrarAlumnosAprobados () {
		
		for (String [] aulaFE : colegio) {
			for ( String datosAlumno : aulaFE ) {
				if (datosAlumno!=null) {
					String [] datosAlumnosArray = datosAlumno.split(":");
					int nota = Integer.parseInt(datosAlumnosArray[2]);
					if (nota>=5) {
						System.out.println("\t"+datosAlumnosArray[0]+ " " 
								+datosAlumnosArray[1]+ " "+ 
								datosAlumnosArray[2]);
					}
				}
			}
		}
	}
	
	public static void buscarAlumno () {
		
		String dni = Utilidades.pideDatoTexto("Introduce el dni del alumno a buscar");
		
		boolean alumnoEncontrado = false;
		for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
			for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
				String datosAlumno = colegio[i][j];
				//Me aseguro de que haya información en esa posición
				if (datosAlumno!=null) {
					String dniAlumno = datosAlumno.split(":")[1];
					if (dni.equalsIgnoreCase(dniAlumno)) {
						System.out.println("El alumnos está en el aula "+(i+1));
						alumnoEncontrado=true;
					}
				}
			}
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno con dni "+dni+" no está en el colegio");
		}
	}
	
	public static void borrarAlumno () {
		
		String dni = Utilidades.pideDatoTexto("Introduce el dni del alumno a borrar");
		
		boolean alumnoEncontrado = false;
		for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
			for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
				String datosAlumno = colegio[i][j];
				//Me aseguro de que haya información en esa posición
				if (datosAlumno!=null) {
					String dniAlumno = datosAlumno.split(":")[1];
					if (dni.equalsIgnoreCase(dniAlumno)) {
						colegio[i][j]=null;
						alumnoEncontrado=true;
						System.out.println("Alumno borrado");
					}
				}			
			}	
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno con dni "+dni+" no está en el colegio");
		}
	}
	
     
}
