package Basico;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        //aqui hacemos la plantilla apra leer lo que el usuario ingrese por pantalla.
        Scanner leer = new Scanner(System.in);

        //solicitamos la base del rectangulo
        System.out.println("Ingrese la base del rectangulo");
        double base = leer.nextDouble();

        //Solicitamos la altura al usuario
        System.out.println("Ingrese la altura del rectangulo");
        double altura = leer.nextDouble();

        //calcular el área y el perimetro
        double area = base * altura;
        double perimetro = 2* (base+altura);

        //mostrar los resultados en pantalla
        System.out.println("El área del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
