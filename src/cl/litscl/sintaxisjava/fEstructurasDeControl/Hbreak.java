package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class Hbreak {

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 20;
		
		System.out.println("Bucle while");
		while (numero1 < numero2) { //Repite mientras numero1 sea menor que numero2.
			
			if (numero1 == 10) {
				break; //Al leer esta instrucción el programa se sale del bucle.
			}
			
			System.out.println(numero1);
			numero1++; //La variable numero1 se incrementa en una unidad.
			
		}
		
		numero1 = 0;
		numero2 = 20;
		
		System.out.println("Bucle do while");
		do {
			
			if (numero1 == 10) {
				break; //Al leer esta instrucción el programa se sale del bucle.
			}
			
			System.out.println(numero1);
			numero1++; //La variable numero1 se incrementa en una unidad.
			
		} while (numero1 < numero2);
		
		System.out.println("Bucle for");
		for (int i = 0; i < 20; i++) { //La variable i empieza en 0, se repite mientras sea menor que 20 y en cada iteración se incrementa en una unidad la variable i.
			
			if (i == 10) {
				break; //Al leer esta instrucción el programa se sale del bucle.
			}
			
			System.out.println(i);
		}

	}
	
}


