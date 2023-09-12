package es.curso.java.ejercicios;

import java.util.Calendar;

public class EjercicioOperadores {

	public static void main(String[] args) {

		String nombre = "Emmy";
		String apellido = "Tamayo";
		int anioNac = 1995;

		Calendar fecha = Calendar.getInstance();
		int anio = fecha.get(Calendar.YEAR);

		int edad = anio - anioNac;
		boolean esPar = (anioNac % 2) == 0;

		System.out.println("El usuario es: " + nombre + " " + apellido + ", tiene " + edad + " años."
				+ "\n¿Nació en un año par?: " + esPar);

	}
}
