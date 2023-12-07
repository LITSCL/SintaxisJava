package cl.litscl.sintaxisjava.eConversionDeTiposDeDatos;

public class LstringAfloat {
	
	public static void main(String[] args) {
		
		String numeroString = "10"; //Se declara e inicia la variable de tipo String.
		
		float numeroFloat = Float.parseFloat(numeroString); //Se refunde el dato de tipo String a float.
		
		System.out.println(numeroFloat);
		
	}
	
}
