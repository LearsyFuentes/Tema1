package Parte2;

import java.util.Scanner;

public class Lanzamiento 
{

	public static void main(String[] args) 
	{
		double lanzamientoM;
		double lanzamientoC;
		int lanzamientoF;
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.print("Indica la longitud del lanzamiento en metros: ");
		
		lanzamientoM = escaner.nextDouble();
		lanzamientoC = lanzamientoM*100;
		lanzamientoF = (int)lanzamientoC;
		
		System.out.print(lanzamientoF + " cm");
		
		escaner.close();
	}

}
