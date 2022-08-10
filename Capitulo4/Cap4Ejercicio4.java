/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
 */

package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio4 {
    public static void main(String[] args) {
        
        try (// instanciamos scanner
        Scanner entrada = new Scanner(System.in)) {
            Double horasLaboradas;
            Double Sueldo;

            // pedimos horas laboradas
            System.out.println("Digite cantidad de horas laboradas: ");

            horasLaboradas = entrada.nextDouble();

            if (horasLaboradas < 40) {
                Sueldo = horasLaboradas * 12;
            } else {
                Sueldo = (40*12)+((horasLaboradas - 40) * 16);
            }

            System.out.println("El sueldo semanal debe ser: "+Sueldo);
        }

        // establecemos variables


    }
}
