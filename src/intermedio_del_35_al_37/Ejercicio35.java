package intermedio_del_35_al_37;

import java.util.Scanner;

public class Ejercicio35 {

    static void main() {
        Scanner leer = new Scanner(System.in);


//        declaramos un arreglo o vector de 6 enteros
        int[] numeros = new int[6];

        System.out.println("Ingrese 6 números enteros:");

//        primer ciclo for para llenar el arreglo en orden normal
        for (int i =0 ; i < numeros.length; i++){
            System.out.println("Número en la posición " + i + ":");
            numeros[i] = leer.nextInt();
        }

//        mostramos los elementos en orden inverson
        System.out.println("\n --- ELEMENTOS EN ORDEN INVERSO ---" );

        // Ciclo for que comienza en el último índice (length - 1) y va disminuyendo hasta 0
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
