package es.curso.java.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.curso.java.poo.Persona;
import es.curso.java.poo.alumno.Alumno;
import es.curso.java.utils.Utilidades;

public class MapasEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno1 = new Alumno("Ale", "Alfaro", "646882", 9);
		Alumno alumno2 = new Alumno("Bob", "Bonifaz", "454986", 6);
		Alumno alumno3 = new Alumno("Caleb", "Carrillo", "879782", 7);
		Alumno alumno4 = new Alumno("Diego", "Duarte", "792098", 4);
		
		Map <String, Alumno> mapaAlumnos = new HashMap<String, Alumno>();
		
		mapaAlumnos.put(alumno1.getDni(), alumno1);
		mapaAlumnos.put(alumno2.getDni(), alumno2);
		mapaAlumnos.put(alumno3.getDni(), alumno3);
		mapaAlumnos.put(alumno4.getDni(), alumno4);
		
		
		MapasEjercicio mapsEjercicio = new MapasEjercicio();
		//mapsEjercicio.buscaDni(mapaAlumnos);
		
		List <Alumno> clase1 = new ArrayList<Alumno>();
		clase1.add(alumno1);
		clase1.add(alumno2);
		
		List <Alumno> clase2 = new ArrayList<Alumno>();
		clase2.add(alumno3);
		clase2.add(alumno4);
		
		Map <String, List<Alumno>> mapaColegios = new HashMap<String, List<Alumno>>();
		mapaColegios.put("Colegio Francisco Umbral", clase1);
		mapaColegios.put("Colegio Bellido", clase2);
		
		mapsEjercicio.buscaDni(mapaAlumnos);
	}
	
	//Mostrar la información de todos los alumnos
	private void muestraAlumno (Map <String, Alumno> mapaAlumnos) {
		
		Set<Entry<String,Alumno>> entries = mapaAlumnos.entrySet();
		for (Entry <String,Alumno> entry : entries) {
			System.out.println("DNI:" + entry.getKey() + " Nombre y apellidos: " + entry.getValue().getNombre() + " " + entry.getValue().getApellidos() 
			+ " Nota: " + entry.getValue().getNota());
		}
	}
	
	//A partir de un dni, mirar si esta el alumno en el mapa 
	//y si está devolver la información del alumno
	private void buscaDni (Map <String, Alumno> mapaAlumnos) {
				
		Set<String> claves = mapaAlumnos.keySet(); 
		String dniABuscar = Utilidades.pideDatoTexto("Indique el DNI a buscar: ");
		boolean alumnoNoExiste = true;
		for (String dni : claves) {
					
			if (dni.equals(dniABuscar)) {
				System.out.println("DNI: " + dni);
				System.out.println(((Alumno) mapaAlumnos.get(dni)).getNombre() + " " + ((Alumno) mapaAlumnos.get(dni)).getApellidos());
				alumnoNoExiste = false;
				break;
			} else
				alumnoNoExiste = true;
		}
		if (alumnoNoExiste) 
			System.out.println("Alumno no existe en la base de datos.");
		
	}
	
	// Devolver la nota media de todos los alumnos
	private void notaMedia (Map <String, Alumno> mapaAlumnos) {
		double notaTotal = 0;
		Collection<Alumno> valores = mapaAlumnos.values();
		for (Alumno alumno : valores) {
			
			notaTotal += alumno.getNota();
			
		}
		System.out.println("La nota media es: " + notaTotal/valores.size());
	}

	// Mostrar el nombre de cada colegio con todos los alumnos de ese colegio
	private void muestraColegio (Map <String, List<Alumno>> mapaColegio) {
		Set<Entry<String,List<Alumno>>> entries = mapaColegio.entrySet();
		for (Entry<String,List<Alumno>> entry : entries) {
			System.out.println("Alumnos - " + entry.getKey());
			for (Alumno alumno : entry.getValue()) {
				
				System.out.println(alumno.getNombre() + " " + alumno.getApellidos() + " - Nota:" + alumno.getNota() );
			}
		System.out.println("===========================");
		}
		
	}
	
	
	private void buscaDniColegio (Map <String, List<Alumno>> mapaColegio) {
		
		String dniABuscar = Utilidades.pideDatoTexto("Indique el DNI a buscar: ");
		boolean alumnoNoExiste = true;
		Set<Entry<String,List<Alumno>>> entries = mapaColegio.entrySet();
		for (Entry<String,List<Alumno>> entry : entries) {
			for (Alumno alumno : entry.getValue()) {
				
				if(dniABuscar.equalsIgnoreCase(alumno.getDni())) {
					System.out.println(alumno.getNombre() + " " + alumno.getApellidos() + " pertenece al " + entry.getKey());
					alumnoNoExiste = false;
					break;
				} else
					alumnoNoExiste = true;
				}
			}
		if (alumnoNoExiste) 
			System.out.println("Alumno no existe en la base de datos.");
		}
			
		
			
			
			
			
	
	
}
