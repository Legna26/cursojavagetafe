package es.curso.java.poo.interfaces.ejercicio;

public class MainSistemaEncendido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainSistemaEncendido main = new MainSistemaEncendido();
		main.main();
		
	}
	
	private void main() {
		
		SistemaEncendido moto = new Moto (1,"AQZ234", "Honda", 2);
		moto.encender();
	}

}
