/*
 * Ejercicio 6
Escribe un programa que calcule el área de un triángulo.
 */
package AprendeJavaConEjercicios.Capitulo3;

public class Cap3Ejercicio6 {
    public static void main(String[] args) {
        // asignamos variables
        Double Base;
        Double Altura;
        Double Area;

        // pedimos datos
        System.out.println("Este es el calculador de area de Triangulo");

        System.out.println("ingresa la Base de tu Triangulo: ");
        Base = Double.parseDouble(System.console().readLine());

        System.out.println("ingresa la altura de tu triangulo");
        Altura = Double.parseDouble(System.console().readLine());

        // Mostramos Resultado
        Area = (Base * Altura) / 2;

        System.out.println("El area de tu Rectangulo es " + Area + " Centimetros Cuadrados");
    }
}
