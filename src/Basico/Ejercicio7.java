package Basico;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio7 {

    static void main() {
        Scanner leer = new Scanner((System.in));

//    solicitamos un número al usuario usando nextIn porque es un número entero

        System.out.println("Ingrese un número entero: ");
        int numero = leer.nextInt();

//        revisamos si el sobrante de dividir entre 2 es igual a 0 si es cero es par si no es impar
        if(numero %2 == 0 ){
            System.out.println("El número " + numero + " es par.");
        }else {
            System.out.println("El número " + numero + " es impar." );
        }

    }
}
