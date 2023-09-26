package es.curso.java.poo.carreraCaballos;

import es.curso.java.utils.Utilidades;

public class CasaApuestas {

	public static void main(String[] args) {

		Caballo caballo1 = new Caballo (1053 ,"Tiro al Blanco", 15 , 5 , 70 , 200 );
		Caballo caballo2 = new Caballo (1485 ,"Spirit" , 22 , 6 , 80 , 250 );
		Caballo caballo3 = new Caballo (1296, "Pegaso" , 65, 7, 75, 300);
		
		Caballo [] caballos = {caballo1 , caballo2 , caballo3};
		Caballo [] caballos2 = {caballo1 , caballo2 };
		Carrera carrera1 = new Carrera (1, "Carrera rápida" , caballos , 1500 );
		Carrera carrera2 = new Carrera (2, "Carrera en Directo" , caballos2 , 2500 );

		Carrera [] carreras = {carrera1, carrera2};
		GranPremio gp = new GranPremio(4889, "Gran Premio nuevo", carreras);
		
		CasaApuestas ap = new CasaApuestas ();
		ap.mostrarGranPremio(gp);
		 
		gp.empezarGranPremio();
	}

	public void mostrarGranPremio (GranPremio gp) {
		System.out.println("Las carreras a correr del "+ gp.getNombre() + " son:");
		System.out.println("===========================");
		Carrera [] carreritas = gp.getCarreras();
		
		for (Carrera carrerita :carreritas) {
			
			System.out.println("ID: " + carrerita.getId());
			System.out.println("Nombre: " + carrerita.getNombre());
			System.out.println("Distancia: " + carrerita.getDistancia());
			
			System.out.println("Los caballos participantes son: ");
			Caballo [] caballitos = carrerita.getCaballos();
			
			for (Caballo caballito : caballitos) {
			System.out.println("Número Caballo: " + caballito.getNumero());
			System.out.println("Nombre: " + caballito.getNombre());
			System.out.println("========================");
			}
		
		}
	}
}

