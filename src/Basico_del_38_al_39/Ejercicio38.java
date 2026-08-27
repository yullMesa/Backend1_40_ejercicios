package Basico_del_38_al_39;

public class Ejercicio38 {

    // Método estático que recibe un entero y retorna true si es par, o false si es impar
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        // Definimos al menos tres números distintos para probar el método
        int num1 = 4;
        int num2 = 7;
        int num3 = 122;

        System.out.println("--- PRUEBA DEL MÉTODO esPar ---");

        // Invocamos el método desde main() y mostramos los resultados
        System.out.println("¿El número " + num1 + " es par? " + esPar(num1));
        System.out.println("¿El número " + num2 + " es par? " + esPar(num2));
        System.out.println("¿El número " + num3 + " es par? " + esPar(num3));
    }
}
