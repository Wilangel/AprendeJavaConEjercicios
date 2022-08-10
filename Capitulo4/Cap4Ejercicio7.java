/*
 * Realiza un programa que calcule la media de tres notas.
 */

package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio7 {
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

            System.out.println("la media de las notas es: " + media);
        }
    }
}
