package cl.litscl.sintaxisjava.fEstructurasDeControl;

public class Dswitch {

	public static void main(String[] args) {
		
		int numero1 = 10;
		
		switch (numero1) { //Valor a tomar en consideraci�n.
			case 7: //Si el valor a tomar en consideraci�n es igual a 7, se ejecuta el c�digo.
				System.out.println("Se ejecut� el primer case");
				break;
			case 8: //Si el valor a tomar en consideraci�n es igual a 8, se ejecuta el c�digo.
				System.out.println("Se ejecut� el segundo case");
				break;
			case 9: //Si el valor a tomar en consideraci�n es igual a 9, se ejecuta el c�digo.
				System.out.println("Se ejecut� el tercer case");
				break;
			case 10: //Si el valor a tomar en consideraci�n es igual a 10, se ejecuta el c�digo.
				System.out.println("Se ejecut� el cuarto case");
				break;
			default: //Si ningun case resulta, se ejecuta el c�digo del default.
				System.out.println("Se ejecut� el default");
				break;
		}
		
	}
	
}
