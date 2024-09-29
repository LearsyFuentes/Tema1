package tarea3;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class CalcularEdad 
{
    public static void main(String[] args) 
    {
        // Creamos un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el año actual
        System.out.print("Introduce el año actual: ");
        int anioActual = scanner.nextInt(); // Leemos el año actual

        // Pedimos al usuario que introduzca su año de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt(); // Leemos el año de nacimiento

        // Calculamos la edad del usuario
        int edad = anioActual - anioNacimiento;

        // Mostramos la edad calculada
        System.out.println("Tienes " + edad + " años.");

        // Cerramos el scanner
        scanner.close();
    }

}
