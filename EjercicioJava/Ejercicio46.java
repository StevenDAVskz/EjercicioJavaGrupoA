import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la distancia en millas:");
        double millas = leer.nextDouble();

        double metros = millas * 1852;

        System.out.println(millas + " millas equivale a " + metros + " metros.");

    }
}
