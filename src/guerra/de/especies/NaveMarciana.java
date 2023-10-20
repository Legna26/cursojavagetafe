package guerra.de.especies;

import java.util.Random;

import guerra.de.especies.excepciones.LimiteValoresException;

public class NaveMarciana extends VehiculoGuerra {

	public NaveMarciana(String nombre, int ataque, int defensa) throws LimiteValoresException {
		super(nombre, ataque, defensa);
		// TODO Auto-generated constructor stub
	}

	public NaveMarciana(String nombre) throws LimiteValoresException {
		super(nombre, 7 , 3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int randomAtq = rd.nextInt(0,5);
		int randomFuerzaGuerrero = rd.nextInt(0,1);
		
		int fuerzaTotal = 0;
		for (Guerrero guerrero : this.getGuerreros()) {
			
			int fuerzaGuerrero = guerrero.getFuerza();
			fuerzaTotal += fuerzaGuerrero;
		}
		
		
		int puntoAtaque = randomAtq*this.getAtaque() + fuerzaTotal * randomFuerzaGuerrero;
		
		System.out.println("La nave marciana ataca con " + puntoAtaque + " puntos");
		return puntoAtaque;
	}

	@Override
	public int defender(int puntoAtaque) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int randomDef = rd.nextInt(0,1);
		int randomResisGuerrero = rd.nextInt(0,3);
		
		int resistenciaTotal = 0;
		for (Guerrero guerrero : this.getGuerreros()) {
			
			int resistenciaGuerrero = guerrero.getResistencia();
			resistenciaTotal += resistenciaGuerrero;
		}
		
		int puntoDefensa = randomDef*this.getDefensa() + resistenciaTotal * randomResisGuerrero;
		
		System.out.println("La nave marciana se defiende con " + puntoDefensa + " puntos");
		
		int puntosDescuento = 0;
		if (puntoAtaque>puntoDefensa) {
			puntosDescuento = puntoAtaque;
			System.out.println("La nave marciana recibe un daño de " + puntosDescuento + " puntos");
			
		} else if (puntoAtaque==puntoDefensa) {
			
			puntosDescuento = puntoAtaque-puntoDefensa;
			System.out.println("La nave marciana recibe un daño menor de " + puntosDescuento + " puntos");
		
		} else {
			puntosDescuento = 0;
			System.out.println("La nave marciana no recibe un daño");
		}
		
		return puntosDescuento;
	}

}
