package Basico_del_31_al_34;

import java.util.Scanner;

public class Ejercicio33 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos un arreglo de 8 enteros
        int[] numeros = new int[8];

        System.out.println("Ingresa 8 números enteros:");

        // Ciclo for para llenar el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número en la posición " + i + ": ");
            numeros[i] = leer.nextInt();
        }

        // Inicializamos maximo y minimo con el primer elemento del arreglo (posición 0)
        int maximo = numeros[0];
        int minimo = numeros[0];

        // Recorremos el arreglo desde la posición 1 para comparar cada valor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i]; // Actualizamos el máximo si encontramos uno mayor
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i]; // Actualizamos el mínimo si encontramos uno menor
            }
        }

        // Mostramos los resultados finales
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("El valor máximo en el arreglo es: " + maximo);
        System.out.println("El valor mínimo en el arreglo es: " + minimo);
    }
}
