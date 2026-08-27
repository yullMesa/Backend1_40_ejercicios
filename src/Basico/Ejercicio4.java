package Basico;

import java.util.Scanner;

public class Ejercicio4 {

    static void main() {

//        scanner para pedir datos al usuario.
        Scanner leer = new Scanner(System.in);


//        solicitamos el radio del circulo
        System.out.println("Ingresa el radio del circulo: ");
        double radio = leer.nextDouble();

//        calculamos el area (pi* radio el cuadrado) y la circunferencia (2* pi * radio)
        double area = Math.PI * (radio * radio);
        double circunferencia  = 2 * Math.PI * radio;


//        mostramos los resultados formateados con dos decimales
        System.out.printf("El área del círculo es: %.2f%n", area);
        System.out.printf("La circunferencia del círculo es: %.2f%n", circunferencia);


    }


}

