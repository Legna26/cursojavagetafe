package es.curso.java.poo;

//POJO
public class Persona {

	//Variables de instancia
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	//Constructor (se suelen escoger las variables más comunes)
	public Persona()  {
		this.nombre = "Juan";
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	
	//métodos
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void correr() {
		System.out.println("La persona con nombre " + nombre + " y edad " + edad + " está corriendo:");
		if (edad<25) {
			System.out.println("Muy rápido");
		} else {
			System.out.println("Muy lento");
		}
		
	}
	
}
