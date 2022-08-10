/*
 * Ejercicio 7
Escribe un programa que calcule el total de una factura a partir de la base
imponible.
 */

package AprendeJavaConEjercicios.Capitulo3;

import java.util.Scanner;

public class Cap3Ejercicio7 {

    public static void main(String[] args) {
        try (// creamos el objeto scanner
                Scanner in = new Scanner(System.in)) {
            // establecemos variables
            Double baseImponible;
            Double porcentajeIVA = 19.0;

            // pedimos datos

            System.out.println("Inserte la base imponible: ");
            // asignamos datos
            baseImponible = in.nextDouble();

            System.out.println("El Valor del impuesto de la Factura es: " + (baseImponible * (porcentajeIVA / 100)));
            System.out.println("El Valor total de la factura es: " + (baseImponible * (1 + (porcentajeIVA / 100))));
        }

    }

}
