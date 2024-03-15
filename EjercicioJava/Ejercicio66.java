import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int n = leer.nextInt();

        int suma = calcularSumaImpares(n);
        System.out.println("La suma de los números impares desde 1 hasta " + n + " es: " + suma);

    }

    public static int calcularSumaImpares(int n) {
        int suma = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            suma += i;
        }
        return suma;
    }
}
