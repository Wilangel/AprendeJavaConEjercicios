/*
 * Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.

 */

package AprendeJavaConEjercicios.Capitulo3;

public class Cap3Ejercicio4 {
    public static void main(String[] args) {

        // asignamos variables

        double x;
        double y;

        // pedimos el numero x
        System.out.println("Calcula suma, resta, multiplicacion y division de 2 numeros");
        System.out.println("ingresa el numero x: ");
        // asignamos la entrada a x
        x = Double.parseDouble(System.console().readLine());

        // pedimos el numero y
        System.out.println("ingresa el numero y: ");
        // asignamos la entrada a y
        y = Double.parseDouble(System.console().readLine());

        // mostramos resultados

        //suma
        System.out.println(x + " + " + y + " = " + (x + y));
        //resta
        System.out.println(x + " - " + y + " = " + (x - y));
        //multiplicacion
        System.out.println(x + " * " + y + " = " + (x * y));
        //division
        System.out.println(x + " / " + y + " = " + (x / y));

    }
}
