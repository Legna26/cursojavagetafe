package es.curso.java.herencia.hospital;

public class Paciente extends Persona {

	private String [] sintomas;
	
	
		
	public Paciente(long id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Paciente(long id, String nombre, int edad, String [] sintomas) {
		super(id, nombre, edad);
		this.sintomas = sintomas;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the sintomas
	 */
	public String[] getSintomas() {
		return sintomas;
	}


	/**
	 * @param sintomas the sintomas to set
	 */
	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}


	@Override
	public void comer() {
		System.out.println("El Paciente "+ getNombre() + " esta comiendo en la cafetería.");
	}




}
