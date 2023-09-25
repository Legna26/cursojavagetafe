package es.curso.java.poo.alumno;

public class AlumnoMain {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno ();
		a1.setNombre("Eva");
		a1.setApellidos("Perez");
		a1.setDni("A123");
		a1.setNota(10);
		
		Alumno a2 = new Alumno("Ben" , "Cuadros" , "B235");
		a2.setNota (4);
		Alumno a3 = new Alumno("Carl" , "Torres" , "C456" , 5);
		
		a1.estudiar();
		a2.estudiar();
		a3.estudiar();
		
		Alumno [] alumnos = {a1 , a2 , a3} ;
		
		AlumnoMain am = new AlumnoMain();
		am.alumnosAprobados(alumnos);
		
	}
	
	public  void alumnosAprobados (Alumno [] alumnos) {
		System.out.println("Los alumnos aprobados son: ");
		for ( Alumno alumno : alumnos) {
			
			if (alumno.getNota()>=5) {
				System.out.println(alumno.getDni());
				System.out.println(alumno.getNombre());
				System.out.println(alumno.getApellidos());
				System.out.println(alumno.getNota());
				System.out.println("==========================");
			}
		}
	}
}
