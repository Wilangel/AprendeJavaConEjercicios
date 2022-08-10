package AprendeJavaConEjercicios.Capitulo1;

public class Ejercicio6OK {
    public static void main(String[] args) {

        System.out.println();
        for(int altura = 0; altura<=5; altura++){
            //Espacios en blanco
            for(int blancos = 0; blancos<=5-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
