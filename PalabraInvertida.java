import java.util.Scanner;


public class PalabraInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese una palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        // Llama a la función para invertir la palabra y muestra el resultado
        String palabraInvertida = invertirPalabra(palabra);
        System.out.println("Palabra al revés: " + palabraInvertida);
    }

    public static String invertirPalabra(String palabra) {
        // Crea un StringBuilder a partir de la palabra original
        StringBuilder builder = new StringBuilder(palabra);

        // Invierte el StringBuilder
        builder.reverse();

        // Convierte el StringBuilder de nuevo a String
        String palabraInvertida = builder.toString();

        return palabraInvertida;
    }
}