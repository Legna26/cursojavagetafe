package es.curso.java.introduccion;

public class VariablesDos {
	//VARIABLES DE INSTANCIA O CLASE
	
	static String curso = "CURSO JAVA";
	static int numero; //Variables de instancia se inicializan automáticamente
		
	public static void main(String [] args) {
	//VARIABLES LOCALES: Solo se puede usar dentro del método dónde se declara
		int num; //Declaracion
		num = 7; //Inicializar (Darle un valor, en este caso en las variables locales es necesario siempre inicializarla)
		int numero2;
		
		System.out.println("Numeros: " + numero + num);
	}
}
