package es.curso.java.introduccion;

public class Examen {

	public static void main(String[] args) {
		
		for (int i=1; i<=1000; i++) {
			if (i % 2 == 0)
			continue;
			if (i % 3 == 0)
			continue;
			System.out.println("Números: " + i);
			if (i >= 15)
			break;
			}

		boolean x = 3 > 2 && 6 < 10 || true;
		System.out.println(x);
		
	}

}
