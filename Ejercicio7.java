import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola Usuario :D");
        System.out.println("Ingrese su número: ");
        double n = leer.nextDouble();
        if (n < 0) {
            System.out.println("Su número es: " + n + " es negativo");

        } else if (n > 0) {
            System.out.println("Su número es: " + n + " es positivo");
        } else {
            System.out.println("Su número es: " + n);
        }

    }
}