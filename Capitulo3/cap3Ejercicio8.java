/*
 * Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.

 */

package AprendeJavaConEjercicios.Capitulo3;

import java.util.Scanner;

public class cap3Ejercicio8 {

    public static void main(String[] args) {
        // ESTABLECEMOS VARIABLES

        Double cantHorasSemana;
        Double valorHora = 12.0;
        Double salario;

        // PEDIMOS DATO

        System.out.println("Calculador Salariop Semanal Inserte Cantidad de Horas Laboradas: ");

        // instanciamos SCANNER

        try (Scanner in = new Scanner(System.in)) {
            cantHorasSemana = in.nextDouble();
        }

        // calculamos
        salario = cantHorasSemana * valorHora;

        System.out.println("El trabajador devengara " + salario + " por concepto de " + cantHorasSemana
                + " laboradas esta semana.");

    }

}
