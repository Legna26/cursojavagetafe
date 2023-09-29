package es.curso.java.excepciones;

import es.curso.java.poo.supermercado.Cliente;

public class PruebaExcepciones {

	private static String [] colores;
	
	public static void main(String[] args) {

		System.out.println("Empieza");
		
		colores = new String [5];
		try {
			System.out.println(7/0);
			colores [2] = "azul";
			
			Cliente c = null;
			if (c!=null) {
				c.getNombre();
			}
			System.out.println("Pasa");
			
		} catch (NullPointerException npe) {
			System.out.println("Ha ocurrido un error: " + npe.getMessage());
			npe.printStackTrace();			
		} catch (ArrayIndexOutOfBoundsException aiobe) { 
			System.out.println("Ha ocurrido un error de tipo arrayoutbound " + aiobe.getMessage());
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error genérico: " + e.getMessage());
		} finally {
			System.out.println("Siempre se Ejecuta");
		}
		
		
		System.out.println("Termina");

	}

}
