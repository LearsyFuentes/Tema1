package Parte2;

import java.util.Scanner; // Importo la clase Scanner para poder utilizarla

public class Distancias 
{

	public static void main(String[] args) 
	{	
		
		//Declaro las variables que voy a usar
		Scanner escaner = new Scanner(System.in);
		double primera;
		double segunda;
		double tercera;
		double resultadoSuma;
		
		
		//Pido que introduzcan los datos y los guardo en variables
		System.out.print("Introduce una distancia en mm: ");
		primera = escaner.nextDouble();
		
		System.out.print("Introduce otra distancia en cm: ");
		segunda = escaner.nextDouble();
		
		System.out.print("Introduce una ultima distancia, en m: ");
		tercera = escaner.nextDouble();
		
		//Convierto todo a centimetros y lo muestro
		
		primera = (primera/10);
		tercera = (tercera*10);
		resultadoSuma = primera + segunda + tercera;
		
		System.out.print("La suma de las tres distancias es igual a: " + resultadoSuma + " centimetros");
		
		
		escaner.close();
	}

}
