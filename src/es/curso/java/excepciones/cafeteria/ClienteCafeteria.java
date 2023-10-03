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
	
	void tomarTazaCafe (CoffeCup taza) throws TooHotTemperatureException , TooColdTemperatureException  {
		
		if (taza.getTemperatura() > 80 ) {
			
			throw new TooHotTemperatureException ("El café está muy caliente");
					
		} else if (taza.getTemperatura() < 20) {
			
			throw new TooColdTemperatureException ("El cafés está muy frío");
			
		} else {
			System.out.println("El cliente " + this.nombre + " se esta tomando la taza de café a " + taza.getTemperatura() + " grados");
		}
	}
	
}
