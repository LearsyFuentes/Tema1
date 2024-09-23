package Tarea5;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class Circunferencia {
    
	public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el radio de la circunferencia
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble(); // Leemos el radio (puede contener decimales)

        // Calculamos la longitud de la circunferencia (2πr)
        double longitud = 2 * Math.PI * radio;

        // Calculamos el área de la circunferencia (πr^2)
        double area = Math.PI * Math.pow(radio, 2);

        // Mostramos los resultados
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);

        // Cerramos el scanner
        scanner.close();
    }
}

}
