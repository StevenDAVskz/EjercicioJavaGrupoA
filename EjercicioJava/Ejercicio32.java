import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la base del rectángulo en metros:");
        double baseRectangulo = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo en metros:");
        double alturaRectangulo = leer.nextDouble();

        double areaRectangulo = baseRectangulo * alturaRectangulo;
        double areaRectanguloCentimetros = areaRectangulo * 10000;
        double areaRectanguloMilimetros = areaRectanguloCentimetros * 100;

        System.out.println("El área del rectángulo es:");
        System.out.println("En metros cuadrados: " + areaRectangulo);
        System.out.println("En centímetros cuadrados: " + areaRectanguloCentimetros);
        System.out.println("En milímetros cuadrados: " + areaRectanguloMilimetros);
    }

}
