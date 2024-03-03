import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario. :D");
        int a = 0, b = 0, c = 0, d = 0;
        System.out.println("Ingrese su primero valor entero: ");
        a = leer.nextInt();
        System.out.println("Ingrese su segundo valor entero: ");
        b = leer.nextInt();
        c = a;
        d = b;
        a = d;
        b = c;

        System.out.println("Su valor intercambiados es: " + "\n" + a + " y " + b);
    }

}
