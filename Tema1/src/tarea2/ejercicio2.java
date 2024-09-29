package tarea2;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class EdadFutura 
{
	
    public static void main(String[] args) 
    
    {
        // Creamos un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca su edad
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt(); // Leemos la edad introducida por el usuario

        // Calculamos la edad que tendrá el próximo año
        int edadProximoAnio = edad + 1;

        // Mostramos la edad que tendrá el próximo año
        System.out.println("El próximo año tendrás: " + edadProximoAnio + " años.");

        // Cerramos el scanner
        scanner.close();
    }
}
