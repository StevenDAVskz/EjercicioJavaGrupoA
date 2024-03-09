import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese un número:");
        int numero = leer.nextInt();

        int suma = sumarDigitos(numero);

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

    }

    public static int sumarDigitos(int num) {
        int suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}
