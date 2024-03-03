import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Hola usuario.");
        Scanner leer = new Scanner(System.in);
        int n = 10;
        System.out.println("Ingrese su número: ");
        n = leer.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");

        }
    }

}
