package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class BcondicionalELSEIF {

	public static void main(String[] args) {
		
		int numero1 = 13;
		int numero2 = 12;
		int numero3 = 11;
		int numero4 = 10;
		
		if (numero1 < numero4) { //Se eval�a la primera condici�n
			System.out.println("La primera condici�n se cumple"); //Si la condici�n se cumpli�, se ejecuta el c�digo y se ignoran las demas condiciones, de no ser asi, se procede a evaluar la proxima condici�n.
		}
		else if (numero1 < numero3) {
			System.out.println("La segunda condici�n se cumple");
		}
		else if (numero1 < numero2) {
			System.out.println("La tercera condici�n se cumple");
		}
		else {
			System.out.println("Ninguna condici�n se cumpli�"); //Si ninguna condici�n se cumpli�, se ejecuta esta instrucci�n.
		}
		
	}
	
}
