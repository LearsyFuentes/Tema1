package Tarea11;

//Importo la clase "Scanner" para recibir el numero que introduce el usuario
import java.util.Scanner; 


public class Conversor {

	public static void main(String[] args) {
		
		// Pido un numero al usuario
		System.out.print("Introduce una cantidad en pts: ");
				
		//Declaro una variable tipo Scanner para recibir el numero y guardarlo
		Scanner  escaner = new Scanner (System.in);
		int cantidad = escaner.nextInt(); //Declaro variable cantidad para guardar la cifra introducida por el usuario
		
		int euros = (cantidad/166);  //Guardo en la variable euros la division de cantidad entre 166 para convertir a euros
		
		System.out.println(""); // Para dejar una linea vacia en pantalla
		System.out.println(cantidad + " pts son " + euros + "€");  //Muestra la conversion en euros.
		
		
		// Cerrar el scanner
        escaner.close();
		
	}

}
