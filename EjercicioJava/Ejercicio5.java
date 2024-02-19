import java.util.*;

public class Ejercicio5 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido Usuario :D");
        System.out.println("Ingrese la longitud del primer diagonal del rombo: ");
        double diagonal1 = leer.nextDouble();
        System.out.println("Ingrese la longitud del segundo diagonal del rombo: ");
        double diagonal2 = leer.nextDouble();
        double resultado = Rombo(diagonal1, diagonal2);
        System.out.println("El área del rombo es: " + resultado);

    }

    public static double Rombo(double diagonal1, double diagonal2) {
        double área = (diagonal1 * diagonal2) / 2;
        return área;
    }

}
