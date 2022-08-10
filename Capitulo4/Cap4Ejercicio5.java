/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).
Ejemplo 1:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 2
Ahora introduzca el valor de b: 1
x = -0.5
Ejemplo 2:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 0
Ahora introduzca el valor de b: 7
Esa ecuación no tiene solución real.

 */

package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio5 {
    public static void main(String[] args) {
        try (// instanciamos scanner
                Scanner entrada = new Scanner(System.in)) {

            // establecemos variables
            Double a;
            Double b;
            Double resultado;

            // pedimos datos
            System.out.println("Ingrese Valor de a: ");

            a = entrada.nextDouble();

            System.out.println("Ingrese el valor de b: ");

            b = entrada.nextDouble();

            // establecemos condicion y realizamos calculos

            if (a == 0 || b == 0) {
                System.out.println("Con estos valores la ecuacion es indeterminada. no tiene valor real.");
            } else {
                resultado = (-b / a);

                System.out.println("Solucion: " + resultado);
            }
        }

    }
}
