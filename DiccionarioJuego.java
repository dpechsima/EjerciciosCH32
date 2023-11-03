import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioJuego {
    public static void main(String[] args) {

        //Diccionario
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("apple", "manzana");
        diccionario.put("banana", "plátano");
        diccionario.put("car", "coche");
        diccionario.put("book", "libro");
        diccionario.put("computer", "computadora");
        diccionario.put("sun", "sol");
        diccionario.put("moon", "luna");
        diccionario.put("tree", "árbol");
        diccionario.put("flower", "flor");
        diccionario.put("water", "agua");
        diccionario.put("friend", "amigo");
        diccionario.put("family", "familia");
        diccionario.put("school", "escuela");
        diccionario.put("beach", "playa");
        diccionario.put("music", "música");
        diccionario.put("movie", "película");
        diccionario.put("money", "dinero");
        diccionario.put("food", "comida");
        diccionario.put("shirt", "camisa");
        diccionario.put("shoes", "zapatos");
        diccionario.put("watch", "reloj");
        diccionario.put("phone", "teléfono");
        diccionario.put("happiness", "felicidad");
        diccionario.put("sadness", "tristeza");
        diccionario.put("friendship", "amistad");



        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int palabrasCorrectas = 0;
        int palabrasIncorrectas = 0;

        for (int i = 0; i < 5; i++) {
            Object[] keys = diccionario.keySet().toArray(); //obtener los indices del diccionario y pasarlos a array por medio de un objetoi
            String palabraIngles = (String) keys[random.nextInt(keys.length)]; //obtener 5 llaves aleatorias para el ciccionario en forma de string
            String traduccionCorrecta = diccionario.get(palabraIngles);

            System.out.println("Palabra en inglés: " + palabraIngles);
            System.out.print("Ingrese la traducción al español: ");
            String traduccionUsuario = scanner.nextLine();

            if (traduccionCorrecta.equalsIgnoreCase(traduccionUsuario)) {
                System.out.println("¡Correcto!");
                palabrasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
                palabrasIncorrectas++;
            }
        }

        System.out.println("Palabras correctas: " + palabrasCorrectas);
        System.out.println("Palabras incorrectas: " + palabrasIncorrectas);
    }

}