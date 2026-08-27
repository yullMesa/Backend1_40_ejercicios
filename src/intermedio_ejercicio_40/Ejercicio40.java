package intermedio_ejercicio_40;

import java.util.Scanner;

public class Ejercicio40 {
    /// Método que recibe un arreglo de enteros, calcula y retorna el promedio (double)
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;

        // Recorremos el arreglo recibido usando su propia propiedad length
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Retornamos el promedio convirtiendo la suma a double para no perder decimales
        return (double) suma / numeros.length;
    }

    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos un arreglo de 5 números
        int[] arregloUsuario = new int[5];

        System.out.println("Ingresa 5 números enteros:");

        // Llenamos el arreglo con datos del usuario usando un ciclo for
        for (int i = 0; i < arregloUsuario.length; i++) {
            System.out.print("Número en la posición " + i + ": ");
            arregloUsuario[i] = leer.nextInt();
        }

        // Invocamos el método pasándole el arreglo y mostramos el resultado obtenido
        double resultadoPromedio = calcularPromedio(arregloUsuario);

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("El promedio de los elementos del arreglo es: " + resultadoPromedio);
    }
}
