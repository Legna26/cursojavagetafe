package es.curso.java.herencia.hospital;

public class Hospital {
	
	private String nombre;
	private Habitacion [] habitaciones;
	private int [] salaDeEspera;
	
	public Hospital(String nombre, Habitacion[] habitaciones, int[] salaDeEspera) {
		super();
		this.nombre = "Hospital de la Solidaridad";
		this.habitaciones = new Habitacion [2];
		this.salaDeEspera = new int [3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void abrirHospital() {
		
		Habitacion hab1 = new Habitacion (1);
		Habitacion hab2 = new Habitacion (2);
		
		Paciente pac1 = new Paciente (01, "Michael", 30 );
		Paciente pac2 = new Paciente (02, "Freddy", 42 );
		Paciente pac3 = new Paciente (03, "Elvis", 35 );
		
		Enfermero enf1 = new Enfermero (453, "Kurt", 37, "Medicina General");
		
		
	}
}
