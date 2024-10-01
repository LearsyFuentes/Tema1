package Parte2;

import java.util.Scanner; //Importo la clase Scanner para utilizarla

public class Segundos {

	public static void main(String[] args) {
		
		//Declaro las variables que voy a utilizar
		Scanner escaner = new Scanner(System.in);
		double segundos;
		double minutos;
		double horas;
		
		//Pido una cantidad para segundos
		System.out.print("Introduce una cantidad de segundos ");
		segundos = escaner.nextDouble();
		minutos = (segundos/60);
		horas = (minutos/60);
		System.out.print(segundos +" segundos son: "+ minutos + " minutos y " + horas + " horas");
		
		escaner.close(); //Cierro escaner despues de su uso,

	}

}
