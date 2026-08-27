package intermedio_del_35_al_37;

import java.util.Scanner;

public class Ejercicio37 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos una matriz de 3x3 enteros
        int[][] matriz = new int[3][3];

        System.out.println("Ingresa los valores para llenar la matriz 3x3:");

        // Ciclos for anidados para llenar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }

        // Mostramos la matriz para referencia visual
        System.out.println("\n--- MATRIZ INGRESADA ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculamos y mostramos la suma de cada fila
        System.out.println("\n--- SUMA DE FILAS ---");
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0; // Acumulador independiente para cada fila
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j]; // Sumamos manteniendo fija la fila i y recorriendo las columnas j
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaFila);
        }

        // Calculamos y mostramos la suma de cada columna
        System.out.println("\n--- SUMA DE COLUMNAS ---");
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0; // Acumulador independiente para cada columna
            for (int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j]; // Sumamos manteniendo fija la columna j y recorriendo las filas i
            }
            System.out.println("La suma de la columna " + j + " es: " + sumaColumna);
        }
    }
}
