package es.curso.java.poo.interfaces.ejercicio;

public class Movil extends DispositivoElectronico {
	
	private String sistemaOperativo;

	public Movil(int id, double precio, String fabricante) {
		super(id, precio, fabricante);
		// TODO Auto-generated constructor stub
	}

	public Movil(int id, double precio, String fabricante, String sistemaOperativo) {
		super(id, precio, fabricante);
		this.sistemaOperativo = sistemaOperativo;
	}

	/**
	 * @return the sistemaOperativo
	 */
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	/**
	 * @param sistemaOperativo the sistemaOperativo to set
	 */
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("El móvil está encendido.");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("El móvil está apagado.");
	}
	
	

}
