package Basico_del_31_al_34;

import java.util.Scanner;

public class Ejercicio32 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos un arreglo de 10 enteros
        int[] numeros = new int[10];
        int suma = 0; // Variable acumuladora para sumar los elementos

        System.out.println("Ingresa 10 números enteros:");

        // Primer ciclo for para llenar el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número en la posición " + i + ": ");
            numeros[i] = leer.nextInt();
        }

        // Segundo ciclo for para recorrer el arreglo y acumular la suma
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; // Sumamos el valor que está guardado en cada posición
        }

        // Calculamos el promedio (convertimos suma a double para que los decimales no se pierdan)
        double promedio = (double) suma / numeros.length;

        // Mostramos los resultados finales
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("La suma total de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
    }
}
