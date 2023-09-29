package es.curso.java.poo.supermercado;

public class Cliente {

	private long id;
	private String nombre;
	private Producto [] carritoCompra;
	private boolean vip;
	
	public Cliente(long id, String nombre, Producto[] carritoCompra, boolean vip) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carritoCompra = carritoCompra;
		this.vip = vip;
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
	
	
	
	
}
