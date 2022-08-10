package AprendeJavaConEjercicios.Capitulo1;
/*
 * Modifica el programa anterior añadiendo colores. 
 * Puedes mostrar cada asignatura de un color diferente.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.printf("%-35s %-35s\n","\033[33m Sabado1","\033[32mSabado2" );
        System.out.printf("%-35s %-35s\n","\033[31mIngenieria Economica","\033[37mSistemas Operativos" );
        System.out.printf("%-35s %-35s\n","\033[36mConstitucion y Etica","\033[35mSeguridad informatica" );
        System.out.printf("%-35s %-35s\n","\033[34mOrganizacion de Computadores","\033[30mArquitectura de Software" );
    }
}
