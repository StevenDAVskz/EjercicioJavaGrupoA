import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese una cadena de texto:");
        String texto = leer.nextLine();

        char primeraLetra = obtenerPrimeraLetra(texto);

        System.out.println("La primera letra de la cadena es: " + primeraLetra);

    }

    public static char obtenerPrimeraLetra(String texto) {
        return texto.charAt(0);
    }
}
