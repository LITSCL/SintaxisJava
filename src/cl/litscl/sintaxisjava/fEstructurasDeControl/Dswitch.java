package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class Dswitch {

	public static void main(String[] args) {
		
		int numero = 10;
		
		switch (numero) { //Valor a tomar en consideración.
			case 7: //Si el valor a tomar en consideración es igual a 7, se ejecuta el código.
				System.out.println("Se ejecutó el primer case");
				break;
			case 8: //Si el valor a tomar en consideración es igual a 8, se ejecuta el código.
				System.out.println("Se ejecutó el segundo case");
				break;
			case 9: //Si el valor a tomar en consideración es igual a 9, se ejecuta el código.
				System.out.println("Se ejecutó el tercer case");
				break;
			case 10: //Si el valor a tomar en consideración es igual a 10, se ejecuta el código.
				System.out.println("Se ejecutó el cuarto case");
				break;
			default: //Si ningun case resulta, se ejecuta el código del default.
				System.out.println("Se ejecutó el default");
				break;
		}
		
	}
	
}
