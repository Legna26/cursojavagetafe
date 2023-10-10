package es.curso.java.herencia.hospital;

public class Enfermero extends EmpleadoHospital {

	private int planta;
	
	public Enfermero(long id, String nombre, int edad, String turno, int planta) {
		super(id, nombre, edad, turno);
		this.planta = planta;
		// TODO Auto-generated constructor stub
	}

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
	public int getPlanta() {
		return planta;
	}


	/**
	 * @param planta the planta to set
	 */
	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Paciente atenderPaciente (Paciente paciente) {
		
		if (paciente.getSintomas().length>0) {
			return paciente;
		} else {
			return null;
		}
		
		
	}
	
	public Paciente[] atenderPaciente(Paciente[] salaDeEspera) {
		Paciente [] pacientesDoctor = new Paciente [ salaDeEspera.length];
		
		for (int i = 0; i < salaDeEspera.length; i++) {
			System.out.println("El enfermero "+ getNombre() + " esta atendiendo al paciente de la sala de espera " + (i+1));	
			pacientesDoctor[i]=salaDeEspera[i];
			salaDeEspera[i]=null;
		}
		return pacientesDoctor;
	}

	
	
	
}
