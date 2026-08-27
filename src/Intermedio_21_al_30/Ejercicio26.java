package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio26 {
    static void main() {
        // Creamos el objeto Scanner para leer la clave por teclado
        Scanner leer = new Scanner(System.in);

        // Definimos la clave correcta como una constante
        final int CLAVE_CORRECTA = 1234;

        // Variable contador de intentos
        int intentos = 0;
        int claveIngresada;
        boolean accesoConcedido = false;

        // Usamos un ciclo do-while para permitir máximo 3 intentos
        do {
            System.out.print("Ingresa tu clave de 4 dígitos: ");
            claveIngresada = leer.nextInt();
            intentos++;

            // Evaluamos si la clave es correcta
            if (claveIngresada == CLAVE_CORRECTA) {
                accesoConcedido = true;
                break; // Rompemos el ciclo si acierta
            } else {
                int intentosRestantes = 3 - intentos;
                if (intentosRestantes > 0) {
                    System.out.println("Clave incorrecta. Te quedan " + intentosRestantes + " intento(s).");
                }
            }

        } while (intentos < 3);

        // Verificamos el estado final del acceso
        if (accesoConcedido) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Cuenta bloqueada");
        }
    }
}
