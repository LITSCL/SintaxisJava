package cl.litscl.sintaxisjava.eConversionDeTiposDeDatos;

public class FdoubleAstring {
	
	public static void main(String[] args) {
		
		double numeroDouble = 10; //Se declara e inicia la variable de tipo double.
		
		String numeroString = Double.toString(numeroDouble); //Se refunde el dato de tipo double a String.
		
		System.out.println(numeroString);
		
	}
	
}

