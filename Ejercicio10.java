import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido Usuario.");
        System.out.println("Ingrese la base de su triángulo: ");
        double b = leer.nextDouble();
        System.out.println("Ingrese la altura de su triángulo: ");
        double h = leer.nextDouble();
        double área = At(b, h);
        System.out.println("El área de su triángulo es: " + área);

    }

    public static double At(double base, double altura) {
        double res = (base * altura) / 2;
        return res;
    }

}
