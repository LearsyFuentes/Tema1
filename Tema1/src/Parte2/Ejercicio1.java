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
		numero = escaner.nextFloat(); //Recibo el valor y lo guardo en numero
		numero += 0.5; // Le sumo 0,5 a numero para redondear
		resultado = (int)numero; //Muestro resultado truncando numero
		
		System.out.print(resultado);  //Muestro resultado en pantalla
		escaner.close();   //Cierro Scanner
		
		
	}

}
