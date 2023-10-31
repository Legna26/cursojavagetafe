package es.curso.java.poo.alumno;

public class Alumno {
	
	//Variables de instancias
	private String nombre;
	private String apellidos;
	private String dni;
	private double nota;
	
	//Constructores
	public Alumno () {
				
	}
	
	public Alumno(String nombre, String apellidos , String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;		
	}
	
	public Alumno (String nombre, String apellidos , String dni, double nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.nota =nota;
	}
	
	//GETTER y SETTER
	
	public String getDni () {
		return this.dni;
	}
	public void setDni (String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	
//	public String toString () {
//		return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Nota: " + nota;
//	}
	
	@Override
	public String toString() {
		return "Alumno [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ "nota=" + nota + "]";
	}

	//Métodos
	public void estudiar() {
		
		if (this.nota==0) {
			System.out.println("El alumno " + this.nombre + " no ha estudiado nada.");
		} else if (this.nota < 5) {
			System.out.println("El alumno " + this.nombre + " ha estudiado poco.");
		} else if (this.nota>=5 && nota<9) {
			System.out.println("El alumno " + this.nombre + " ha estudiado mucho.");
		} else {
			System.out.println("El alumno " + this.nombre + " es un genio.");
		}
	}
	
}
