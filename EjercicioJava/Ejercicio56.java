import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la cantidad de segundos:");
        int segundos = leer.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println(segundos + " segundos equivalen a " + horas + " horas, " + minutos + " minutos y "
                + segundosRestantes + " segundos.");

    }
}
