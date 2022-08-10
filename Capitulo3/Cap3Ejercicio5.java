/*
 * Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.

 */

package AprendeJavaConEjercicios.Capitulo3;



public class Cap3Ejercicio5 {

    public static void main(String[] args) {
        // asignamos variables
        Double Largo;
        Double Ancho;
        Double Area;

        // pedimos datos
        System.out.println("Este es el calculador de area de rectangulo");

        System.out.println("ingresa el largo de tu rectangulo: ");
        Largo=Double.parseDouble(System.console().readLine());

        System.out.println("ingresa el ancho de tu rectangulo");
        Ancho=Double.parseDouble(System.console().readLine());

        // Mostramos Resultado
        Area=Largo*Ancho;

        System.out.println("El area de tu Rectangulo es "+ Area+" Centimetros Cuadrados");

    }

}
