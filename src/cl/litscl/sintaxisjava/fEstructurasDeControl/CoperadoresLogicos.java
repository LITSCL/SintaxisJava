package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class CoperadoresLogicos {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = -5;
		
		//Operador lógico and (&&).
		System.out.println("Operador lógico and (&&):");
		
		if (numero1 > 0 && numero2 < 0) { 
			System.out.println("Ambas condiciones se cumplen"); //Si ambas condiciones se cumplen se ejecuta la instrucción.
		}
		else {
			System.out.println("Una condición o ambas no se estan cumpliendo");
		}
		
		System.out.println("");
		
		//Operador lógico or (||).
		System.out.println("Operador lógico or (||):");
		
		if (numero1 > 0 || numero2 < 0) { 
			System.out.println("Una o ambas condiciones se estan cumpliendo"); //Con que una condición se cumpla se ejecuta la instrucción.
		}
		else {
			System.out.println("Ninguna condición se esta cumpliendo");
		}	
		
	}
	
}
