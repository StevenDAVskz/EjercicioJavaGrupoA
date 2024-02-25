import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");
        System.out.println("Ingrese su número: ");
        int n = leer.nextInt();
        int d1 = n / 1000;
        int d2 = (n % 1000) / 100;
        int d3 = (n % 100) / 10;
        int d4 = n % 10;
        System.out.println("El primer digito es: " + d1);
        System.out.println("El segundo digito es: " + d2);
        System.out.println("El tercer digito es: " + d3);
        System.out.println("El cuarto digito es: " + d4);
        System.out.println("La suma es de " + (d1 + d2 + d3 + d4));
        System.out.println("Hasta pronto...");

    }

}
