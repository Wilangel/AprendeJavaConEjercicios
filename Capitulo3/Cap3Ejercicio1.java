/*
 * Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.

 */

package AprendeJavaConEjercicios.Capitulo3;

public class Cap3Ejercicio1 {
   public static void main(String[] args) {

    int x = 0;
    int y = 0;

    String Entrada="";

    //el programa pide el primer numero
    System.out.println("Escribe el numero x: ");
    Entrada = System.console().readLine();
    x=Integer.parseInt(Entrada);

    //el programa pide el segundo numero
    System.out.println("Escribe el numero y: ");
    Entrada = System.console().readLine();
    y=Integer.parseInt(Entrada);

    // el programa muestra la multiplicacion

    System.out.println(x+" * "+y+" es "+ (x*y));
   }


    
}
