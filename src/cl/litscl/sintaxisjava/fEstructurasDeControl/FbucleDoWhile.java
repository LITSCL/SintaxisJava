package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class FbucleDoWhile {

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 20;
		
		do {	
			System.out.println(numero1);
			numero1++; //La variable numero1 se incrementa en una unidad.	
		} while (numero1 < numero2);

	}

}
