package Intermedio_21_al_30;

import java.util.Scanner;

public class Ejercicio30 {
    static void main() {
        // Creamos el objeto Scanner para leer los datos por teclado
        Scanner leer = new Scanner(System.in);

        // Solicitamos la cantidad de estudiantes (N)
        System.out.print("Ingresa la cantidad de estudiantes en el curso (N): ");
        int n = leer.nextInt();

        // Validamos que N sea mayor a 0
        if (n <= 0) {
            System.out.println("Por favor, ingresa un número de estudiantes mayor a 0.");
        } else {
            double sumaNotas = 0.0; // Acumulador para la suma total de las notas
            int aprobados = 0;      // Contador para los estudiantes que pasan (>= 3.0)
            int reprobados = 0;     // Contador para los estudiantes que pierden (< 3.0)

            // Ciclo for controlado por contador para pedir la nota de cada estudiante
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingresa la nota del estudiante " + i + " (0.0 a 5.0): ");
                double nota = leer.nextDouble();

                // Validamos que la nota esté en un rango lógico
                if (nota >= 0.0 && nota <= 5.0) {
                    sumaNotas += nota; // Acumulamos la nota

                    // Evaluamos si aprobó o reprobó con condicionales
                    if (nota >= 3.0) {
                        aprobados++;
                    } else {
                        reprobados++;
                    }
                } else {
                    System.out.println("Nota no válida. Inténtalo de nuevo para este estudiante.");
                    i--; // Repetimos la vuelta si la nota está fuera de rango
                }
            }

            // Calculamos el promedio general del curso
            double promedioCurso = sumaNotas / n;

            // Mostramos el reporte integrador final
            System.out.println("\n--- REPORTE FINAL DEL CURSO ---");
            System.out.printf("Promedio general del curso: %.2f%n", promedioCurso);
            System.out.println("Total de estudiantes aprobados: " + aprobados);
            System.out.println("Total de estudiantes reprobados: " + reprobados);
        }
    }

}
