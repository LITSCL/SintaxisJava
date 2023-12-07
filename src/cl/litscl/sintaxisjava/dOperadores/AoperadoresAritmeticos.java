package cl.litscl.sintaxisjava.dOperadores;

public class AoperadoresAritmeticos {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = 15;
	
		double suma = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " con " + numero2 + " es igual a: " + suma);
		
		double resta = numero1 - numero2;
		System.out.println("La resta de " + numero1 + " con " + numero2 + " es igual a: " + resta);
		
		double multiplicacion = numero1 * numero2;
		System.out.println("La multiplicaci�n de " + numero1 + " con " + numero2 + " es igual a: " + multiplicacion);
		
		double division = numero1 / numero2;
		System.out.println("La divisi�n de " + numero1 + " con " + numero2 + " es igual a: " + division);
		
		int modulo = numero1%numero2;
		System.out.println("El m�dulo de " + numero1 + " con " + numero2 + " es igual a: " + modulo);

	}
	
}
