package Parte2;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario desde el teclado.

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		
		        double numero;
		        double resto ;
		        double cantidadASumar;
		        
		// Creamos un objeto Scanner para leer la entrada desde el teclado
				Scanner escaner = new Scanner(System.in);
				
				System.out.print("Introduce un numero: ");
				numero = escaner.nextDouble();
				resto  = numero%7;
				
			    // Si el número ya es múltiplo de 7
				
		        cantidadASumar = (resto == 0) ? 0 : (7 - resto);
		        
		     // Mostrar el resultado
		        System.out.println("Hay que sumarle " + cantidadASumar + " para que " + numero + " sea múltiplo de 7.");
				
				
				escaner.close();
	}

}
