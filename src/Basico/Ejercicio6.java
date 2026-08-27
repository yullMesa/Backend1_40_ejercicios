package Basico;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {

        Scanner leer = new Scanner(System.in);

        // Definimos la tasa de cambio fija como una constante usando 'final'
        // (Ejemplo orientativo: suponiendo una tasa de conversión aproximada)
        final double TASA_CAMBIO = 4000.0;

        // Solicitamos el monto en pesos al usuario
        System.out.println("Ingresa el monto en pesos:");
        double pesos = leer.nextDouble();

        // Calculamos la conversión a dólares (dividiendo los pesos entre la tasa fija)
        double dolares = pesos / TASA_CAMBIO;

        // Mostramos el resultado formateado con dos decimales
        System.out.printf("El equivalente en dólares es: $%.2f%n", dolares);

    }
}
