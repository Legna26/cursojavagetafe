package es.curso.java.poo.supermercado;

import java.util.Arrays;

public class Cliente {

	private long id;
	private String nombre;
	private Producto [] carritoCompra;
	private boolean vip;
	
	public Cliente(long id, String nombre, boolean vip) {
		super();
		this.id = id;
		this.nombre = nombre;
		
		this.vip = vip;
		if(vip) {
			this.carritoCompra = new Producto [5];
		} else {
			this.carritoCompra = new Producto[3];
		}
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(Producto[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", carritoCompra=" + Arrays.toString(carritoCompra)
				+ ", vip=" + vip + "]";
	}
	
	public void anadirProducto (Producto producto) {
		
		for ( int i = 0 ; i < carritoCompra.length ; i++) {
			
			Producto espacio = carritoCompra[i];
			if (espacio == null) {
				carritoCompra[i] = producto;
				break;
			} 
			
		}
		
	}
	
	public void anadirProducto (Producto... producto) {
		for (Producto producto2 : producto) {
			anadirProducto(producto2);
		}
		
	}
	
	public void pagar (double importeAPagar) {
		System.out.println("El cliente " + this.nombre + " está pagando el importe de: " + importeAPagar);
	}
	
	
}
