package es.curso.java.introduccion;

public class Operadores {
	public static void main(String[] args) {
		//Aritmeticos
		int num = 0;
		num++;
		
		System.out.println(num++);
		System.out.println(num);
		
		//num = num+5;
		System.out.println(num+=5);
		
		//operador mod: Dar como resultado el resto de una división entera
		System.out.println(num%2);
		
		boolean esPar = num%2==0;
		int resultado = 7*3;
		System.out.println(esPar);
		
		
		//Condicionales
		// > >= <= ==
		boolean esMayor = 7 > (num%2);
		System.out.println(esMayor);
		
		//Lógicos
		int num2 = 8;
		System.out.println(num2>=7 && num2>2 || num2<3);
		
		System.out.println(num2>=8 || (num2<2 || num2>3));
		
	}
}
