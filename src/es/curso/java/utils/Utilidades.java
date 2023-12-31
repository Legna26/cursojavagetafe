package es.curso.java.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Utilidades {

	public static String pideDatoTexto(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String txt3 = scan.nextLine();
				
		return txt3;
	}
	
	public static int pideDatoNumerico(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
			
		return num;
	}
	
	public static double pideDatoNumericoDouble(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		double num = scan.nextInt();
			
		return num;
	}
	
	public static int pintarMenu(String menu) {
		return pintarMenu(menu, "Selecciona una opción:",":");
	}
	
	public static int pintarMenu(String menu , String pregunta , String caracterSeparacion) {
		return pintarMenu(menu.split(caracterSeparacion),pregunta);		
	}
	
	public static int pintarMenu(String [] menu , String pregunta) {
		for (String opcion : menu) {
			System.out.println(opcion);
		}
		
		int opc = pideDatoNumerico(pregunta);
		
		return opc;
				
	}
	
	private static Connection connection;
	
	/**
	 * Conexion por defecto a la base de datos curso de la maquina local.
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection conexionBaseDatos () throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=Europe/Madrid";
	    String username = "root";
	    String password = "password";
	    
	    connection = conexionBaseDatos(url, username, password); //Conexión con la base de datos
	    
	    return connection;
	}

	
	public static Connection conexionBaseDatos (String url, String userName, String password) throws SQLException {
		
		if (connection==null) {
			connection = DriverManager.getConnection(url, userName, password);
		}
	    
	     return connection;
	}

	public static void desconexionBaseDatos() throws SQLException {
		if (connection!=null) {
			connection.close();
			connection=null;
		}
	}
}
