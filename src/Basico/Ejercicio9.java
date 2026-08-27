package Basico;

import java.util.Scanner;

public class Ejercicio9 {

    static void main() {

        Scanner leer = new Scanner(System.in);


//        solicitamos  la edad al usuario
        int edad = leer.nextInt();


//        evaluamos si es mayor o igual a 18 años
        if (edad >=18){
            System.out.println("Eres mayor de edad.");
        }else {
            System.out.println("Eres menor de edad.");
        }
    }
}
