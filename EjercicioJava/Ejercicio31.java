import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la base del triángulo en milímetros:");
        double baseTriangulo = leer.nextDouble();
        System.out.println("Ingrese la altura del triángulo en milímetros:");
        double alturaTriangulo = leer.nextDouble();

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        double areaTrianguloCentimetros = areaTriangulo / 100;
        double areaTrianguloMetros = areaTrianguloCentimetros / 100;

        System.out.println("El área del triángulo es:");
        System.out.println("En milímetros cuadrados: " + areaTriangulo);
        System.out.println("En centímetros cuadrados: " + areaTrianguloCentimetros);
        System.out.println("En metros cuadrados: " + areaTrianguloMetros);

    }
}
