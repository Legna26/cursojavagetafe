package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class Ruleta {
	
	public static void main(String[] args) {
		
		double montoJugador = 0;
		int numApuesta = 0;
		int numDocena = 0;
		int numGanador = 0;
		String parImpar = "";
		String rojoNegro = "";
		
		do {
		String jugadores = "¿Cuántos jugadores son? (máximo 3)";
		System.out.println(jugadores);
		Scanner scan = new Scanner(System.in);
		int numJugadores = scan.nextInt();
		
		for (int i = 1; i<=numJugadores ; i++) {
			
			System.out.println("Nombre jugador " + i + ":");
			scan = new Scanner(System.in);
			String nombreJugador = scan.nextLine();
			
			System.out.println("¿Cuánto dinero tiene Jugador " + i + "?");
			scan = new Scanner(System.in);
			montoJugador = scan.nextDouble();
			
			System.out.println("Selecciona una opcion de apuesta:");
			String menu = "1. Apostar por un número (0-36)\n2. Apostar por docenas (0-12/13-24/25-36)\n3. Apostar por par/impar\n4. Apostar por rojo/negro\n5. Salir";
			System.out.println(menu);
			scan = new Scanner(System.in);
			int opcion = scan.nextInt();
			
			System.out.println("¿Cuánto dinero va a apostar?");
			scan = new Scanner(System.in);
			double montoApuesta = scan.nextDouble();
			
				switch(opcion) {
				case 1: 
					
					System.out.println("Elija un número a apostar (del 0 - 36)");
					scan = new Scanner(System.in);
					numApuesta = scan.nextInt();
											
					break;
					
				case 2:
					
					System.out.println("Elija una docena a apostar (1: 0-12 / 2: 13-24 / 3: 25-36)");
					scan = new Scanner(System.in);
					numDocena = scan.nextInt();
					
					break;
					
				case 3:
					
					System.out.println("Elija si será par o impar");
					scan = new Scanner(System.in);
					parImpar = scan.nextLine();
										
					break;
					
				case 4: 
					
					System.out.println("Elija si será rojo o negro");
					scan = new Scanner(System.in);
					rojoNegro = scan.nextLine();
					
					break;
					
				case 5: 
					
					System.out.println("Gracias por jugar en ApuestasSinControl. Su importe acumulado es: " + montoJugador );break;
				
				default: System.out.println("Opcion incorrecta");
				
				}
			
			numGanador = (int)(Math.random()*36);
			
			if (numApuesta==numGanador) {
				
				montoJugador = montoApuesta*36 + montoJugador;
				
			} else {
				
				montoJugador =  montoJugador - montoApuesta;
				System.out.println("Has perdido! Tu saldo es: "+ montoJugador); 
			}
			
			if ((0<=numGanador & numGanador<=12) && numDocena == 1) {
				
				montoJugador = montoApuesta*12 + montoJugador;
				
			} else if ((13<=numGanador & numGanador<=24) && numDocena == 2 ) {
				
				montoJugador = montoApuesta*12 + montoJugador;
				
			} else if ((25<=numGanador & numGanador<=36) && numDocena == 3) {
				
				montoJugador = montoApuesta*12 + montoJugador;
				
			} else {
				
				montoJugador =  montoJugador - montoApuesta;
				System.out.println("Has perdido! Tu saldo es: "+ montoJugador); 
			}
			
			if ( parImpar.equalsIgnoreCase("par") && numGanador%2==0) {
				
				montoJugador = montoApuesta*2 + montoJugador;
				
			} else if (parImpar.equalsIgnoreCase("impar") && numGanador%2 != 0) {
				
				montoJugador = montoApuesta*2 + montoJugador;
			} else {
				
				montoJugador =  montoJugador - montoApuesta;
				System.out.println("Has perdido! Tu saldo es: "+ montoJugador); 
			}
			
			if (rojoNegro.equalsIgnoreCase("negro") && (1 <= numGanador & numGanador <=18) ) {
				
				montoJugador = montoApuesta*2 + montoJugador;
				
			} else if (rojoNegro.equalsIgnoreCase("rojo") && (19 <= numGanador & numGanador <=36)) {
				
				montoJugador = montoApuesta*2 + montoJugador;
			} else {
				
				montoJugador =  montoJugador - montoApuesta;
				System.out.println("Has perdido! Tu saldo es: "+ montoJugador); 
			}
		}
		
		System.out.println("El numero ganador es: " + numGanador);
		
		
		} while (false); 
		
		
		
	}

}
