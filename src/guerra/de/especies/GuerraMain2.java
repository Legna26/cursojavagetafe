package guerra.de.especies;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import es.curso.java.colecciones.ejercicios.guerra.VehiculoGuerra;
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
		List <VehiculoGuerra> vehiculos = construyeNave();
		try { 
			if (Math.random()>0.5)
				miVehiculo = vehiculos.get(0);
			else {
				miVehiculo = vehiculos.get(1);
			}
			batalla(vehiculo, miVehiculo);
		} catch (LimiteValoresException | UnidadesPermitidasException e) {
			System.err.println();
			e.printStackTrace();
		}
 	}
	
	public void iniciarGuerra () {
		
		try { 
			
			List <VehiculoGuerra> vehiculos = construyeNave();
					
			batalla(vehiculos.get(0), vehiculos.get(1));
		} catch (LimiteValoresException | UnidadesPermitidasException e) {
			System.err.println();
			e.printStackTrace();
		}
 	}
	
	public void batalla (List<VehiculoGuerra> vehiculos) throws LimiteValoresException, UnidadesPermitidasException {
	
		batalla(vehiculos.get(0),vehiculos.get(1));
		
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
	
	private List<VehiculoGuerra> construyeNave() {
		
		List<VehiculoGuerra> vehiculos = null;
		
		try {
			vehiculos = BaseDatosVehiculos();
			generaGuerreros (vehiculos);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (LimiteValoresException e) {
			e.printStackTrace();
		} catch (UnidadesPermitidasException e) {
			e.printStackTrace();
		} finally {
			try {
				Utilidades.desconexionBaseDatos();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		return vehiculos;
	}
	
	private void generaGuerreros (List<VehiculoGuerra> vehiculos) throws SQLException, LimiteValoresException, UnidadesPermitidasException {
		
		List<Guerrero> guerreros =null;
		Connection connection = Utilidades.conexionBaseDatos();
		try (
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM TB_GUERREROS");
			) {
			
			while (rs.next()) {
				
				Guerrero guerrero = new Terricola(rs.getString("nombre"), rs.getString("tipo"), rs.getInt("fuerza"), rs.getInt("resistencia"), rs.getInt("vehiculo_id"));
				
				for (VehiculoGuerra vehiculo : vehiculos) {
					if(vehiculo.getId() == rs.getInt("vehiculo_id")) {
						vehiculo.embarcarGuerrero(guerrero);
						break;
					}
				}
			
			}
	   
		}	
		
				
	}
 
	private List<VehiculoGuerra> BaseDatosVehiculos() throws LimiteValoresException, SQLException {
		
		List<VehiculoGuerra> listaVehiculos = null;
		VehiculoGuerra vg = null;
	    Connection connection = Utilidades.conexionBaseDatos();
		
		try (
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM TB_VEHICULOS_GUERRA");
			)
	    {
			listaVehiculos = new ArrayList<VehiculoGuerra>();
			while (rs.next()) {
				
				long id = rs.getLong("id");
				
				if(rs.getString("tipo").equalsIgnoreCase("Nave Terricola")) {
					vg = new NaveTerricola (rs.getString("nombre"), rs.getInt("ataque"), rs.getInt("defensa"), rs.getString("tipo"));
					vg.setId(id);
					listaVehiculos.add(vg);
				} else if (rs.getString("tipo").equalsIgnoreCase("Nave Marciana")) {
					vg = new NaveMarciana (rs.getString("nombre"), rs.getInt("ataque"), rs.getInt("defensa"), rs.getString("tipo"));
					vg.setId(id);
					listaVehiculos.add(vg);
					
					
				} else {
					System.out.println("No existe naves en la base de datos");
				}		
			}
	    } 
				
		return listaVehiculos;
	}
	
}
