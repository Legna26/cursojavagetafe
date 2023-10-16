package es.curso.java.colecciones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.curso.java.poo.Persona;

public class PruebasListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Persona>> personas = new ArrayList<ArrayList<Persona>>();
		ArrayList<Persona> lista1 = new ArrayList();
		
		//lista1.add("Rojo");
		//lista1.add("Azul");
		//lista1.add(1);
		lista1.add(new Persona("Maria"));
		lista1.add(new Persona("Eva"));
		lista1.add(new Persona("Pedro"));
		lista1.add(new Persona("Angel"));
		
		//lista1.add(1,new Persona ("Antonio"));
		
		lista1.remove(0);
		//lista1.clear();
		if (!lista1.isEmpty()) {
		System.out.println(lista1.get(0).getNombre());
		}
		
		System.out.println(lista1.contains(new Persona("Eva")));
		
		System.out.println(lista1.size());
		
		List<Persona> subLista = lista1.subList(0,1);
		//subLista.remove(0);
		
		Iterator<Persona> ite = lista1.iterator();
		while(ite.hasNext()) {
			Persona person = ite.next();
			System.out.println(person.getNombre());
			//ite.next();
		}
		//ite.next();
		
		lista1.stream().filter(per -> per.getNombre().startsWith("E")).forEach(System.out::println);
		
		ArrayList lista2 = new ArrayList<es.curso.java.herencia.hospital.Persona>();
		
//		for (Object object : lista1) {
//			//System.out.println(object);
//			if (object instanceof Persona) {
//				Persona p = (Persona)object;
//				System.out.println(p.getNombre());
//			}
//		}
		
		
		
//		Persona [] personas = new Persona [4];
//		
//		for(Persona persona : personas) {
//			
//		}
	}

}
