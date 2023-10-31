package es.curso.java.colecciones.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Biblioteca {
	
	private String nombre;
	private HashMap <String, Libro> libros;
	
	public Biblioteca(String nombre) {
		super();
	}
	
	public Biblioteca(String nombre, HashMap<String, Libro> libros) {
		super();
		this.nombre = nombre;
		this.libros = libros;
	}
	
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the libros
	 */
	public HashMap<String, Libro> getLibros() {
		return libros;
	}

	/**
	 * @param libros the libros to set
	 */
	public void setLibros(HashMap<String, Libro> libros) {
		this.libros = libros;
	}

	public void agregarLibro (Libro libro) {
		
		if (this.libros == null) {
			this.libros = new HashMap <String, Libro>();
		}
		Set<String> titulos = this.libros.keySet();
		
		
		
		
		
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
