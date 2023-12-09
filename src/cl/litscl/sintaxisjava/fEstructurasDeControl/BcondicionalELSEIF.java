package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class BcondicionalELSEIF {

	public static void main(String[] args) {
		
		int numero1 = 13;
		int numero2 = 12;
		int numero3 = 11;
		int numero4 = 10;
		
		if (numero1 < numero4) { //Se evalúa la primera condición
			System.out.println("La primera condición se cumple"); //Si la condición se cumplió, se ejecuta el código y se ignoran las demas condiciones, de no ser asi, se procede a evaluar la proxima condición.
		}
		else if (numero1 < numero3) {
			System.out.println("La segunda condición se cumple");
		}
		else if (numero1 < numero2) {
			System.out.println("La tercera condición se cumple");
		}
		else {
			System.out.println("Ninguna condición se cumplió"); //Si ninguna condición se cumplió, se ejecuta esta instrucción.
		}
		
	}
	
}
