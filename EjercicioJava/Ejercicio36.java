import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese el tiempo de estacionamiento en horas:");
        int horas = leer.nextInt();
        System.out.println("Ingrese los minutos de estacionamiento:");
        int minutos = leer.nextInt();

        double totalPagar;
        if (minutos <= 10) {
            totalPagar = horas * 15;
        } else {
            totalPagar = (horas + 1) * 15;
        }

        System.out.println("El total a pagar por el estacionamiento es: $" + totalPagar);

    }
}
