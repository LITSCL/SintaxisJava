package cl.litscl.sintaxisjava.hFunciones;

public class BfuncionesConParametrosObligatorios {
	
	//Declarando la función con un parámetro.
	public static void mostrarNombre(String nombre) {
	    System.out.println(nombre);
	}

	//Declarando la función con dos parámetros.
	public static void mostrarNombreMasApellido(String nombre, String apellido) {
	    System.out.println(nombre + " " + apellido);
	}
	
	public static void main(String[] args) {
		
		//Llamando la función y entregando un parámetro.
		mostrarNombre("Daniel");

		//Llamando la función y entregando dos parámetros.
		mostrarNombreMasApellido("Daniel", "Alvarez");
		
	}

}
