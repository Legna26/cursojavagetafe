package es.curso.java.excepciones;

import java.io.IOException;

public class LanzarExcepciones {

	public static void main(String[] args) {
		
		LanzarExcepciones le = new LanzarExcepciones();
		try {
			le.test(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test (int num) throws IOException {
		
		if(num%2==0) {
			
			throw new IOException ("Mi error");
					
		}
	}
}
