package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio23 {
    static void main() {

        Scanner leer = new Scanner(System.in);

//        variable bandera para controlar  el ciclo while (inicia en 0)
        int opcion = 0;

//        usamos el ciclo while para mantener el menú activo hasta que elija salir
        while (opcion !=3){
            System.out.println("\n--- MENÚ INTERACTIVO ---");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Salir");

            opcion = leer.nextInt();


//            evaluamos la opcion elegida con un condicional
            if (opcion == 1) {
                System.out.print("Ingresa el primer número: ");
                double num1 = leer.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = leer.nextDouble();
                System.out.println("Resultado de la suma: " + (num1 + num2));
            } else if (opcion == 2) {
                System.out.print("Ingresa el primer número: ");
                double num1 = leer.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = leer.nextDouble();
                System.out.println("Resultado de la resta: " + (num1 - num2));
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }



    }
}
