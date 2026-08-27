package intermedio;

import java.util.Scanner;

public class Ejercicio15 {
    static void main() {
        Scanner leer = new Scanner(System.in);

        // Solicitamos los tres números enteros al usuario
        System.out.println("Ingresa el primer número entero:");
        int num1 = leer.nextInt();

        System.out.println("Ingresa el segundo número entero:");
        int num2 = leer.nextInt();

        System.out.println("Ingresa el tercer número entero:");
        int num3 = leer.nextInt();

        int mayor;

        // Comparamos el primero contra el segundo usando condicionales anidados
        if (num1 > num2) {
            // Si num1 es mayor, evaluamos si también es mayor que el tercero
            if (num1 > num3) {
                mayor = num1;
            } else {
                mayor = num3;
            }
        } else {
            // Si num2 es mayor o igual, evaluamos si también es mayor que el tercero
            if (num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
        }

        // Mostramos el resultado
        System.out.println("El número mayor es: " + mayor);
    }
}
