package es.curso.java.poo.alumno;

public class Alumno {
	
	String nombre;
	String apellidos;
	String dni;
	int nota;
	
	public Alumno () {
				
	}
	
	public Alumno(String nombre, String apellidos , String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;		
	}
	
	public Alumno (String nombre, String apellidos , String dni, int nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.nota =nota;
	}
	
	public String toString () {
		return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Nota: " + nota;
	}
	
	public void estudiar() {
		if (nota==0) {
			System.out.println("El alumno " + nombre + " no ha estudiado nada.");
		} else if (nota < 5) {
			System.out.println("El alumno " + nombre + " ha estudiado poco.");
		} else if (nota>5 & nota<9) {
			System.out.println("El alumno " + nombre + " ha estudiado mucho.");
		} else {
			System.out.println("El alumno " + nombre + " es un genio.");
		}
	}
	
}
