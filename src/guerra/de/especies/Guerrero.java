package guerra.de.especies;

import guerra.de.especies.excepciones.LimiteValoresException;

public class Guerrero {

	private String nombre;
	private String tipo;
	private int fuerza;
	private int resistencia;
	private int vehiculoId;
	
	public Guerrero(String nombre, String tipo, int fuerza, int resistencia, int vehiculoId) throws LimiteValoresException {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.vehiculoId = vehiculoId;
		if (fuerza + resistencia > 10) {
			throw new LimiteValoresException ("La suma de fuerza y resistencia no pude ser superior a 10.");
		} else {
			this.fuerza = fuerza;
			this.resistencia = resistencia;
		}
		
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
	void setFuerza(int fuerza) {
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
	void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	/**
	 * @return the vehiculoId
	 */
	public int getVehiculoId() {
		return vehiculoId;
	}

	/**
	 * @param vehiculoId the vehiculoId to set
	 */
	public void setVehiculoId(int vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	
}
