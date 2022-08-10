package AprendeJavaConEjercicios.Capitulo2;

public class Cap2Ejercicio8 {
    public static void main(String[] args) {
        char letra1 = 'M';
        char letra2 = 'O';
        char letra3 = 'N';
        char letra4 = 'D';
        char letra5 = 'A';

        //String Palabra = letra1+letra2+letra3+letra4+letra5;
        // la linea comentada genera error por que los tipo char estan siendo validados como enteros


        String Palabra = ""+letra1+letra2+letra3+letra4+letra5;
        // el error se soluciona concatenando una cadena vacia al principio

        System.out.println("La palabra es: "+ Palabra);




    }
}
