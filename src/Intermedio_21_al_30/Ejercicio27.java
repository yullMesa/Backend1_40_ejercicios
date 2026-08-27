package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio27 {
    static void main() {
        // Creamos el objeto Scanner para leer el número por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos un número entero mayor a 1
        System.out.print("Ingresa un número entero mayor a 1: ");
        int numero = leer.nextInt();

        // Validamos que sea mayor a 1
        if (numero <= 1) {
            System.out.println("Por favor, ingresa un número mayor a 1.");
        } else {
            boolean esPrimo = true; // Bandera para indicar si es primo

            // Recorremos con un ciclo for desde 2 hasta numero - 1
            for (int i = 2; i < numero; i++) {
                // Si el residuo es 0, significa que tiene otro divisor además de 1 y sí mismo
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // Rompemos el ciclo porque ya sabemos que no es primo
                }
            }

            // Mostramos el resultado final según la bandera
            if (esPrimo) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }
    }
}
