package Basico;

import java.util.Scanner;

public class Ejercicio10 {

    static void main() {

        Scanner leer = new Scanner(System.in);


//        solcitamos la nota final al usuario
        double nota = leer.nextDouble();


//        evaluamos si la nota es mayor o igual a 3.0 para aprobar
        if(nota > 3.0){
            System.out.println("El estudiante aprobo.");
        }else {
            System.out.println("El estudiante reprobo.");
        }
    }
}
