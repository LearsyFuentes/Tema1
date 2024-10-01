package Parte2;

import java.util.Scanner; // Importo Scanner pues me va a hacer falta

public class MultiploSumador 

{

	public static void main(String[] args) 
	
	{
		Scanner escaner = new Scanner(System.in); // Declaro la variable escaner
		int num1;   // Declaro las variables que voy a usar
		int num2;
		int resto;
		int cantidadASumar;
		 
		// Entrada de datos
        System.out.print("Introduce el número 1: ");
        num1 = escaner.nextInt();

        System.out.print("Introduce el número 2: ");
        num2 = escaner.nextInt();

        // Comprobar si num1 es múltiplo de num2
        resto = num1 % num2;
		
        cantidadASumar = (resto == 0) ? 0 : (cantidadASumar = num2 - resto);
        
        //System.out.println("No es necesario sumar nada, num1 ya es múltiplo de num2."); 
		
        System.out.println("Debes sumar " + cantidadASumar + " a " + num1 + " para que sea múltiplo de "+ num2);
        
		escaner.close(); //Apago, cierro la variable escaner.
	}

}
