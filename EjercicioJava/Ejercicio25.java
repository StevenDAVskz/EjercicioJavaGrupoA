import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario.");

        System.out.print("Ingrese la cantidad de grados centígrados: ");
        double centigrados = leer.nextDouble();

        double fahrenheit = (centigrados * 9 / 5) + 32;

        System.out.println(centigrados + " grados centígrados equivalen a " + fahrenheit + " grados Fahrenheit.");

    }
}
