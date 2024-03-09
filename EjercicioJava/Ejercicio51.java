import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la base del rectángulo:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = leer.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

    }
}
