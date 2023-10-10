package es.curso.java.herencia.hospital;

public class Hospital {
	
	private String nombre;
	private Habitacion [] habitaciones;
	private Paciente [] salaDeEspera;
	
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.habitaciones = new Habitacion [2];
		this.salaDeEspera = new Paciente [3];
	}


	public void abrirHospital() {
		
		Habitacion hab1 = new Habitacion (1);
		Habitacion hab2 = new Habitacion (2);
		
		this.habitaciones[0] = hab1;
		this.habitaciones[1] = hab2;
		
		String [] sintomas = {"dolor de cabeza" , "dolor de estómago" };
		Paciente pac1 = new Paciente (01, "Michael", 30 , sintomas );
		Paciente pac2 = new Paciente (02, "Freddy", 42, new String [] {"fiebre", "dolor cabeza"} );
		Paciente pac3 = new Paciente (03, "Elvis", 35, new String [] {"fiebre", "dolor garganta"} );
		
		this.salaDeEspera[0] = pac1;
		this.salaDeEspera[1] = pac2;
		this.salaDeEspera[2] = pac3;
				
		Enfermero enf1 = new Enfermero (453, "Kurt", 37, "Turno2", 2);
		
		Doctor doc1 = new Doctor (554, "Benji" , 29, "Turno2" , "Cirugía General");
		
		//Fichar empleados
		EmpleadoHospital [] empleados = {enf1 , doc1};
		fichar(empleados);
		
		//Comer todos
		Persona [] personas = {pac1, pac2, pac3, enf1, doc1};
		comer(personas);
		
		pasarConsultas (enf1, doc1);
	}
	
	public void fichar (EmpleadoHospital[] empleados) {
		for (EmpleadoHospital empleado: empleados) {
			empleado.fichar();
		}
	}
	
	public void comer (Persona[] personas) {
		for (Persona persona : personas) {
			persona.comer();
		}
		
		for (Habitacion habitacion: this.habitaciones) {
			Enfermo enfermo = habitacion.getEnfermo();
			if(enfermo!=null) {
				enfermo.comer();
			}
		}
	}
	
	private void pasarConsultas (Enfermero enfermero, Doctor doctor) {
		
		int i = 0;
		for (Paciente paciente : salaDeEspera) {
			Paciente pacienteConsulta = enfermero.atenderPaciente(paciente);
			salaDeEspera [i]=null;
			i++;
			
			if (pacienteConsulta != null) {
				Enfermo enfermo = doctor.diagnosticarPaciente(pacienteConsulta);
				if (enfermo!=null) {
					hospitalizarEnfermo(enfermo);
				}
			} else {
				System.out.println("El paciente se encuentra bien, se va a casa.");
			}
			
		}
	}
	
	private boolean hospitalizarEnfermo (Enfermo enfermo) {
		
		for (Habitacion h : habitaciones) {
			//La habitacion está libre
			if (h.getEnfermo()==null) {
				System.out.println("El enfermo " + enfermo.getEdad() + " ingresado en la habitación " + h.getNumero());
				h.setEnfermo(enfermo);
				return true;
			}
		}
		
		return false;
	}
}
