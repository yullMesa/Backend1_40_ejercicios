package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio28 {
    static void main() {
        // Creamos el objeto Scanner para leer el número por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos un número entero positivo al usuario
        System.out.print("Ingresa un número entero positivo: ");
        int numero = leer.nextInt();

        // Validamos que sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingresa un número mayor a 0.");
        } else {
            int original = numero;
            int invertido = 0;

            // Usamos un ciclo while para invertir los dígitos siguiendo la pista
            while (numero > 0) {
                int digito = numero % 10;            // Obtenemos el último dígito
                invertido = invertido * 10 + digito; // Construimos el número invertido
                numero /= 10;                        // Quitamos el último dígito del número original
            }

            // Mostramos el resultado final
            System.out.println("El número " + original + " con sus dígitos invertidos es: " + invertido);
        }
    }
}
