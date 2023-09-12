package es.curso.java.introduccion.bucles.ejercicios;

import java.util.Scanner;

public class MenuBucle {

	public static void main(String[] args) {
		String menu = "1. Multiplos de 3 y 5\n2. Top 10\n3. Tabla multiplicar\n4. Dibujar Cuadrado\n5. Dibujar triángulo\n6. Dibujar Hashtag\n7. Salir";
		System.out.println(menu);
		System.out.println("Selecciona una opción.");
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		System.out.println(opcion);
		
		switch(opcion) {
			case 1:
				
				int mult3 = 0;
				int mult5 = 0;
				
				for (int i=1 ; i<=10 ; i++) {
					
					System.out.println("Indica el" + i +"º número.");
					Scanner scan1 = new Scanner(System.in);
					int num = scan1.nextInt();
					
					if (num%3==0) {
						mult3++;
						
					} 
					
					if (num%5==0) {
						mult5++;
						
					} 
									
				}
				
				System.out.println("Hay " + mult3 + " multiplos de 3 y " + mult5 + " multiplos de 5." );break;
					
			case 2:
				
				System.out.println("¿Cuántos tenistas hay en el torneo?");
				Scanner scanner = new Scanner(System.in);
				int numTenistas = scanner.nextInt();
				
				int puesto = 0;
				int top10 = 0;
				
				for (int i=1 ; i<=numTenistas ; i++) {
					
					System.out.println("¿En qué puesto de la ATP se encuentra el Tenista " + i + "?");
					Scanner scan2 = new Scanner(System.in);
					puesto = scan2.nextInt();
					
					if (puesto<=10) {
						top10++;
						
					}
				}	
				
				System.out.println("Hay " + top10 + " tenistas en el TOP 10.");break;
				
			case 3:
				
				int tabla = 0;
				
				System.out.println("Indica número que desea mostrar tabla de multiplicar.");
				Scanner scan3 = new Scanner(System.in);
				int numulti = scan3.nextInt();
				
				for (int i = 0; i<=12 ; i++) {
					
					tabla = numulti * i;
					
					System.out.println(numulti + " x " + i + " = " + tabla);
					
				};break;
				
			case 4: 
				
				System.out.println("Indica tamaño del cuadrado.");
				Scanner scan4 = new Scanner(System.in);
				int lado = scan4.nextInt();
				
				
				for (int i=1 ; i<=lado ; i++) {
					System.out.print(" * ");
				} 
				
				System.out.println();
					
				for (int i=0 ; i<(lado-2) ; i++) {
						
					System.out.print(" * ");
					
					for (int j=0 ; j<(lado-2) ; j++) {
						
					System.out.print("   ");
						
					}  
					System.out.println(" * ");
				}		
					
				for (int i=1 ; i<=lado ; i++) {
					System.out.print(" * ");
				} 
				;break;
				
				
			case 5: 
				
				System.out.println("Indica tamaño de la base del triángulo.");
				Scanner scan5 = new Scanner(System.in);
				int base = scan5.nextInt();
				
				
				for (int i=0 ; i<base ; ++i) {
					
					System.out.println();
					
					for (int j=0; j<base-i-1; ++j) {
						System.out.print(" ");
					}
					
					for (int j=0; j<2*i+1; ++j) {
						if (j==0 || i==0 || i==base-1 || j==i*2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
						
					}
				System.out.println();
				
//					if (i==0) {
//						
//						for (int j=0; j<=base; j++) {
//							
//							if (j==base/2) {
//								System.out.print("*");
//							} else {
//								System.out.print(" ");
//							}
//						} System.out.println();
//																	
//					} else {
//						
//						for (int j=0; j<=base; j++) {
//							
//							if (j==i-j) {
//								
//								System.out.print(" ");
//								
//							} 
//							
//							else {
//								System.out.print("*");
//							}
//								
//							
//						}
//					}
//						
//					}
//					System.out.println();
//				
//					for (int i=1 ; i<=base ; i++) {
//						System.out.print("*");
//					} 
					
				;break;
				
				
			case 6:
				
				
			case 7:	System.out.println("Adiós, vuelve pronto!!!");break;
			default: System.out.println("Opción incorrecta");
		}
	}
}
