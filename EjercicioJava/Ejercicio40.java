import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese los kilos de oro a convertir:");
        double kilosOro = leer.nextDouble();
        System.out.println("Ingrese el precio en pesos por onza de oro:");
        double precioOnzaOro = leer.nextDouble();

        double gramosOro = kilosOro * 1000;
        double onzasOro = gramosOro / 28.3495;
        double valorTotal = onzasOro * precioOnzaOro;

        System.out.println(kilosOro + " kilos de oro equivalen a $" + valorTotal + " pesos.");

    }
}
