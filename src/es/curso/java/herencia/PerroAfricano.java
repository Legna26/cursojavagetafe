package es.curso.java.herencia;

import es.curso.java.herencia.Animal;

public class PerroAfricano extends Animal{

	public PerroAfricano(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public void ladrar() {
		System.out.println("Esta ladrando");
	}
	
	
}
