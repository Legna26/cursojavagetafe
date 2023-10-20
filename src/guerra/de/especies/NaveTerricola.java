package guerra.de.especies;

import java.util.Random;

import guerra.de.especies.excepciones.LimiteValoresException;

public class NaveTerricola extends VehiculoGuerra {

	public NaveTerricola(String nombre, int ataque, int defensa) throws LimiteValoresException {
		super(nombre, ataque, defensa);
	}
	
	public NaveTerricola(String nombre) throws LimiteValoresException {
		super(nombre, 5, 5);
	}

	@Override
	public int atacar() {
		
		Random rd = new Random();
		int randomAtq = rd.nextInt(0,5);
		int randomFuerzaGuerrero = rd.nextInt(0,1);
		
		int fuerzaTotal = 0;
		for (Guerrero guerrero : this.getGuerreros()) {
			
			int fuerzaGuerrero = guerrero.getFuerza();
			fuerzaTotal += fuerzaGuerrero;
		}
		
		
		int puntoAtaque = randomAtq*this.getAtaque() + fuerzaTotal * randomFuerzaGuerrero;
		
		System.out.println("La nave terrícola ataca con " + puntoAtaque + " puntos.");
		return puntoAtaque;
	}
	
	@Override
	public int defender(int puntoAtaque) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int randomDef = rd.nextInt(0,1);
		int randomResisGuerrero = rd.nextInt(0,5);
		
		int resistenciaTotal = 0;
		for (Guerrero guerrero : this.getGuerreros()) {
			
			int resistenciaGuerrero = guerrero.getResistencia();
			resistenciaTotal += resistenciaGuerrero;
		}
		
		int puntoDefensa = randomDef*this.getDefensa() + resistenciaTotal * randomResisGuerrero;
		
		System.out.println("La nave terrícola se defiende con " + puntoDefensa + " puntos");
		
		
		int puntosDescuento = 0;
		if (puntoAtaque>puntoDefensa) {
			puntosDescuento = puntoAtaque-puntoDefensa;
			System.out.println("La nave terrícola recibe un daño de " + puntosDescuento + " puntos");
		} else if (puntoAtaque < puntoDefensa ) {
			puntosDescuento = puntoAtaque-puntoDefensa;
			System.out.println("La nave terrícola recibe una regeneración de " + (puntosDescuento*-1) + " puntos");
		} else {
			puntosDescuento = 0;
			System.out.println("La nave terrícola no recibe daño");
		}
		return puntosDescuento;
	}

}
