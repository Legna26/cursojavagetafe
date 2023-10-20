package guerra.de.especies;

import guerra.de.especies.excepciones.LimiteValoresException;
import guerra.de.especies.excepciones.UnidadesPermitidasException;

public class GuerraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuerraMain guerra = new GuerraMain();
		
		try {
		VehiculoGuerra navet = guerra.construyeVehiculos();
		guerra.iniciarGuerra(navet);
		} catch (LimiteValoresException lve) {
			System.out.println("Ha ocurrido un error: " + lve.getMessage());
		} catch (UnidadesPermitidasException upe) {
			System.out.println("Ha ocurrido un error: " + upe.getMessage());
		}
	}
	
	public void iniciarGuerra (VehiculoGuerra vehiculo) throws LimiteValoresException, UnidadesPermitidasException {
		
		NaveMarciana naveM = new NaveMarciana("NaveM");
		
		Marciano marciano1 = new Marciano ("Ma");
		Marciano marciano2 = new Marciano ("Mb");
		Marciano marciano3 = new Marciano ("Mc");
		Marciano marciano4 = new Marciano ("Md");
		Marciano marciano5 = new Marciano ("Me");
		Marciano marciano6 = new Marciano ("Mf");
		Marciano marciano7 = new Marciano ("Mg");
		Marciano marciano8 = new Marciano ("Mh");
		Marciano marciano9 = new Marciano ("Mi");
		Marciano marciano10 = new Marciano ("Mj");
		
		naveM.embarcarGuerrero(marciano1);
		naveM.embarcarGuerrero(marciano2);
		naveM.embarcarGuerrero(marciano3);
		naveM.embarcarGuerrero(marciano4);
		naveM.embarcarGuerrero(marciano5);
		naveM.embarcarGuerrero(marciano6);
		naveM.embarcarGuerrero(marciano7);
		naveM.embarcarGuerrero(marciano8);
		naveM.embarcarGuerrero(marciano9);
		naveM.embarcarGuerrero(marciano10);
		
		
		while (vehiculo.getPuntosVida()!=0 && naveM.getPuntosVida()!=0 && vehiculo.getPuntosVida()>0 && naveM.getPuntosVida()>0) {
			
			if (naveM.getPuntosVida()>0) {
				int ataqueNaveM = naveM.atacar();
				int puntoDescuento = vehiculo.defender(ataqueNaveM);
				
				int puntosVidaActual = vehiculo.getPuntosVida() - puntoDescuento;
				vehiculo.setPuntosVida(puntosVidaActual);
				System.out.println ("La nave " + vehiculo.getNombre() + " tiene " + vehiculo.getAtaque() + " puntos restante");
			} 
			System.out.println ("======================================================");
			if (vehiculo.getPuntosVida()>=0) {
				int ataqueVehiculo = vehiculo.atacar();
				int puntoDescuento = naveM.defender(ataqueVehiculo);
				
				int puntosVidaActual = naveM.getPuntosVida() - puntoDescuento;
				naveM.setPuntosVida(puntosVidaActual);
				System.out.println ("La nave " + naveM.getNombre() + " tiene " + naveM.getAtaque() + " puntos restante");
			}
			System.out.println ("======================================================");
			
		}
		
	}
	
	VehiculoGuerra construyeVehiculos() throws LimiteValoresException, UnidadesPermitidasException {
		
		NaveTerricola nave1 = new NaveTerricola("Nave1");
		
		Terricola terricola1 = new Terricola ("A");
		Terricola terricola2 = new Terricola ("B");
		Terricola terricola3 = new Terricola ("C");
		Terricola terricola4 = new Terricola ("D");
		Terricola terricola5 = new Terricola ("E");
		Terricola terricola6 = new Terricola ("F");
		Terricola terricola7 = new Terricola ("G");
		Terricola terricola8 = new Terricola ("H");
		Terricola terricola9 = new Terricola ("I");
		Terricola terricola10 = new Terricola ("J");
		
		nave1.embarcarGuerrero(terricola1);
		nave1.embarcarGuerrero(terricola2);
		nave1.embarcarGuerrero(terricola3);
		nave1.embarcarGuerrero(terricola4);
		nave1.embarcarGuerrero(terricola5);
		nave1.embarcarGuerrero(terricola6);
		nave1.embarcarGuerrero(terricola7);
		nave1.embarcarGuerrero(terricola8);
		nave1.embarcarGuerrero(terricola9);
		nave1.embarcarGuerrero(terricola10);
		
		return nave1;
	}
	

	VehiculoGuerra BaseDatosVehiculos() {
		return null;
	}
	
}
