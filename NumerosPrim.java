import java.util.Scanner;

public class NumerosPrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; //array de tamaño 10


        for (int i = 0; i < 10; i++) { // Solicitar al usuario los 10 números
            System.out.print("Ingresa un número: ");
            numeros[i] = scanner.nextInt();  // Guardarlos en el array
        }

        //separadores de variables
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        //contadores
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        // Identificaicon de numeros y manipulacion de contadores
        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                primos[contadorPrimos] = numeros[i];
                contadorPrimos++;
            } else {
                noPrimos[contadorNoPrimos] = numeros[i];
                contadorNoPrimos++;
            }
        }

        // Mostrar los números primos
        System.out.println("Números primos:");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.println("Índice " + i + ": " + primos[i]);
        }

        // Mostrar los números no primos
        System.out.println("Números no primos:");
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.println("Índice " + i + ": " + noPrimos[i]);
        }
    }

    //métodos auxilares para identificacion de primos
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {  //primos deben ser mayores que 1
            return false;
        }
        if (numero <= 3) { //primos menores por default
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {  //residuales de pares
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) { //criba de Eratóstenes (IDENTIFICACION DE PRIMOS SUPERIORES)
                return false;
            }
        }
        return true;
    }
}