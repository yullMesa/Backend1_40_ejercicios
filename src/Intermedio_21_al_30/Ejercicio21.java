package Intermedio_21_al_30;

public class Ejercicio21 {
    static void main() {

//        ciclo externo , controla el número de la tabla (del 1 al 10)
        for (int i= 1; i <= 10 ; i++){
            System.out.println("--- Tabla del"+ i + " ----");

//            ciclo interno controla el multiplicador (del 1 al 10)
            for (int j = 1 ; j <= 10 ; j++){
                int resultado = i* j;
                System.out.println(i+ " x " + j + " = " + resultado);
            }

            //        Espacio en blanco para hacer qeu sea mas legible la tabla
            System.out.println();
        }





    }
}
