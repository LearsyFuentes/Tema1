package tarea6;

import java.util.Scanner;



public class Operacionesbasicas 
{

	
	
	
	
	public static void main(String[] args) 
		
	{

	    /*
	     * double ResultadoSuma;
		double ResultadoResta;
		double ResultadoMultiplicacion;
		double ResultadoDivision;
		*/
		
		//Pedir 2 numeros al usuario
		System.out.print(" Introduce un número: ");
		
		//Creo una variable Scanner para guardar el numero 1
		Scanner scanner = new Scanner(System.in);
		
		//Guardo el numero 1 introducido por teclado
		double Num1 = scanner.nextDouble();
		
		//Pido otro numero
		System.out.print(" Introduce un segundo número: ");
		double Num2 = scanner.nextDouble();
	
	 	double ResultadoSuma = Num1 + Num2;   // Sumo el numero 1 y el 2 y el resultado lo guardo en la variable ResultadoSuma
		double ResultadoResta = Num1 - Num2;  // Resto ambos numeros y el resultado lo guardo en la variable ResultadoResta
		double ResultadoMultiplicacion = Num1 * Num2;  // Multiplico ambos numeros y lo guardo en una variable
		double ResultadoDivision = Num1/Num2;  // Divido ambos numeros y lo guardo en una variable
		
		System.out.println("El resultado de la suma es: " + ResultadoSuma); // Muestro el resultado de la suma de ambos numeros
		System.out.println("El resultado de la resta es: " + ResultadoResta); //Muestro el resultado de la resta.
		System.out.println("El resultado de la multiplicación es: " + ResultadoMultiplicacion); //Muestro el resultado de la multiplicacion
		System.out.println("El resultado de la división es: " + ResultadoDivision); // Muestro el resultado de la division
		
		scanner.close();  // hay que cerrar el escaner
	}

}
