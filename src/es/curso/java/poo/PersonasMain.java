package es.curso.java.poo;

public class PersonasMain {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.nombre ="Eva";
		System.out.println(p1.nombre);
		
		Persona p2 = new Persona("Raúl");
		System.out.println(p2.nombre);
		
		Persona p3 = p1;
		p1 = p2 ;
		p2.nombre = "María";
		
		System.out.println(p1.nombre);
		System.out.println(p3.nombre);
		
		p1.edad = 34;
		p2.correr();
		
		p3.edad = 18;
		p3.correr();
		
	}

}
