package guerra.de.especies;

import guerra.de.especies.excepciones.LimiteValoresException;

public class Marciano extends Guerrero {

	public Marciano(String nombre) throws LimiteValoresException {
		super(nombre, "Marciano", 3, 7);
		// TODO Auto-generated constructor stub
	}

	public Marciano(String nombre, int fuerza, int resistencia ) throws LimiteValoresException {
		super(nombre, "Marciano", fuerza, resistencia);
	}
}