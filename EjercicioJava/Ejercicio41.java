import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();

        double longitudCabello = edad * 12 * 0.5; // Cada año, el cabello crece 0.5 cm por mes
        double metrosCabello = longitudCabello / 100;

        System.out.println("La longitud del cabello de la persona es de aproximadamente " + metrosCabello + " metros.");

    }
}
