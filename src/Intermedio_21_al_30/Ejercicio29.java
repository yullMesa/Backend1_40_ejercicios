package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio29 {
    static void main() {
        // Creamos el objeto Scanner para leer N por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos la cantidad de términos de la serie
        System.out.print("Ingresa la cantidad de términos (N) para la serie de Fibonacci: ");
        int n = leer.nextInt();

        // Validamos que N sea mayor a 0
        if (n <= 0) {
            System.out.println("Por favor, ingresa un número mayor a 0.");
        } else {
            long a = 0; // Primer término de Fibonacci
            long b = 1; // Segundo término de Fibonacci

            System.out.print("Serie de Fibonacci: ");

            // Recorremos con un ciclo for para generar los N términos
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                // El siguiente término es la suma de los dos anteriores
                long siguiente = a + b;

                // Actualizamos las variables para la siguiente vuelta
                a = b;
                b = siguiente;
            }
            System.out.println();
        }
    }
}
