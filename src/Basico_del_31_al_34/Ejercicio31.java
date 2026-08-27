package Basico_del_31_al_34;

import java.util.Scanner;

public class Ejercicio31 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos un arreglo de 5 enteros
        int[] numeros = new int[5];

        System.out.println("Ingresa 5 números enteros para llenar el arreglo:");

        // Primer ciclo for para llenar el arreglo posición por posición
        for (int i = 0; i < 5; i++) {
            System.out.print("Número en la posición " + i + ": ");
            numeros[i] = leer.nextInt(); // Guardamos el valor directamente en el arreglo
        }

        System.out.println("\nLos números guardados en el arreglo son:");

        // Segundo ciclo for para recorrer el arreglo y mostrar los valores
        for (int i = 0; i < 5; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
