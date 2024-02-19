import java.util.*;

public class Ejercicio4 {
    static double pi = Math.PI;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido Usuario :D");
        System.out.println(" ");
        System.out.println("Ingrese el radio de su círculo");
        double radio = leer.nextDouble();
        double resultado = calcularÁrea(radio);
        System.out.println("El área de su círculo es de: " + resultado);
    }

    public static double calcularÁrea(double radio) {
        double área = pi * (radio * radio);

        return área;
    }

}
