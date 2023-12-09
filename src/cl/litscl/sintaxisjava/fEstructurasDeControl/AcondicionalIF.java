package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class AcondicionalIF {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = 15;
		
		if (numero1 < numero2) { //En esta instrucción se evalúa la condición.
			System.out.println(numero1 + " es menor que " + numero2); //Si la condición se cumple se ejecuta este código.
		}
		else {
			System.out.println(numero1 + " es mayor que " + numero2); //Si la condición no se cumple se ejecuta este código.
		}
		
	}
	
}
