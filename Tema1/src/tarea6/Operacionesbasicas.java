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
		double ResultadoResta = Num1 - Num2;
		double ResultadoMultiplicacion = Num1 * Num2;
		double ResultadoDivision = Num1/Num2;
		
		System.out.println("El resultado de la suma es: " + ResultadoSuma); // Muestro el resultado de la suma de ambos numeros
		System.out.println("El resultado de la resta es: " + ResultadoResta); //Muestro el resultado de la resta.
		System.out.println("El resultado de la multiplicación es: " + ResultadoMultiplicacion);
		System.out.println("El resultado de la división es: " + ResultadoDivision);
		
		scanner.close();
	}

}
