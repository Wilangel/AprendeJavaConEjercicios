/*
 * Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula V =
1/3πr^2h
 */

package AprendeJavaConEjercicios.Capitulo3;

import java.util.Scanner;

public class Cap3Ejercicio9 {

    public static void main(String[] args) {
        // establecemos variables
        Double h;
        Double r;
        Double pi = 3.1416;

        Double V;

        try (// instanciamos Scanner
        Scanner in = new Scanner(System.in)) {
            // Ingresamos Radio
            System.out.println("Ingresa el radio: ");
            r = in.nextDouble();

            // ingresa Hipotenusa

            System.out.println("Ingresa la Hipotenusa: ");
            h = in.nextDouble();
        }

        

        // calculamos

        V = (1.0/3.0) *pi* (r * r) * h;

        // mostramos resultado
        System.out.println("El volumen del cono es: " + V);

    }

}
