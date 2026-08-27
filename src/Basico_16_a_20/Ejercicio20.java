package Basico_16_a_20;

import java.util.Scanner;

public class Ejercicio20 {
    static void main() {
        // Creamos el objeto Scanner para leer el número por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos el número N al usuario
        System.out.println("Ingresa un número N:");
        int n = leer.nextInt();

        // Declaramos la variable acumuladora inicializada en 0
        int suma = 0;

        // Usamos un ciclo for desde 1 hasta N siguiendo la pista
        for (int i = 1; i <= n; i++) {
            suma = suma + i; // Acumulamos la suma en cada vuelta
        }

        // Mostramos el resultado final
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }
}
