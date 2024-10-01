package Parte2;

import java.util.Scanner; // importo la clase Scanner

public class Polinomio 

{

	public static void main(String[] args) 
	
	{
		
		//Declaro las variables que voy a utilizar
		Scanner escaner = new Scanner(System.in);
		double a;
		double b;
		double c;
		double x;
		double y;
		
		//Pregunto al usuario por el valor de las variables y guardo el valor en la variable correspondiente
	    System.out.print("Introduce un valor para a ");
	    a = escaner.nextDouble();
	
	    System.out.print("Introduce un valor para b ");
	    b = escaner.nextDouble();
	    
	    System.out.print("Introduce un valor parra c ");
	    c = escaner.nextDouble();
	    
	    System.out.print("Introduce un valor para x ");
	    x = escaner.nextDouble();
	    
	    
	    //Resuelvo el polinomio y guardo el resultado en la variable resultadoPolinomio
	    
	    y = a*(Math.pow(x, 2)) + b*x + c;
	    
	    double resultadoPolinomio = y;
	    
	        
	    //Muestro por pantalla el polinomio y el resultado
	    
	    System.out.print("el valor de y es: " + y);
	    
	  escaner.close();
	
	}		

}
