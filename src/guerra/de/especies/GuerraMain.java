package guerra.de.especies;

import java.util.Arrays;
import java.util.List;


import guerra.de.especies.excepciones.LimiteValoresException;
import guerra.de.especies.excepciones.UnidadesPermitidasException;

public class GuerraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuerraMain guerra = new GuerraMain();
		
		guerra.iniciarGuerra();
		
	}
	
	public void iniciarGuerra (VehiculoGuerra vehiculo) {
		VehiculoGuerra miVehiculo = null ;
		try { 
			if (Math.random()>0.5)
				miVehiculo = construyeNaveTerricola();
			else {
				miVehiculo = construyeNaveMarciana();
			}
			batalla(vehiculo, miVehiculo);
		} catch (LimiteValoresException | UnidadesPermitidasException e) {
			System.err.println();
			e.printStackTrace();
		}
 	}
	
	public void iniciarGuerra () {
		
		try { 
			
			VehiculoGuerra miVehiculo = construyeNaveTerricola();
			VehiculoGuerra vehiculo = construyeNaveMarciana();
			
			batalla(miVehiculo, vehiculo);
		} catch (LimiteValoresException | UnidadesPermitidasException e) {
			System.err.println();
			e.printStackTrace();
		}
 	}
	
	public void batalla (VehiculoGuerra vehiculo, VehiculoGuerra naveM) throws LimiteValoresException, UnidadesPermitidasException {
			
		while (vehiculo.getPuntosVida()!=0 && naveM.getPuntosVida()!=0) {
			
			if (vehiculo.getPuntosVida()<=
					0) {
				System.out.println ("La nave " + naveM.getNombre() + " ganó.");
				break;
			}
			
			if (naveM.getPuntosVida()>0) {
				
				int ataqueNaveM = naveM.atacar();
				int puntoDescuento = vehiculo.defender(ataqueNaveM);
				
				int puntosVidaActual = vehiculo.getPuntosVida() - puntoDescuento;
				vehiculo.setPuntosVida(puntosVidaActual);
				System.out.println (naveM.getNombre() + "-" + vehiculo.getNombre() + " [" + naveM.getPuntosVida() + "," + vehiculo.getPuntosVida() + "]");
			} 
			System.out.println ("======================================================");
			if (vehiculo.getPuntosVida()>0) {
				int ataqueVehiculo = vehiculo.atacar();
				int puntoDescuento = naveM.defender(ataqueVehiculo);
				
				int puntosVidaActual = naveM.getPuntosVida() - puntoDescuento;
				naveM.setPuntosVida(puntosVidaActual);
				System.out.println (naveM.getNombre() + "-" + vehiculo.getNombre() + " [" + naveM.getPuntosVida() + "," + vehiculo.getPuntosVida() + "]");
			}
			System.out.println ("======================================================");
			
			if (naveM.getPuntosVida()<=0) {
				System.out.println ("La nave " + vehiculo.getNombre() + " ganó.");
				break;
			}
		}
		
	}
	
	VehiculoGuerra construyeNaveTerricola() throws LimiteValoresException, UnidadesPermitidasException {
		
		NaveTerricola naveT = new NaveTerricola("Nave1");
		
		
		for(Guerrero guerrero : generaGuerreros()) {
			naveT.embarcarGuerrero(guerrero);
		}
			
		return naveT;
	}
	
	VehiculoGuerra construyeNaveMarciana() throws LimiteValoresException, UnidadesPermitidasException {
		NaveMarciana naveM = new NaveMarciana("Nave2");
		
		for(Guerrero guerrero : generaGuerreros()) {
			naveM.embarcarGuerrero(guerrero);
		}
		return naveM;
	}
	
	private List<Guerrero> generaGuerreros () {
		List<Guerrero> guerreros =null;
		
		try {
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
			
			guerreros = Arrays.asList(terricola1, terricola2, terricola3, terricola4, terricola5, terricola6, terricola7, terricola8, terricola9, terricola10);
			} catch (LimiteValoresException lve) {
			System.out.println("Ha ocurrido un error: " + lve.getMessage());
			lve.printStackTrace();
		}
		
		return guerreros;
				
	}
 
	VehiculoGuerra BaseDatosVehiculos() {
		return null;
	}
	
}
