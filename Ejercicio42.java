import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese los kilovoltios necesarios para la iluminación:");
        double kilovoltios = leer.nextDouble();

        double voltiosNaranja = 0.05;
        int naranjasNecesarias = (int) (kilovoltios / voltiosNaranja);
        double toneladasNaranjas = naranjasNecesarias * 0.006 / 1000;

        System.out.println("Se necesitan " + naranjasNecesarias + " naranjas para realizar el trabajo deseado.");
        System.out.println("Esto equivale a aproximadamente " + toneladasNaranjas + " toneladas.");

    }
}
