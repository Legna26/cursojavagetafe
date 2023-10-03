package es.curso.java.poo.supermercado;

public class Cajera {
	
	private long id ;
	private String nombre ;
	
	public Cajera(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Cajera [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public double cobrar (Cliente cliente) { 
		System.out.println("Cajera " + this.nombre + " cobrando al cliente " + cliente.getNombre());
		double importe = 0;
		
		for (Producto p : cliente.getCarritoCompra()) {
			importe += p.getPrecio();
		}
		
		return cliente.isVip()?importe*0.85:importe;
	}
}
