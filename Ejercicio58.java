import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese las horas trabajadas:");
        double horasTrabajadas = leer.nextDouble();
        System.out.println("Ingrese el valor por hora:");
        double valorHora = leer.nextDouble();

        double salario = horasTrabajadas * valorHora;

        System.out.println("El salario es: $" + salario);

    }
}
