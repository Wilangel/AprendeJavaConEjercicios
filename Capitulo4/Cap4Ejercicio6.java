/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. 
Aplica la fórmula t = √2h/g
siendo g = 9.81m/s2

 */
package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio6 {
    public static void main(String[] args) {
        try (// establecemos scanner
        Scanner entrada = new Scanner(System.in)) {
            final Double g = 9.81; // constantes se establecen con final
            double h;
            double t;

            // pedimos datos
            System.out.println("Calculador de tiempo de caida: ");
            System.out.println("Ingrese la altura en metros: ");
            h = entrada.nextDouble();

            // realizamos calculos

            t = Math.sqrt(2 * h / g); // usamos el metodo sqrt de la clase math para simplificar la realizacion de
                                      // raiz cuadrada

            // mostramos resultados

            System.out.println("para los datos ingresados el tiempo de caida son: " + t + " Segundos");
        }

        // establecemos Variables y constantes


    }
}
