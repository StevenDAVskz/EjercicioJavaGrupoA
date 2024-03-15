import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int n = leer.nextInt();

        int suma = calcularSumaNaturales(n);
        System.out.println("La suma de los números naturales desde 1 hasta " + n + " es: " + suma);

    }

    public static int calcularSumaNaturales(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
