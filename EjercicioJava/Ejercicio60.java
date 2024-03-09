import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.println("Hola usuario");
            System.out.println("Ingrese un número (0 para terminar):");
            int numero = leer.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                contador++;
            }
        }

        System.out.println("Se leyeron " + contador + " valores mayores que cero.");

    }
}
