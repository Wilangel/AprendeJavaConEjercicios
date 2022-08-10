/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 */

package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio8 {

    public static void main(String[] args) {

        try (// instanciamos Scanner para entradas
                Scanner entrada = new Scanner(System.in)) {
            // establecemos variables
            Double nota1;
            Double nota2;
            Double nota3;
            Double media;

            // pedimos datos
            System.out.println("Inserte valor de nota 1: ");

            nota1 = entrada.nextDouble();

            System.out.println("Inserte valor de nota 2: ");

            nota2 = entrada.nextDouble();

            System.out.println("Inserte valor de nota 3: ");

            nota3 = entrada.nextDouble();

            // realizamos calculos

            media = (nota1 + nota2 + nota3) / 3;

            // mostramos resultado

            if (media <= 2.9 && media >= 1) {
                System.out.println("la media es " + media + " has Reprobado.");
            }
            if (media <= 3.9 && media >= 3) {
                System.out.println("la media es " + media + " has estado Bien.");
            }
            if (media <= 5 && media >= 4) {
                System.out.println("la media es " + media + " has estado Sobresaliente.");
            }

        }

    }

}
