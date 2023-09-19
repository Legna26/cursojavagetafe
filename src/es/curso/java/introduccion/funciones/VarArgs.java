package es.curso.java.introduccion.funciones;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		metodo1("luis", "carmen");
		
	}
	
	public static void metodo1 (String... nombres) {
		for (String nombre : nombres) {
			System.out.println(nombre);			
		}		
	}

}
