package Basico_del_31_al_34;

import java.util.Scanner;

public class Ejercicio34 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos un arreglo de 10 enteros y un contador de pares en 0
        int[] numeros = new int[10];
        int contadorPares = 0;

        System.out.println("Ingresa 10 números enteros:");

        // Primer ciclo for para llenar el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número en la posición " + i + ": ");
            numeros[i] = leer.nextInt();
        }

        // Segundo ciclo for para recorrer el arreglo y contar los pares
        for (int i = 0; i < numeros.length; i++) {
            // Usamos el operador % 2 para verificar si el residuo es 0 (es par)
            if (numeros[i] % 2 == 0) {
                contadorPares++; // Incrementamos el contador si cumple la condición
            }
        }

        // Mostramos el resultado final
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("La cantidad de números pares en el arreglo es: " + contadorPares);
    }
}
