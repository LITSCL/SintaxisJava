package cl.litscl.sintaxisjava.eConversionDeTiposDeDatos;

public class IfloatAstring {
	
	public static void main(String[] args) {
		
		float numeroFloat = 10; //Se declara e inicia la variable de tipo float.
		
		String numeroString = Float.toString(numeroFloat); //Se refunde el dato de tipo float a String.
		
		System.out.println(numeroString);
		
	}
	
}

