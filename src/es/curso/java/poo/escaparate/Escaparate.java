package es.curso.java.poo.escaparate;

public class Escaparate {

	public static void main(String[] args) {
		
		Boton b1 = new Boton (12,"ovalada","café","pequeño");
		Boton b2 = new Boton (13, "triangular", "blanco", "mediano");
		
		Pantalon p1 = new Pantalon (21,"negro","M",30,b1);
		
		Boton [] botones = {b1,b2};
		Camisa c1 = new Camisa (31, "blanco","S",15,  botones);
		
		Vestido v1 = new Vestido (41, "rosado" , "S" , 20);
		
		Maniqui m1 = new Maniqui (50);
		
		m1.vestir(p1,c1);
		
		Maniqui m2 = new Maniqui (51,v1);
		
		Escaparate escaparate = new Escaparate();
		
		escaparate.mostrarEscaparate(m1,m2);
		
		System.out.println("Precios:");
		escaparate.mostrarPrecio(m1,m2);
		
		
	}
	
	public void mostrarEscaparate (Maniqui... maniquis) {
		for ( Maniqui maniqui : maniquis) {
			
			System.out.println(maniqui.getId());
			if (maniqui.getCamisa() != null) {
				System.out.println("Datos de la camisa");
				System.out.println(maniqui.getCamisa().getColor());
				System.out.println(maniqui.getCamisa().getTalla());
				System.out.println(maniqui.getCamisa().getPrecio());
				
				Boton [] arrayBotones = maniqui.getCamisa().getBotones();
				for (Boton boton : arrayBotones) {
					System.out.println("Datos de los botones de la camisa:");
					System.out.println(boton.getColor());
					System.out.println(boton.getForma());
				}
		}
			
			if (maniqui.getPantalon() != null) {
				System.out.println("Datos de la panatlón");
				System.out.println(maniqui.getPantalon().getColor());
				System.out.println(maniqui.getPantalon().getTalla());
				System.out.println(maniqui.getPantalon().getPrecio());
				
				Boton botonPantalon = maniqui.getPantalon().getBoton();
				    System.out.println("Datos de los botones del pantalón:");
					System.out.println(botonPantalon.getColor());
					System.out.println(botonPantalon.getForma());
				
		}
			
			if (maniqui.getVestido() != null) {
				System.out.println("Datos del vestido");
				System.out.println(maniqui.getVestido().getColor());
				System.out.println(maniqui.getVestido().getTalla());
				System.out.println(maniqui.getVestido().getPrecio());

			}
		
	}
	}
	public void mostrarPrecio (Maniqui ... maniquis) {
		double precioTotal = 0;
		for ( Maniqui maniqui : maniquis) {
			precioTotal = 0;
			if (maniqui.getVestido() != null) {
				double precioVestido = maniqui.getVestido().getPrecio();
				precioTotal += precioVestido;
			}
			if (maniqui.getPantalon() != null) {
				precioTotal += maniqui.getPantalon().getPrecio();
			}
			if (maniqui.getCamisa() != null) {
				precioTotal += maniqui.getCamisa().getPrecio();
			}
			System.out.println("El precio total es de "+precioTotal);
		}
		
		
	}
}
