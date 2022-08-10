package AprendeJavaConEjercicios.Capitulo4;

import java.util.Scanner;

public class Cap4Ejercicio3 {
    public static void main(String[] args) {
        try (// instanciamos escanner
        Scanner entrada = new Scanner(System.in)) {
            // Establecemos Variable
            int numDia = 0;

            // pedimos dato
            System.out.println("coloca el numero de dia de la semana: ");
            numDia = entrada.nextInt();

            // establecemos condicion
            switch (numDia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;

                default:
                    System.out.println("No es un dia Correcto: ");
                    break;
            }
        }
    }
}
