package intermedio;

import java.util.Scanner;

public class Ejercicio11 {

    static void main() {
        Scanner leer = new Scanner(System.in);


//        solcitamos un número entero al usuario
        System.out.println("Ingrese un número entero: ");
        int numero = leer.nextInt();


//        inicio de condicionales anidadas

        if (numero < 0){
            System.out.println("El número es cero");
        }else{ // si no es negativo , revisamos si es cero o positivo
            if (numero == 0){
                System.out.println("El npumero es cero");
            }else { //Evaluamos si es par o impar con el simbolo %
                if (numero % 2 == 0){
                    System.out.println("El número es positivo par.");
                }else {
                    System.out.println("El npumero es positivo impar.");
                }
            }
        }

    }
}
