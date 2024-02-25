import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido Usuario.");
        System.out.println("Ingrese la base de su rectángulo: ");
        double b = leer.nextDouble();
        System.out.println("Ingrese la altura de su rectángulo: ");
        double h = leer.nextDouble();
        double área = b * h;
        System.out.println("El área de su rectángulo es: " + área);

    }

}
