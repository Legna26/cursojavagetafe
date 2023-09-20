package es.curso.java.poo.alumno;

public class AlumnoMain {

	public static void main(String[] args) {
		
		Alumno p1 = new Alumno ();
		p1.nombre = "Eva";
		p1.apellidos = "Perez";
		p1.dni = "A123";
		p1.nota = 10;
		
		Alumno p2 = new Alumno("Ben" , "Cuadros" , "B2345");
		Alumno p3 = new Alumno("Carl" , "Torres" , "C456" , 5);
		
		p1.estudiar();
		p2.estudiar();
		p3.estudiar();
		
		Alumno [] alumnos = {p1 , p2 , p3} ;
		
		alumnosAprobados(alumnos);
		
	}
	
	public static void alumnosAprobados (Alumno [] alumnos) {
		System.out.println("Los alumnos aprobados son: ");
		for ( int i=0 ; i<alumnos.length ; i++) {
			int nota = alumnos[i].nota;
			if (nota>=5) {
			System.out.println(alumnos [i] );
			}
		}
	}
}
