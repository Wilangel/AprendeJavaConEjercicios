/*
 * Ejercicio 5
Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.

 */

package AprendeJavaConEjercicios.Capitulo2;

public class Cap2Ejercicio5 {
    public static void main(String[] args) {
        // asignamos variables
        int cantPesetas = 500;
        Double tasaCambio = 0.2;
        

        //imprimimos resultados
        System.out.println("Sus "+cantPesetas+" PESETAS, Serian al cambio "+(cantPesetas*tasaCambio)+" EUROS");
    }
}
