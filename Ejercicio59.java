import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese un número del 1 al 10:");
        int numero = leer.nextInt();

        if (numero >= 1 && numero <= 10) {
            escribirTablaMultiplicar(numero);
        } else {
            System.out.println("Número fuera de rango.");
        }

    }

    public static void escribirTablaMultiplicar(int num) {
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
