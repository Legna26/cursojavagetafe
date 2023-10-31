package es.curso.java.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.curso.java.poo.Persona;
import es.curso.java.poo.alumno.Alumno;
import es.curso.java.utils.Utilidades;

public class MapaAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapaAlumnos mapAlumnos = new MapaAlumnos();

		//mapAlumnos.inicioEjercicio();		
		mapAlumnos.inicioEjercicio2();
		
	}
	
	public void inicioEjercicio() {
		
		Map <String, Alumno> mapaAlumnos = new HashMap<String, Alumno>();
		
		for (Alumno alumno : generaAlumnos()) {
			mapaAlumnos.put(alumno.getDni(), alumno);
		}
		
		muestraAlumno(mapaAlumnos);
		buscaDniAlumno(mapaAlumnos);
		notaMedia(mapaAlumnos);
		
	}
	
	public void inicioEjercicio2() {
		
		Map <String, List<Alumno>> mapaColegios = new HashMap<String, List<Alumno>>();
		Alumno [] alumnos = generaAlumnos();
		
		List <Alumno> clase1 = Arrays.asList(alumnos[0], alumnos[1]);
				
		List <Alumno> clase2 = new ArrayList<Alumno>();
		clase2.add(alumnos[2]);
		clase2.add(alumnos[3]);
		
		mapaColegios.put("Colegio Francisco Umbral", clase1);
		mapaColegios.put("Colegio Bellido", clase2);
		
		Set<String> colegios = mapaColegios.keySet();
		for(String colegio : colegios) {
			System.out.println(colegio);
			List<Alumno> alumnosCole = mapaColegios.get(colegio);
			for (Alumno alumno : alumnosCole) {
				System.out.println("\t"+alumno);
			}
		}
		muestraColegio(mapaColegios);
		buscaDniColegio(mapaColegios);
	}
	
	public Alumno[] generaAlumnos () {
		Alumno alumno1 = new Alumno("Ale", "Alfaro", "646882", 9);
		Alumno alumno2 = new Alumno("Bob", "Bonifaz", "454986", 6);
		Alumno alumno3 = new Alumno("Caleb", "Carrillo", "879782", 7);
		Alumno alumno4 = new Alumno("Diego", "Duarte", "792098", 4);
		
		// Alumno[] alumnos = {alumno1, alumno2, alumno3, alumno4};
		// return alumnos;
		
		return new Alumno[] {alumno1, alumno2, alumno3, alumno4};
	}
	//Mostrar la información de todos los alumnos
	public void muestraAlumno (Map <String, Alumno> mapaAlumnos) {
		
//		Set<Entry<String,Alumno>> entries = mapaAlumnos.entrySet();
//		for (Entry <String,Alumno> entry : entries) {
//			System.out.println("DNI:" + entry.getKey() + " Nombre y apellidos: " + entry.getValue().getNombre() + " " + entry.getValue().getApellidos() 
//			+ " Nota: " + entry.getValue().getNota());
//		}
		
		Collection <Alumno> alumnos = mapaAlumnos.values();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}
	
	//A partir de un dni, mirar si esta el alumno en el mapa 
	//y si está devolver la información del alumno
	public void buscaDniAlumno (Map <String, Alumno> mapaAlumnos) {
				
//		Set<String> claves = mapaAlumnos.keySet(); 
//		String dniABuscar = Utilidades.pideDatoTexto("Indique el DNI a buscar: ");
//		boolean alumnoNoExiste = true;
//		for (String dni : claves) {
//					
//			if (dni.equals(dniABuscar)) {
//				System.out.println("DNI: " + dni);
//				System.out.println(((Alumno) mapaAlumnos.get(dni)).getNombre() + " " + ((Alumno) mapaAlumnos.get(dni)).getApellidos());
//				alumnoNoExiste = false;
//				break;
//			} else
//				alumnoNoExiste = true;
//		}
//		if (alumnoNoExiste) 
//			System.out.println("Alumno no existe en la base de datos.");
		
		String dniABuscar = Utilidades.pideDatoTexto("Indique el DNI a buscar: ");
		
		Alumno alumnoEncontrado = mapaAlumnos.get(dniABuscar);
		
		if (alumnoEncontrado!=null) {
			System.out.println(alumnoEncontrado);
		} else {
			System.out.println("Alumno con " + dniABuscar + " no existe en la base de datos.");
		}
		
		
//		if(mapaAlumnos.containsKey(dniABuscar)) {
//			System.out.println(mapaAlumnos.get(dniABuscar));
//		} else {
//			System.out.println("Alumno con " + dniABuscar + " no existe en la base de datos.");
//		}
		
	}
	
	// Devolver la nota media de todos los alumnos
	private void notaMedia (Map <String, Alumno> mapaAlumnos) {
		double notaTotal = 0;
		Collection<Alumno> alumnos = mapaAlumnos.values();
		for (Alumno alumno : alumnos) {
			
			notaTotal += alumno.getNota();
			
		}
		System.out.println("La nota media es: " + notaTotal/alumnos.size());
	}

	// Mostrar el nombre de cada colegio con todos los alumnos de ese colegio
	public void muestraColegio (Map <String, List<Alumno>> mapaColegio) {
		
		Set<Entry<String,List<Alumno>>> entries = mapaColegio.entrySet();
		for (Entry<String,List<Alumno>> entry : entries) {
			System.out.println("Alumnos - " + entry.getKey());
			for (Alumno alumno : entry.getValue()) {
				
				System.out.println(alumno.getNombre() + " " + alumno.getApellidos() + " - Nota:" + alumno.getNota() );
			}
		System.out.println("===========================");
		}
		
	}
	
	
	public void buscaDniColegio (Map <String, List<Alumno>> mapaColegio) {
		
		String dniABuscar = Utilidades.pideDatoTexto("Indique el DNI a buscar: ");
		boolean alumnoEncontrado= false;
		Set<Entry<String,List<Alumno>>> colegioEntries = mapaColegio.entrySet();
		for (Entry<String,List<Alumno>> entry : colegioEntries) {
			for (Alumno alumno : entry.getValue()) {
				
				if(dniABuscar.equalsIgnoreCase(alumno.getDni())) {
					System.out.println(alumno.getNombre() + " " + alumno.getApellidos() + " pertenece al " + entry.getKey());
					alumnoEncontrado = true;
					break;
				} else
					alumnoEncontrado = false;
				}
		
		
			if (alumnoEncontrado) 
				break;
						
		}	
		if (!alumnoEncontrado) 
			System.out.println("Alumno no existe en la base de datos.");
	}	

}
