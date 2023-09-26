package es.curso.java.poo.carreraCaballos;

public class Carrera {

	private long id;
	private String nombre;
	private Caballo [] caballos;
	private double distancia;
	
	public Carrera(long id, String nombre, Caballo[] caballos, double distancia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.caballos = caballos;
		this.distancia = distancia;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Caballo[] getCaballos() {
		return caballos;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public int  iniciarCarrera() {
			
		Caballo [] caballos = this.caballos;
		
		String caballoGanadorNombre = null;
		
		Caballo caballoGanador = null;
		double distanciaCarrera = this.distancia;
		boolean hayGanador = false;
		
		System.out.println("=========== Empezando la "+ this.nombre + " ============");
		while (!hayGanador) {
			
		for (int i=0 ; i < caballos.length ; i++) {
						
				caballos[i].correr();
							
				if (caballos[i].getAvance() >= distanciaCarrera & caballoGanador == null) {
					caballoGanadorNombre = caballos[i].getNombre();
					caballoGanador = caballos[i];
					
					System.out.println("El caballo ganador es " + caballoGanadorNombre + " con número " + caballos[i].getNumero() );
					hayGanador = true;
					
					break;
				} 
			}
		}
		
		System.out.println("===================================");
		return caballoGanador.getNumero();
	}
	
}
