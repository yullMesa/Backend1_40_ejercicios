package intermedio;

import java.util.Scanner;

public class Ejercicio13 {

    static void main() {
        Scanner leer = new Scanner(System.in);

//        solcitamos el año al usuario
        System.out.println("Ingrese un año:");
        int anio = leer.nextInt();

//        evaluamos la ergla del año bisiesto  usando operadores  lógicos (&& y ||)
//        Es bisiesto si es divisble entre 4 (no es divisible entre 100 o es divisible entre 400)
        if ((anio % 4 == 0 && anio % 100 !=0) || (anio % 400 ==0)){
            System.out.println("El año " + anio + " es bisiesto.");
        }else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

    }
}
