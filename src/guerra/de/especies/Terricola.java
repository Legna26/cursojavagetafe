package guerra.de.especies;

import guerra.de.especies.excepciones.LimiteValoresException;

public class Terricola extends Guerrero {

	public Terricola(String nombre, String tipo, int fuerza, int resistencia, int vehiculoId)
			throws LimiteValoresException {
		super(nombre, tipo, fuerza, resistencia, vehiculoId);
		// TODO Auto-generated constructor stub
	}

	public Terricola(String nombre, int vehiculoId) throws LimiteValoresException {
		super(nombre, "Terrícola", 6 , 4, vehiculoId);
	}
	


	
}
