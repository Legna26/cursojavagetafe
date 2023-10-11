package es.curso.java.poo.interfaces.ejercicio;

public class Television extends DispositivoElectronico {

	private int hdmi;

	public Television(int id, double precio, String fabricante) {
		super(id, precio, fabricante);
		// TODO Auto-generated constructor stub
	}

	public Television(int id, double precio, String fabricante, int hdmi) {
		super(id, precio, fabricante);
		this.hdmi = hdmi;
	}

	/**
	 * @return the hdmi
	 */
	public int getHdmi() {
		return hdmi;
	}

	/**
	 * @param hdmi the hdmi to set
	 */
	public void setHdmi(int hdmi) {
		this.hdmi = hdmi;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("La TV está encendida.");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("La TV está apagada.");
	}
	
	
}
