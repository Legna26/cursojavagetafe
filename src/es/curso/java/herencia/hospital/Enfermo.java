package es.curso.java.herencia.hospital;

public class Enfermo extends Persona {
	
	private String enfermedad;
	
	public Enfermo(long id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Enfermo(long id, String nombre, int edad, String enfermedad) {
		super(id, nombre, edad);
		this.enfermedad = enfermedad;
	}
	
	public Enfermo (Paciente paciente, String enfermedad) {
		super (paciente.getId(), paciente.getNombre(), paciente.getEdad());
		this.enfermedad = enfermedad;
	}
	
	/**
	 * @return the enfermedad
	 */
	public String getEnfermedad() {
		return enfermedad;
	}


	/**
	 * @param enfermedad the enfermedad to set
	 */
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}


	public void comer () {
		System.out.println("El Paciente "+ getNombre() + " esta comiendo en la habitación.");
	}
	

}
