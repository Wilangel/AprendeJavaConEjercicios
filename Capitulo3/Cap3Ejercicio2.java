/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.

 */

package AprendeJavaConEjercicios.Capitulo3;

public class Cap3Ejercicio2 {
    public static void main(String[] args) {
        // asignamos variables
        int cantEuros = 0;
        int cantPesetas = 0;
        int tasaCambio = 100;

        //pedimos la cantidad de EUROS
        System.out.println("Este ees el convertidor de euros a pesetas.");
        System.out.println("la tasa de cambio actual es "+ tasaCambio);
        System.out.println("Inserta la cantidad de euros a convertir a pesetas: ");
       // asignamos a cantidad de EUROS las siguiente entrada
        cantEuros= Integer.parseInt(System.console().readLine());

        //realizamos el calculo
        cantPesetas=cantEuros*tasaCambio;

        // mostramos el resultado
        System.out.println(cantEuros+" EUROS, son al cambio "+cantPesetas+" pesetas." );



    }
}
