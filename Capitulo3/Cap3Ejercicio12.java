/*
 * Ejercicio 12
Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
Ejemplo 1:
Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
Ejemplo 2:
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 */

package AprendeJavaConEjercicios.Capitulo3;

import java.util.Scanner;

public class Cap3Ejercicio12 {
    public static void main(String[] args) {
        try (// Instanciamos objeto scanner
        Scanner entrada = new Scanner(System.in)) {
            // establecemos variables
            Double nota1;
            Double nota2;
            Double notaDefinitiva;

            // Pedimos datos.
            System.out.println("Inserta la nota del primer examen: (esta nota vale 40%) ");
            nota1 = entrada.nextDouble();

            System.out.println("Inserta la nota deseada: ");
            notaDefinitiva = entrada.nextDouble();

            /*
             * hacemos calculos teniendo en cuenta que la nota 1 es el 40% y la nota 2 es el
             * 60%
             * entonces notaDefinitiva = ((nota1 * 40) + (nota2 * 60)) /100
             * despejando nota2 = ((notaDefinitiva*100)-(nota1*40))/60
             */

            nota2 = ((notaDefinitiva * 100) - (nota1 * 40)) / 60;

            // mostramos resultados:
            System.out.println("Para tener un " + notaDefinitiva + " en el trimestre necesitas sacar un " + nota2
                    + " en el segundo examen");
        }

    }
}
