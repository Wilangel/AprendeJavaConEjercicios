package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio1 {
    public static void main(String[] args) {

        try (// Instanciamos Scanner
        Scanner entrada = new Scanner(System.in)) {
            
            // asignamos variable
            String dia = "";

            // pedimos dato
            System.out.println("Inserta el dia de la semana: ");
            dia = entrada.nextLine().toLowerCase();


            // realizamos condicional
            switch (dia) {
                case "lunes":
                    System.out.println("a Primera hora te toca: Matematicas");
                    break;

                case "martes":
                    System.out.println("a Primera hora te toca: Fisica");
                    break;

                case "miercoles":
                    System.out.println("a Primera hora te toca: Castellano");
                    break;

                case "jueves":
                    System.out.println("a Primera hora te toca: Ciencias");
                    break;

                case "viernes":
                    System.out.println("a Primera hora te toca: Musica");
                    break;

                default:
                    System.out.println("Este dia no damnos clase o no es un dia correcto");
                    break;
            }
        }

        


    }
}
