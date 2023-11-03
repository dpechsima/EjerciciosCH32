import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioSimple {
    //Diccionario
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("amigo", "friend");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("libro", "book");
        diccionario.put("calle", "street");
        diccionario.put("coche", "car");
        diccionario.put("familia", "family");
        diccionario.put("trabajo", "work");
        diccionario.put("escuela", "school");
        diccionario.put("jugar", "play");
        diccionario.put("musica", "music");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("cielo", "sky");
        diccionario.put("amor", "love");
        diccionario.put("tiempo", "time");
        diccionario.put("dinero", "money");
        diccionario.put("papel", "paper");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra en español: ");
        String palabraEspanol = scanner.nextLine();

        if (diccionario.containsKey(palabraEspanol)) {
            String traduccion = diccionario.get(palabraEspanol); //verificacion de existencia en ele diccionario
            System.out.println("Traducción al inglés: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
    }
}