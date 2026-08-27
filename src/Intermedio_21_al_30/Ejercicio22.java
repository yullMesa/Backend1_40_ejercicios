package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio22 {
    static void main() {

        Scanner leer = new Scanner(System.in);


//        solicitamos un número entero N al usuario

        System.out.println("Ingrese un número entero N para calcular su factorial");
        int number = leer.nextInt();

//        iniciamos la variable acumuladora en tipo long (porque el factorial crece muy rapido)
        long factorial =1;

//        uso un ciclo for desde 1 hasta n para multiplicar acumulativamente
        for (int i = 1; i <= number ; i++){
            factorial *=i;
        }

        System.out.println("El factorial de " + number + " (!" + number + ") es: " + factorial);
    }
}
