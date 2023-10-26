package guerra.de.especies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import guerra.de.especies.excepciones.LimiteValoresException;
import guerra.de.especies.excepciones.UnidadesPermitidasException;

public abstract class VehiculoGuerra implements Tripulable {

	private long id;
	
	private String nombre;
	private int ataque;
	private int defensa;
	int puntosVida = PUNTOS_VIDA;
	private List<Guerrero> guerreros = new ArrayList<Guerrero>();
	
	
	private VehiculoGuerra(int ataque, int defensa) throws LimiteValoresException {
		
		if(ataque+defensa>10) {
			throw new LimiteValoresException ("La suma de ataque y defensa no pude ser superior a 10");
		}else {
			this.ataque = ataque;
			this.defensa = defensa;
		}
		
	}
	
	public VehiculoGuerra(String nombre, int ataque, int defensa) throws LimiteValoresException {
		this(ataque, defensa);
		this.nombre = nombre;
	}
	
	
	/**
	 * Inicializa la nave con los valores de ataque y defensa en 5
	 * *@param nombre
	 */
	public VehiculoGuerra(String nombre) throws LimiteValoresException {
		this(5,5);		
		this.nombre = nombre;
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
	 * @return the puntosVida
	 */
	int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * @param puntosVida the puntosVida to set
	 */
	void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	/**
	 * @return the ataque
	 */
	public int getAtaque() {
		return ataque;
	}

	/**
	 * @param ataque the ataque to set
	 */
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	/**
	 * @return the defensa
	 */
	public int getDefensa() {
		return defensa;
	}

	/**
	 * @param defensa the defensa to set
	 */
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	/**
	 * @return the guerreros
	 */
	public List<Guerrero> getGuerreros() {
		return guerreros;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	public void embarcarGuerrero (Guerrero guerrero) throws UnidadesPermitidasException {
		
		if (this.guerreros.size()<10) {
			this.guerreros.add(guerrero);
		} else {
			throw new UnidadesPermitidasException("Has superado el numero máximo establecido en 10.");
		}
		
	}
	

	
	
	
	
}
