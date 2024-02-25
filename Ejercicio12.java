import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");
        System.out.println("Ingrese su primer número");
        double n1 = leer.nextDouble();
        System.out.println("Ingrese su segundo número");
        double n2 = leer.nextDouble();
        System.out.println("Ingrese su tercer número");
        double n3 = leer.nextDouble();
        double pro = promedio(n1, n2, n3);
        System.out.println("El promedio de sus números es: " + pro);
        double s = n1 + n2 + n3;
        System.out.println("La suma es: " + s);
        double p1 = n1 * n1;
        double p2 = n2 * n2 * n2;
        double p3 = n3 * n3 * n3 * n3;
        System.out.println("El doble del primer número es: " + p1);
        System.out.println("El triple del segundo número es: " + p2);
        System.out.println("El cuadruple del tercer número es: " + p3);

    }

    static double promedio(double n1, double n2, double n3) {
        double pro = (n1 + n2 + n3) / 3;
        return pro;

    }

}
