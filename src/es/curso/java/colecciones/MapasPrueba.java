package es.curso.java.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapasPrueba {

	public static void main (String[] args) {
		
		Map<Integer, String> mapa1 = new HashMap<Integer, String>();
		//Clave un numero int, como valor una cadena de texto string
		
		// Añadir información al mapa
		mapa1.put(1, "Amarillo");
		mapa1.put(2, "Rosa");
		mapa1.put(3, "Verde");
		mapa1.put(4, "Naranja");
		
		String datoAntiguo = mapa1.put(1, "Azul");
		System.out.println(datoAntiguo); // el valor que esta antes se sustituye con el nuevo, pero muestra el antiguo
	
		System.out.println(mapa1.containsKey(1)); // para ver si un mapa contiene una key determinada
		System.out.println(mapa1.containsValue(datoAntiguo)); // para ver si un mapa contiene un determinado valor
		
		mapa1.remove(3);
		//Solo reemplaza si el objeto antiguo que le pasas esta para esa clave
		mapa1.replace(4,  "Naranja", "Rojo");
		
		//Accedemos a todas las claves
		Set<Integer> claves = mapa1.keySet(); //Se crea un set de todas las claves que tienen en el mapa
		for (Integer num : claves) {
			System.out.println(num);
			// accedemos al valor de cada empleo
			System.out.println(mapa1.get(num));
		}
		//System.out.println(mapa1.get(1)); //Recoge la información del valor de las claves 
		
		Collection<String> valores = mapa1.values();
		
		for(String color : valores) {
			System.out.println(color);
		}
		
		//Objeto entry nos permite recorrer de manera directa las claves y valores de un mapa
		Set<Entry<Integer,String>> entries = mapa1.entrySet();
		for (Entry <Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
 		}
		
		boolean mapaVacio = mapa1.isEmpty();
		
	}
}
