package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class CoperadoresLogicos {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = -5;
		
		//Operador l�gico and (&&).
		System.out.println("Operador l�gico and (&&):");
		
		if (numero1 > 0 && numero2 < 0) { 
			System.out.println("Ambas condiciones se cumplen"); //Si ambas condiciones se cumplen se ejecuta la instrucci�n.
		}
		else {
			System.out.println("Una condici�n o ambas no se estan cumpliendo");
		}
		
		System.out.println("");
		
		//Operador l�gico or (||).
		System.out.println("Operador l�gico or (||):");
		
		if (numero1 > 0 || numero2 < 0) { 
			System.out.println("Una o ambas condiciones se estan cumpliendo"); //Con que una condici�n se cumpla se ejecuta la instrucci�n.
		}
		else {
			System.out.println("Ninguna condici�n se esta cumpliendo");
		}	
		
	}
	
}
