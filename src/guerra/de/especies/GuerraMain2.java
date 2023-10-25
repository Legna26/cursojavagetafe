package guerra.de.especies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import ddbb.Facility;
import es.curso.java.utils.Utilidades;
import guerra.de.especies.excepciones.LimiteValoresException;
import guerra.de.especies.excepciones.UnidadesPermitidasException;

public class GuerraMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuerraMain2 guerra = new GuerraMain2();
		
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
	
	private VehiculoGuerra construyeNaveTerricola() throws LimiteValoresException, UnidadesPermitidasException {
		
		NaveTerricola nave = (NaveTerricola) BaseDatosVehiculos();
				
		for(Guerrero guerrero : generaGuerreros()) {
			if(guerrero.getVehiculoId()==1) {
			nave.embarcarGuerrero(guerrero);
			}
		}
		return nave;
	}
	
	private VehiculoGuerra construyeNaveMarciana() throws LimiteValoresException, UnidadesPermitidasException {
		
		NaveMarciana nave = (NaveMarciana) BaseDatosVehiculos();
				
		for(Guerrero guerrero : generaGuerreros()) {
			if(guerrero.getVehiculoId()==2) {
			nave.embarcarGuerrero(guerrero);
			}
		}
		return nave;
	}
	
	private List<Guerrero> generaGuerreros () throws LimiteValoresException {
		
		List<Guerrero> guerreros =null;
		Guerrero guerrero = null;
		
		try (Connection connection = Utilidades.conexionBaseDatos();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM TB_GUERREROS");
			) {
			
			while (rs.next()) {
				
				if(rs.getString("tipo").equalsIgnoreCase("Terricola")) {
					guerrero = new Terricola(rs.getString("nombre"), rs.getString("tipo"), rs.getInt("fuerza"), rs.getInt("resistencia"), rs.getInt("vehiculo_id"));
				} else if (rs.getString("tipo").equalsIgnoreCase("Marciano")) {
					guerrero = new Marciano(rs.getString("nombre"), rs.getString("tipo"), rs.getInt("fuerza"), rs.getInt("resistencia"), rs.getInt("vehiculo_id"));
				} else {
					System.out.println("No existe guerreros en la base de datos");
				}
			guerreros = Arrays.asList(guerrero);
			}
	    } catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
//			e.printStackTrace();
		}
				
		return guerreros;
				
	}
 
	private VehiculoGuerra BaseDatosVehiculos() throws LimiteValoresException {
		
		VehiculoGuerra vg = null;
	    try (
				Connection connection = Utilidades.conexionBaseDatos();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM TB_VEHICULOS_GUERRA");
			)
	    {
	   
			while (rs.next()) {
				
				if(rs.getString("tipo").equalsIgnoreCase("Nave Terricola")) {
					vg = new NaveTerricola (rs.getString("nombre"), rs.getInt("ataque"), rs.getInt("defensa"), rs.getString("tipo"));
				} else if (rs.getString("tipo").equalsIgnoreCase("Nave Marciana")) {
					vg = new NaveMarciana (rs.getString("nombre"), rs.getInt("ataque"), rs.getInt("defensa"), rs.getString("tipo"));
				} else {
					System.out.println("No existe naves en la base de datos");
				}		
			}
	    } catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
//			e.printStackTrace();
		}
				
		return vg;
	}
	
}
