import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese un número para verificar si es primo:");
        int numero = leer.nextInt();

        int resultado = esPrimo(numero);

        if (resultado == 1) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

    }

    public static int esPrimo(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
