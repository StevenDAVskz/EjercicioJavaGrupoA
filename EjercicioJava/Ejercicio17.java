import java.util.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario.!");
        System.out.println("Ingrese su primer número: ");
        double n1 = leer.nextDouble();
        System.out.println("Ingrese su segundo número: ");
        double n2 = leer.nextDouble();
        if (n1 > n2) {
            System.out.println("Este número es el mayor: " + n1);

        } else {
            System.out.println("Este número es el mayor: " + n2);
        }

    }

}
