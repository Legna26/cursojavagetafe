package es.curso.java.herencia.hospital;

import java.util.Random;

public class Doctor extends EmpleadoHospital {
	
	private String especialidad;

	public Doctor(long id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Doctor(long id, String nombre, int edad, String especialidad) {
		super(id, nombre, edad);
		this.especialidad = especialidad;
	}
	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public Enfermo diagnosticarPaciente (Paciente paciente) {
		
		Random rd = new Random();
		double randomEnfermedad = rd.nextInt(1,10);
		
		Enfermo enfermoNuevo = null;
		
		if(randomEnfermedad>8) {
			System.out.println("El paciente " + paciente.getNombre() + " está enfermo.");
			enfermoNuevo = new Enfermo (paciente.getId(), paciente.getNombre(), paciente.getEdad());
		}
		
		return enfermoNuevo;
	}

	@Override
	public void fichar() {
		
		System.out.println("El doctor "+ getNombre() + " esta fichando.");	
		
	}
	

	
}
