import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario.");

        System.out.print("Ingrese la cantidad de pulgadas: ");
        double pulgadas = leer.nextDouble();

        double centimetros = pulgadas * 2.54;

        System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centímetros.");

    }
}
