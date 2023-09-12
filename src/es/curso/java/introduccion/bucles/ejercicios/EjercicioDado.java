package es.curso.java.introduccion.bucles.ejercicios;

public class EjercicioDado {
	
	public static void main(String[] args) {
					
		for (int i=0; i<1000; ) {
			
			i = (int)(Math.random()*36);
			System.out.println(i);
			
			if (i==6) {
				
				break;
				
			}
								
		}
		
		System.out.println("Salio 6!");
	}
	

}
