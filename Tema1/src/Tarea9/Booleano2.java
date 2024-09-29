package Tarea9;

import java.util.Scanner;

public class Booleano2 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);

		System.out.print("Cúal es tu edad: ? ");
		int edad = escaner.nextInt();
		
		  // Determinar si es mayor de edad (18 años o más)
        boolean esMayorDeEdad = edad >= 18;
		
        // Mostrar el resultado booleano
        System.out.println("¿Eres mayor de edad?: " + esMayorDeEdad);
		
		
		// Cierro el Scanner
				escaner.close();
	}

}
