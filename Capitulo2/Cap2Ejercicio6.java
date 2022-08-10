/*
 * Ejercicio 6
Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.

 */

package AprendeJavaConEjercicios.Capitulo2;

public class Cap2Ejercicio6 {
    public static void main(String[] args) {
        double baseImponible = 22.75;
        double porcentajeIVA = 19;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * (porcentajeIVA/100)));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * (1 + (porcentajeIVA/100))));

    }
}
