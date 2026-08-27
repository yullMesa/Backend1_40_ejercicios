package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio24 {
    static void main() {
        // Creamos el objeto Scanner para leer el número por teclado
        Scanner leer = new Scanner(System.in);

//        solicitamos el npumero N al
        System.out.println("Ingrese un número entero:");
        int number = leer.nextInt();


//        declaramos la variable acumuladora
        int suma = 0;

//        recorremos  con un ciclo for desde 1 hasta N

        for(int i = 1;i <= number; i++){
            // Evaluamos si el número actual es par usando el operador módulo
            if (i% 2==0){
                suma += i;// Acumulamos únicamente si es par
            }
        }


        // Mostramos el resultado final
        System.out.println("La suma de los números pares entre 1 y " + number + " es: " + suma);
    }
}
