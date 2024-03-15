import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de x:");
        int x = leer.nextInt();

        System.out.println("Ingrese el valor de y:");
        int y = leer.nextInt();

        int resultado = calcularPotencia(x, y);
        System.out.println("El resultado de " + x + "^" + y + " es: " + resultado);

    }

    public static int calcularPotencia(int x, int y) {
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        return resultado;
    }
}
