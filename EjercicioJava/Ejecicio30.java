import java.util.Scanner;

public class Ejecicio30 {
    public static void main(String[] args) {
        System.out.println("Bienvenido usuario.");
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la distancia en kilómetros: ");
        double distanciaKm = leer.nextDouble();

        double distanciaMetros = distanciaKm * 1000;

        System.out.println("La distancia en metros es: " + distanciaMetros + " metros");

    }
}
