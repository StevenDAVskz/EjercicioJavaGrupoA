import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int n = leer.nextInt();

        int suma = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            suma += factorial;
        }

        System.out.println("La suma de los factoriales desde 1 hasta " + n + " es: " + suma);

    }
}
