package Basico;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        //creamos la plantilla para recibir datos de la terminal
        Scanner leer = new Scanner(System.in);

//        solicitamos la temperatura en grados celsius
        System.out.println("Ingrese la temperatura en grados celsius.");
        double celsius = leer.nextDouble();

//        convertimos a farenheit usando la formula : f = (c * 9/5) +32
        double fahrenheit= (celsius* 9.8/5.0) + 32;

//        mostramos por pantalla el resultado de la conversión
        System.out.printf("La temperatura en Fahrenheit es: %.2f%n", fahrenheit);
    }
}
