import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese las horas trabajadas por el profesor:");
        double horasTrabajadas = leer.nextDouble();
        System.out.println("Ingrese la tarifa de pago por hora:");
        double tarifaHora = leer.nextDouble();

        double salario;
        if (horasTrabajadas > 40) {
            salario = 40 * tarifaHora + (horasTrabajadas - 40) * tarifaHora * 1.5;
        } else {
            salario = horasTrabajadas * tarifaHora;
        }

        System.out.println("El salario del profesor es: $" + salario);

    }
}
