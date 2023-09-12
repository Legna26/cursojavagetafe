package es.curso.java.introduccion.bucles.ejercicios;

public class EjercicioDado3 {
	
	public static void main(String[] args) {
		
		int dado;
		int contador = 0;
		int tiradas = 0;
		
		do {
			
			dado = (int)(Math.random()*6)+1;
			System.out.println(dado);
			tiradas++;
			
			if (dado==6) {
				
				contador++;
				
			} else {
				
				contador = 0;
			}
			
													
		} while (contador!=3);
		
		System.out.println("Se logró sacar 3 veces seguidas 6, en un total de " + tiradas + " tiradas.");
	}
	

}
