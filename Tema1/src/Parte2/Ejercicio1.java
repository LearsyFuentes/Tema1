package Parte2;

//Importo la clase "Scanner" para recibir el numero que introduce el usuario
import java.util.Scanner;

public class Ejercicio1 

{

	public static void main(String[] args) 
	
	{
		float numero;
		int resultado;
		
		Scanner escaner = new Scanner(System.in); // Declaro variable Scanner para capturar por teclado.
		
		System.out.print("Introduzca un número con decimales: "); //Muestro por pantalla que introduzca un numero con decimales
		numero = escaner.nextFloat();
		numero += 0.5; 
		resultado = (int)numero;
		
		System.out.print(resultado);
		escaner.close();
		
		
	}

}
