package es.curso.java.herencia.hospital;

public class Enfermero extends EmpleadoHospital {

	private String planta;
	


	public Enfermero(long id, String nombre, int edad, String turno) {
		super(id, nombre, edad, turno);
		// TODO Auto-generated constructor stub
	}


	public Enfermero(long id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the planta
	 */
	public String getPlanta() {
		return planta;
	}


	/**
	 * @param planta the planta to set
	 */
	public void setPlanta(String planta) {
		this.planta = planta;
	}


	public void atenderPaciente(Paciente... pacientes) {
		for (Paciente paciente : pacientes) {
			System.out.println("El enfermero "+ getNombre() + " esta atendiendo al paciente " + paciente.getNombre());	
		}
	}
	
}
