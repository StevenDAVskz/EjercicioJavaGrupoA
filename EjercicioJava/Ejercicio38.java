import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();

        int consumoGramos = edad * 365 * 8;
        int consumoManzanas = consumoGramos / 4;

        System.out.println("La persona ha consumido " + consumoGramos + " gramos de fruta.");
        System.out.println("Esto equivale a aproximadamente " + consumoManzanas + " manzanas.");

    }
}
