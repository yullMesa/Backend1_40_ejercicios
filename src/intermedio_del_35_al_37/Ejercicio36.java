package intermedio_del_35_al_37;

import java.util.Scanner;

public class Ejercicio36 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos una matriz de 3x3 enteros (arreglos bidimensionales)
        int[][] matriz = new int[3][3];

        System.out.println("Ingresa los valores para llenar la matriz 3x3:");

        // Ciclos for anidados para llenar la matriz (i = filas, j = columnas)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }

        // Mostramos la matriz en pantalla con formato de filas y columnas
        System.out.println("\n--- MATRIZ 3X3 ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t agrega una tabulación (espacio limpio)
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }
}
