/*
 * Ejercicio 11
Realiza un conversor de Kb a Mb.
 */
package AprendeJavaConEjercicios.Capitulo3;

import java.util.Scanner;

public class Cap3Ejercicio11 {
    public static void main(String[] args) {

        // establecemos variables
        Double MB;
        Double tasa = 1024.0;
        Double KB;

        try (// instanciamos scanner
        Scanner in = new Scanner(System.in)) {
            // pedimos datos
            System.out.println("Convertidor de KB a MB: ");
            System.out.println("Inserte los KB a convetir");

            // establecemos datos
            KB = in.nextDouble();
        }

        // calculamos y mostramos
        MB = KB / tasa;
        System.out.println(KB + " KB, son: " + MB + " MB");
    }
}
