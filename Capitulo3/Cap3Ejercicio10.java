/*
 * Ejercicio 10
Realiza un conversor de Mb a Kb.

 */

package AprendeJavaConEjercicios.Capitulo3;

import java.util.Scanner;

public class Cap3Ejercicio10 {
    public static void main(String[] args) {
        // establecemos variables
        int MB = 0;
        int tasaKB = 1024;
        int KB = 0;
        
        try (// instanciamos scanner
        Scanner in = new Scanner(System.in)) {
            // pedimos datos
            System.out.println("Convertidor de MB a KB: ");
            System.out.println("Inserte los MB a convetir");

            // establecemos datos
            MB= in.nextInt();
        }
        

        //calculamos y mostramos
        KB = MB*tasaKB;
        System.out.println(MB+" MB, son: " + KB + "KB" );
    }

}
