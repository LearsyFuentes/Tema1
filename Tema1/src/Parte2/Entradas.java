package Parte2;

import java.util.Scanner; //Importo la clase Scanner para capturar por teclado

public class Entradas 

{

	public static void main(String[] args) 
	
	{
		
	//Declaro las variables que voy a usar
		Scanner escaner = new Scanner(System.in);
		
		 // Precios de las entradas
        final double PRECIO_INFANTIL = 15.50;
        final double PRECIO_ADULTO = 20.00;
        final double DESCUENTO = 0.05;
        final double LIMITE_DESCUENTO = 100.00;
        
        // Solicitar número de entradas infantiles
        System.out.print("Introduce el número de entradas infantiles: ");
        int numInfantiles = escaner.nextInt();

        // Solicitar número de entradas de adultos
        System.out.print("Introduce el número de entradas de adultos: ");
        int numAdultos = escaner.nextInt();
        
        // Calcular el importe total
        double totalSinDescuento = (numInfantiles * PRECIO_INFANTIL) + (numAdultos * PRECIO_ADULTO);
        
     // Aplicar descuento si el total es mayor o igual a 100€
        totalSinDescuento = (totalSinDescuento >= LIMITE_DESCUENTO) ? (totalSinDescuento -= totalSinDescuento * DESCUENTO) : totalSinDescuento;
       
        // Mostrar el importe total a pagar
        System.out.printf("El importe total a pagar es: %.2f€\n", totalSinDescuento);

	
	escaner.close();	
	}

}
