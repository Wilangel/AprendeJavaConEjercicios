/*
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible?
 */

package AprendeJavaConEjercicios.Capitulo2;

public class Cap2Ejercicio7 {
    public static void main(String[] args) {

        char primeraLetra = 'A';
        char ultimaLetra = 'Z';
        String palabra = "Abecedario";


        System.out.println(primeraLetra + " es la Primera Letra, Y " + ultimaLetra + " es la ultima letra del "+palabra);


    }
}
