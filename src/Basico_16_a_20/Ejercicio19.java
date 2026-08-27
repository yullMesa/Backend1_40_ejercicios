package Basico_16_a_20;

import java.util.Scanner;

public class Ejercicio19 {
    static void main() {
        // Creamos el objeto Scanner para leer el número por teclado
        Scanner leer = new Scanner(System.in);

        int numero;

        // Usamos un ciclo do-while para asegurar que se pida el número al menos una vez
        do {
            System.out.println("Ingresa un número positivo:");
            numero = leer.nextInt();

            if (numero <= 0) {
                System.out.println("El número debe ser positivo. Inténtalo de nuevo.");
            }
        } while (numero <= 0); // Se repite mientras el número no sea positivo

        System.out.println("¡Excelente! Ingresaste el número positivo: " + numero);
    }
}
