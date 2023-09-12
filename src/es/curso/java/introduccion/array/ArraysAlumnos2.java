package es.curso.java.introduccion.array;

public class ArraysAlumnos2 {

	public static void main(String[] args) {
		
		String [] alumnosNotas = {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4","Alumno5:5","Alumno6:10","Alumno7:4"};
		
		for(String alumno : alumnosNotas) {
			
			System.out.println(alumno);
		}
		
	
		int numAprob = 0;
		
		
		for (int i = 0; i < alumnosNotas.length; i++){	
			
			String [] nombreAlus = new String [alumnosNotas.length];
			nombreAlus [i] = (alumnosNotas[i]).substring(0,alumnosNotas[i].indexOf(":"));
				
			int [] notas = new int [alumnosNotas.length];
			notas [i] =Integer.parseInt((alumnosNotas[i]).substring(alumnosNotas[i].indexOf(":")+1));
			
			//System.out.println(nombreAlu);
			//System.out.println(notas);
			
			if (notas[i]>=5) {
				
				numAprob++;
				System.out.println(nombreAlus[i] + " aprobado");
				
			}
			
		}
		
		System.out.println("Existen " + numAprob + " aprobados.");
		
		String [] alumnosAprobados = new String [numAprob];
		
		int numVuelta = 0;
		
		for (int i = 0; i < alumnosNotas.length ; i++){	
			
			String nombre = (alumnosNotas[i]).substring(0,alumnosNotas[i].indexOf(":"));
			
			int nota =Integer.parseInt((alumnosNotas[i]).substring(alumnosNotas[i].indexOf(":")+1));
			
			if (nota>=5) {
				
				alumnosAprobados [numVuelta] = nombre;		
			    numVuelta++;
							
			}
					
		}
		
		System.out.println("Los alumnos aprobados son: ");
		
		for (String aprobado : alumnosAprobados) {
			
			System.out.println(aprobado);
		}

	}

}
