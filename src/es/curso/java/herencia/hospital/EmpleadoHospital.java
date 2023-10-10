package es.curso.java.herencia.hospital;

public abstract class EmpleadoHospital extends Persona {

	private String turno;
	
	public EmpleadoHospital(long id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoHospital(long id, String nombre, int edad, String turno) {
		super(id, nombre, edad);
		this.turno = turno;
	}
	
	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("El empleado "+ getNombre() + " esta comiendo en la comedor.");
	}

	public void fichar() {
		System.out.println("El empleado " + this.getNombre() + " esta fichando");
	}
	
	
	
}
