/*
 * Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
 */

package AprendeJavaConEjercicios.Capitulo3;

public class Cap3Ejercicio3 {
    public static void main(String[] args) {
        
         // asignamos variables
         Double cantEuros = 0.0;
         Double cantPesetas = 0.0;
         Double tasaCambio = 0.5;
 
         //pedimos la cantidad de EUROS
         System.out.println("Este es el convertidor de pesetas a euros.");
         System.out.println("la tasa de cambio actual es "+ tasaCambio);
         System.out.println("Inserta la cantidad de pesetas a convertir a euros: ");
        // asignamos a cantidad de PESETAS las siguiente entrada
         cantPesetas= Double.parseDouble(System.console().readLine());
 
         //realizamos el calculo
        cantEuros=cantPesetas*tasaCambio;
 
         // mostramos el resultado
         System.out.println(cantPesetas+" PESETAS, son al cambio "+cantEuros+" EUROS." );
 
 
    }
}
