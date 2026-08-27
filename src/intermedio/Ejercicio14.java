package intermedio;

import java.util.Scanner;

public class Ejercicio14 {
    static void main() {
        Scanner leer = new Scanner(System.in);

//        solcitamos el valor total de la compra al usuario
        System.out.println("Ingrese el valor total de la compra:");
        double total = leer.nextDouble();

//        declaramos la variable para el porcentaje de descuento
        double descuento = 0.0;


//        evaluamos los rangos de menor a mayor
        if(total<50000){
            descuento = 0.0; //0% de descuento
        } else if (total<= 150000) {
            descuento =0.05; // Descuento del 5%
        } else if (total <=300000) {
            descuento = 0.10; // descuento del 10%
        }else {
            descuento =0.15; // descuento del 15%
        }

//        calculamos el valor final a pagar
        double valorFinal = total-(total*descuento);


//        mostramos los resultados formateados
        System.out.printf("Descuento aplicado: %.0f%%%n", (descuento * 100));
        System.out.printf("El valor final a pagar es: $%.2f%n", valorFinal);

    }
}
