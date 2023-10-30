package es.curso.java.colecciones.biblioteca;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Biblioteca {
	
	private String nombre;
	private HashMap <String, Libro> libros;
	
	public Biblioteca(String nombre, HashMap<String, Libro> libros) {
		super();
		this.nombre = nombre;
		this.libros = libros;
	}

	public void agregarLibro (Libro libro) {
		
		this.libros.put(libro.getTitulo(), libro);
	}

	public void prestarLibro (Libro libro) {
		
		Set <Entry<String, Libro>> entries = this.libros.entrySet();
		for (Entry <String, Libro> entry : entries) {
			if(libro.getTitulo().equalsIgnoreCase(entry.getKey())) {
				libro.setNumCopias(libro.getNumCopias()-1);
			}
		}
		
	}
	
	public void devolverLibro (Libro libro) {
		
		Set <Entry<String, Libro>> entries = this.libros.entrySet();
		for (Entry <String, Libro> entry : entries) {
			if(libro.getTitulo().equalsIgnoreCase(entry.getKey())) {
				libro.setNumCopias(libro.getNumCopias()+1);
			}
		}
		
		
	}
}
