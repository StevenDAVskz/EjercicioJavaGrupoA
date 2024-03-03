import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto (a): ");
        double a = leer.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto (b): ");
        double b = leer.nextDouble();

        double cSquared = (a * a) + (b * b);

        System.out.println("El cuadrado de la hipotenusa es: " + cSquared);

    }
}
