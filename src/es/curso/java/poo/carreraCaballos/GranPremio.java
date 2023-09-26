package es.curso.java.poo.carreraCaballos;

import es.curso.java.utils.Utilidades;

public class GranPremio {

	private long id;
	private String nombre;
	private Carrera [] carreras;
	
	GranPremio(long id, String nombre, Carrera[] carreras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carreras = carreras;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	
	public void empezarGranPremio () {
		int caballoGanador = 0;
		int caballoApostar = 0;
		double importeApostar = 0;
		double apuesta = 0;
		for (Carrera carrera : carreras) {
			
			caballoApostar = Utilidades.pideDatoNumerico("Elige el número del caballo a apostar de la carrera " +  carrera.getNombre() );
			
			importeApostar =  Utilidades.pideDatoNumericoDouble("¿Cuánto desea apostar?");	
		}
		
		for (Carrera carrera : carreras) {
			caballoGanador = carrera.iniciarCarrera();
		}
		
		
		for (Carrera carrera : carreras) {		
			if ( caballoApostar == caballoGanador ) {
				apuesta = apuesta + (importeApostar * 5);
				System.out.println("Usted ganó la carrera " + carrera.getId());
			} else {
				System.out.println("Usted perdió la carrera " + carrera.getId());
			}
				
		}
		System.out.println("Usted gano un total de " + apuesta);
		
		
	}
	
}
