package guerra.de.especies;

public class Guerrero {

	private String nombre;
	private String tipo;
	private int fuerza;
	private int resistencia;
	
	public Guerrero(String nombre, String tipo, int fuerza, int resistencia) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the fuerza
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * @param fuerza the fuerza to set
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * @return the resistencia
	 */
	public int getResistencia() {
		return resistencia;
	}

	/**
	 * @param resistencia the resistencia to set
	 */
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	
	
}
