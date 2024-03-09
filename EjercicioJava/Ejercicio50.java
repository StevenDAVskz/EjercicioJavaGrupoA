import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese el primer número:");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = leer.nextDouble();
        System.out.println("Ingrese el tercer número:");
        double num3 = leer.nextDouble();

        double suma = num1 + num2 + num3;
        double multiplicacion = num1 * num2 * num3;

        System.out.println("La suma de los tres números es: " + suma);
        System.out.println("La multiplicación de los tres números es: " + multiplicacion);

    }
}
