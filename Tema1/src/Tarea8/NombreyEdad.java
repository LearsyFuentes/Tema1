package Tarea8;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class NombreyEdad {
	
    public static void main(String[] args) {
    	
        // Creamos un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca su nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine(); // Leemos el nombre del usuario

        // Pedimos al usuario que introduzca su edad
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt(); // Leemos la edad del usuario

        // Mostramos el mensaje personalizado
        System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");

        // Cerramos el scanner
        scanner.close();
        
    }
}
