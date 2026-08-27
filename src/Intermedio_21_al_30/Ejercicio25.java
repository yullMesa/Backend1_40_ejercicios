package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio25 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos cuántas calificaciones se van a ingresar (N)
        System.out.println("¿Cuántas calificaciones vas a ingresar?");
        int number = leer.nextInt();

//        validamos que N sea  mayor a 0  para evitar divisiones entre cero.
        if (number> 0){
            double suma = 0.0;

//            ciclo controlado por contador para pedir cada nota
            for (int i =1; i <=number; i++){
                System.out.print("Ingresa la calificación " + i + ": ");
                double nota = leer.nextDouble();
                suma += nota; // Acumulamos la nota ingresad
            }

            // Calculamos el promedio final dividiendo la suma entre N
            double promedio = suma / number;

            // Mostramos el resultado formateado
            System.out.printf("El promedio final es: %.2f%n", promedio);
        }else {
            System.out.println("Debe ingresar al menos una calificación.");
        }

    }
}
