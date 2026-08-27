package Basico_16_a_20;

import java.util.Scanner;

public class Ejercicio17 {

    static void main() {
        // Creamos el objeto Scanner para leer el número por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos un número entero al usuario
        System.out.println("Ingresa un número entero para ver su tabla de multiplicar:");
        int numero = leer.nextInt();

        // Usamos un ciclo for del 1 al 10 siguiendo la pista
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
