package ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConexionFacility {

	public static void main(String[] args) {
		ConexionFacility conexion = new ConexionFacility();
		Set<Facility> facilities = conexion.crearSet();
		System.out.println(facilities.size());
		
	}

	private Set<Facility> crearSet() {
		
		String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=Europe/Madrid";
	    String username = "root";
	    String password = "password";
	    
	    Connection connection = null; //Conexión con la base de datos
	    Statement stmt = null; //Lanzar consulta
	    ResultSet rs = null; //Recoger datos de la consulta
	    
	    Set<Facility> facilities = new LinkedHashSet<Facility>();
	    
	    try {
	    	System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM TB_FACILITIES");
			while (rs.next()) {
				Facility f = new Facility (rs.getLong("id"), rs.getInt("guid"), rs.getString("name"), rs.getString("description"), rs.getString("category"), 
				rs.getString("address"), rs.getDouble("heigth"));
				facilities.add(f);
			}
	    } catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
//			e.printStackTrace();
		}finally {
			try {
				connection.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
		return facilities;
	}
}
