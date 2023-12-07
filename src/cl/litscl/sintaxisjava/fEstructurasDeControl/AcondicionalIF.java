package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class AcondicionalIF {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = 15;
		
		if (numero1 < numero2) { //En esta instrucci�n se eval�a la condici�n.
			System.out.println(numero1 + " es menor que " + numero2); //Si la condici�n se cumple se ejecuta este c�digo.
		}
		else {
			System.out.println(numero1 + " es mayor que " + numero2); //Si la condici�n no se cumple se ejecuta este c�digo.
		}
		
	}
	
}
