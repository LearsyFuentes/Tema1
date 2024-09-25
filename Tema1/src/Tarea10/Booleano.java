package Tarea10;

// Importo la clase "Scanner" para recibir el numero que introduce el usuario
import java.util.Scanner; 

public class Booleano 
{

	public static void main(String[] args) 
	{
		//Declaro las variables q voy a usar
		int numero;
		boolean numeroPar;
		
		// Pido un numero al usuario
		System.out.print("Introduce un número: ");
		
		//Declaro una variable tipo Scanner para recibir el numero y guardarlo
		Scanner  escaner= new Scanner (System.in);
		numero = escaner.nextInt();
		
		// Verificar si el número es par
		numeroPar = (numero % 2 == 0);
		
		//Muestro el numero
		System.out.println("¿El numero es par? " + numeroPar);
		
		// Cierro el Scanner
		escaner.close();

	}

}
