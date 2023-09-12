package es.curso.java.introduccion.strings;

public class SplitString {

	public static void main(String[] args) {
		
		//String [] alumnosNotas = {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4","Alumno5:5","Alumno6:10","Alumno7:4"};
		
		String alumnoNota = "Alumno1|9";
		String [] splitAlumnoNota = alumnoNota.split("\\|");
		
		
		// Ojo: solo "|" toma la separación por cada caracter, siempre colocar antes \\.
		
		System.out.println(splitAlumnoNota[1]);
	
	}

}
