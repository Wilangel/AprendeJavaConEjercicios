/*
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.

 */

package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio2 {
    public static void main(String[] args) {
        try (// establecemos scanner
                Scanner entrada = new Scanner(System.in)) {
            // establecemos variable
            int hora = 0;

            // pedimos datos

            System.out.println("que hora es? (Inserta solo horas, no se admiten minutos)");
            hora = entrada.nextInt();

            // realizamos condicional

            if (hora >= 6 && hora <= 12) {
                System.out.println("Buenos dias: ");
            }
            if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas Tardes: ");

            }
            if ((hora == 21 && hora <= 24) || (hora <= 5 && hora >= 0)) {
                System.out.println("Buenas Noches: ");
            }
            if (hora < 0 || hora > 24) {
                System.out.println("Esa Hora no es Correcta: ");
            }
        }

    }
}
