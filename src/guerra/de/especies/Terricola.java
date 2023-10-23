package guerra.de.especies;

import guerra.de.especies.excepciones.LimiteValoresException;

public class Terricola extends Guerrero {

	public Terricola(String nombre) throws LimiteValoresException {
		super(nombre, "Terrícola", 6 , 4);
	}
	
	public Terricola(String nombre, int fuerza, int resistencia) throws LimiteValoresException {
		super(nombre, "Terrícola", fuerza , resistencia);
	}

	
}
