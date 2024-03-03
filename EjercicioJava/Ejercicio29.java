import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("Hola usuario.");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero: ");
        float n1 = leer.nextFloat();
        float res = calcularCubo(n1);
        System.out.println("El resultado es: " + res);

    }

    static float calcularCubo(float n1) {
        float res = n1 * n1 * n1;
        return res;

    }

}
