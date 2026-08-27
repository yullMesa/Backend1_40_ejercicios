package Basico;

import java.util.Scanner;

public class Ejercicio8 {

    static void main() {
        Scanner leer = new Scanner(System.in);

//    solicitamos un número al usuario (yo yull mesa usare double para que el condicional acepte decimales  )
        System.out.println("Ingrese un número.");
        double numero = leer.nextDouble();

//        evaluamos los tres caminos posibles
        if(numero>0){
            System.out.println("El número " + numero+ " es positivo.");
        } else if (numero<0) {
            System.out.println("El número " +numero+ "es negativo.");
        }else {
            System.out.println("Su número es cero.");
        }


    }

}
