package Basico_16_a_20;

import java.util.Scanner;

public class Ejercicio18 {
    static void main() {
        // Creamos el objeto Scanner para leer el número por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos un número entero positivo N al usuario
        System.out.println("Ingresa un número entero positivo N:");
        int n = leer.nextInt();

        // Inicializamos la variable contador con el valor de N
        int contador = n;

        // Usamos un ciclo while para la cuenta regresiva hasta 1
        while (contador >= 1) {
            System.out.println(contador);
            contador--; // Decrementamos el contador en cada vuelta
        }
    }
}
