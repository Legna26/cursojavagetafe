package es.curso.java.excepciones.cafeteria;

public class ClienteCafeteria {

	private String nombre;

	public ClienteCafeteria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void tomarTazaCafe (CoffeCup taza) throws TemperatureException {
		double temperatura = taza.getTemperatura();
		
		if (temperatura > 80 ) {
			
			throw new TooHotTemperatureException ();
			
		} else if (temperatura < 20) {
			
			throw new TooColdTemperatureException ();
			
		} else {
			System.out.println("El cliente se esta tomando la taza de café a " +temperatura + " grados");
		}
	}
	
}
