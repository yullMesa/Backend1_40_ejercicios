package intermedio;

import java.util.Scanner;

public class Ejercicio12 {

    static void main() {
        Scanner leer = new Scanner(System.in);

//        solicitamos  el peso en kg
        System.out.println("Ingresa tu peso en kg");
        double peso = leer.nextDouble();

//        solcitamos la estatura en metros
        double estatura = leer.nextDouble();


//        calculamos el imc (peso dividido la estatura al cuadrado)
        double imc = peso/(estatura*estatura);

//        clasificamos el resultado evaluando de menor a mayor con condicionales
        if(imc<19.5){
            System.out.printf("Tu imc es %2.2f: tienes bajo peso .%n",imc);;
        } else if (imc<25.0) {
            System.out.printf("Tu imc es %2.2f: tienes un peso normal .%n",imc);;
        }else {
            System.out.printf("Tu imc es %2.2f: tienes sobre peso .%n",imc);;
        }

    }
}
