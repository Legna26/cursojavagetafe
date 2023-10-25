package guerra.de.especies;

import guerra.de.especies.excepciones.LimiteValoresException;

public class Marciano extends Guerrero {

	
	public Marciano(String nombre, String tipo, int fuerza, int resistencia, int vehiculoId)
			throws LimiteValoresException {
		super(nombre, tipo, fuerza, resistencia, vehiculoId);
		// TODO Auto-generated constructor stub
	}

	public Marciano(String nombre,  int vehiculoId) throws LimiteValoresException {
		super(nombre, "Marciano", 3, 7,  vehiculoId);
		// TODO Auto-generated constructor stub
	}

	
}
