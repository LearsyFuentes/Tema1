package Tarea7;

import java.util.Scanner;

public class DatosPersonales {
	
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner escaner = new Scanner(System.in);
        
        // Pedir el nombre al usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = escaner.nextLine();
        
        // Pedir el apellido al usuario
        System.out.print("Introduce tu apellido: ");
        String apellido = escaner.nextLine();
        
        // Pedir la dirección al usuario
        System.out.print("Introduce tu dirección: ");
        String direccion = escaner.nextLine();
        
        // Mostrar cada campo en una línea separada
        System.out.println(""); //Para limpiar la pantalla
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        
        // Cerrar el scanner
        escaner.close();
    }
}
