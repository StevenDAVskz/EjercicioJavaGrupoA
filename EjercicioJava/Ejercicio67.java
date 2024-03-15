import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int n = leer.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);

    }
}
