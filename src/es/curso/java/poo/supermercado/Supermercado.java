package es.curso.java.poo.supermercado;

import java.util.Arrays;

public class Supermercado {

	private String nombre;
	private Cajera [] cajeras;
	
	public Supermercado(String nombre, Cajera[] cajeras) {
		super();
		this.nombre = nombre;
		this.cajeras = cajeras;
	}

	public Supermercado(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cajera[] getCajeras() {
		return cajeras;
	}

	public void setCajeras(Cajera[] cajeras) {
		this.cajeras = cajeras;
	}

	@Override
	public String toString() {
		return "Supermercado [nombre=" + nombre + ", cajeras=" + Arrays.toString(cajeras) + "]";
	}

	public static void main (String[] args) {
		
		Supermercado supermercado = new Supermercado ("Super CFTIC ");
		supermercado.abrirSupermercado();
		
	}
	
	public void abrirSupermercado() {
		
		Producto p1 = new Producto(1, "Tomate", 1 , "alimento");
		Producto p2 = new Producto(2, "Lechuga", 1.50 , "alimento");
		Producto p3 = new Producto(3, "Puerro", 1.60 , "alimento");
		Producto p4 = new Producto(4, "Leche", 1.50 , "alimento");
		Producto p5 = new Producto(5, "Pimiento", 2.50 , "alimento");
		Producto p6 = new Producto(6, "Limón", 1.80 , "alimento");
		Producto p7 = new Producto(7, "Manzana", 1.70 , "alimento");
		
		Cliente c1 = new Cliente (1,"Cliente 1", true);
		
		c1.anadirProducto(p1);
		c1.anadirProducto(p2);
		c1.anadirProducto(p7,p5,p3);
		
		for (Producto p  : c1.getCarritoCompra()) {
			System.out.println(p);
		}
		
		Cajera cajera1 = new Cajera(1,"Cajera 1");
		
		double importeCompra = cajera1.cobrar(c1);
		
		c1.pagar(importeCompra);
		
	}
		



}
