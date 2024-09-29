package tarea4;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class MediaAritmetica 

{
	
    public static void main(String[] args) 
    
    {
        // Creamos un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca la primera nota
        System.out.print("Introduce la primera nota: ");
        int nota1 = scanner.nextInt(); // Leemos la primera nota

        // Pedimos al usuario que introduzca la segunda nota
        System.out.print("Introduce la segunda nota: ");
        int nota2 = scanner.nextInt(); // Leemos la segunda nota

        // Calculamos la media aritmética
        double media = (nota1 + nota2) / 2.0; // Usamos 2.0 para obtener un resultado decimal

        // Mostramos la media aritmética
        System.out.println("La media aritmética es: " + media);

        // Cerramos el scanner
        scanner.close();
    }
}