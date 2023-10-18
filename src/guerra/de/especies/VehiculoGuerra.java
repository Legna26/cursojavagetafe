package guerra.de.especies;

import java.util.List;

public class VehiculoGuerra implements Tripulable {

	private int puntosVida;
	private int ataque;
	private int defensa;
	private List<Guerrero> listaGuerreros;
	
	
	
	public VehiculoGuerra(int puntosVida, int ataque, int defensa, List<Guerrero> listaGuerreros) {
		super();
		this.puntosVida = 1000;
		this.ataque = 5;
		this.defensa = 5;
		this.listaGuerreros = listaGuerreros;
	}

	/**
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
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
	 * @return the lista
	 */
	public List<Guerrero> getLista() {
		return listaGuerreros;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<Guerrero> listaGuerreros) {
		this.listaGuerreros = listaGuerreros;
	}

	@Override
	public int atacar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defender(int puntoAtaque) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void embarcar(Guerrero ...guerreros) {
		// TODO Auto-generated method stub
		
	}

	
}
