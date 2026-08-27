package Basico_del_38_al_39;

public class Ejercicio39 {
    // Método estático que recibe base y altura (double) y retorna el área calculada
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        // Definimos distintos pares de valores para probar el método
        double base1 = 5.0, altura1 = 3.0;
        double base2 = 12.5, altura2 = 4.0;
        double base3 = 7.2, altura3 = 6.5;

        System.out.println("--- PRUEBA DEL MÉTODO calcularAreaRectangulo ---");

        // Invocamos el método desde main() con los pares de valores y mostramos los resultados
        System.out.println("Área con base " + base1 + " y altura " + altura1 + " = " + calcularAreaRectangulo(base1, altura1));
        System.out.println("Área con base " + base2 + " y altura " + altura2 + " = " + calcularAreaRectangulo(base2, altura2));
        System.out.println("Área con base " + base3 + " y altura " + altura3 + " = " + calcularAreaRectangulo(base3, altura3));
    }
}
