package cl.litscl.sintaxisjava.gLecturaDeDatos;
import java.util.Scanner; //Se importa la clase Scanner.

public class AlecturaPorConsola {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese un n�mero");
		int lectura = Integer.parseInt(sc.nextLine()); //La clase Scanner solo lee String, asi que se debe refundir el dato.
		
		System.out.println(lectura); //Se esta imprimiendo en consola el valor almacenado en la variable lectura.

	}
}
