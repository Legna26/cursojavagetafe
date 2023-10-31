package es.curso.java.colecciones.biblioteca;

import es.curso.java.poo.alumno.Alumno;
import es.curso.java.utils.Utilidades;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal biblioPrincipal = new Principal ();
		biblioPrincipal.menu();
	}

	private void menu () {
		
		Biblioteca biblioteca1 = new Biblioteca ("Biblioteca 1");
		
//		for (Libro libro : generaLibros()) {
//			biblioteca1.agregarLibro(libro);
//		}
		
		int opcion = 0;
		do {
			String [] menu = {"1. Agregar libros", "2. Ver libros disponibles" , "3. Préstamo de libros", "4. Devolución de libros", "5. Salir"};
			opcion = Utilidades.pintarMenu(menu , "Elija una opción a realizar:" );
		
		switch (opcion) {
		case 1:
			agregarLibro(biblioteca1);
			break;
			
		case 2:
			verDisponibles();
			
		case 3:
			prestarLibro();
			break;
		
		case 4:
			devolverLibro();
			break;
		
		case 5:
			System.out.println("¡Hasta la próxima!");
			break;
			
		default:
			System.out.println("Opción incorrecta.");
			break;
		
		} 
		} while (opcion!=4);
	}
	
	public Libro[] generaLibros () {
		
		Libro libro1 = new Libro ("Sinsajo", "Suzanne Collins" , 1);
		Libro libro2 = new Libro ("Harry Potter y la piedra filosofal", "J K Rowling", 3);
		Libro libro3 = new Libro ("El principito" , "Antoine de Saint-Euxpery", 0);
		Libro libro4 = new Libro ("Cien años de soledad", "Gabriel García Marquez", 2);
		return new Libro[] {libro1, libro2, libro3, libro4};
	}
	public void agregarLibro (Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("¿Cuál es el título del libro?");
		String autor = Utilidades.pideDatoTexto("¿Cuál es el autor del libro?");
		int copias = Utilidades.pideDatoNumerico("¿Cuántas copias desea agregar a la biblioteca?");
		
		Libro libro = new Libro (titulo, autor, copias);
		biblioteca.agregarLibro(libro);
	}
	
	public void prestarLibro () {
		
	}
	
	public void verDisponibles () {
		
	}
	
	public void devolverLibro() {
		
	}
}
