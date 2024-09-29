package tarea1;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class MostrarNumero 
{
	

    public static void main(String[] args) 
    
    {
    	
    
        // Creamos un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt(); // Leemos el número introducido por el usuario

        // Mostramos el número que el usuario introdujo
        System.out.println("El número que has introducido es: " + numero);

        // Cerramos el scanner
        scanner.close();
   }
   
} 