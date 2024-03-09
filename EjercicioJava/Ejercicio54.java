import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la medida en centímetros:");
        double centimetros = leer.nextDouble();

        double pulgadas = centimetros / 2.54;

        System.out.println(centimetros + " centímetros equivale a " + pulgadas + " pulgadas.");

    }
}
