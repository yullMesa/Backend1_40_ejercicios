package Basico;

import java.util.Scanner;

public class Ejercicio5 {

    static void main() {

//        se crea el objeto scanner  para leer las calificaciones por teclado
        Scanner leer = new Scanner(System.in);

//        solicitamos las tres calificaciones al usuario
        System.out.println("Ingrese la primera calificación: ");
        double nota1 = leer.nextDouble();

        System.out.println("Ingrese la segunda calificación: ");
        double nota2 = leer.nextDouble();

        System.out.println("Ingrese la tercera calificación: ");
        double nota3 = leer.nextDouble();

//        calculamos el promedio sumando los notas y dividiendo entre 3.0
        double promedio = (nota1 + nota2 + nota3) / 3.0;

//        Mostramos el resultado formateado con dos decimales
        System.out.printf("El promedio de las tres calificaciones es: %.2f%n", promedio);
    }
}
