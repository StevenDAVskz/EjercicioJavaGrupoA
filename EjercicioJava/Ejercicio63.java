import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int valor;

        do {
            System.out.println("Ingrese un valor entero (0 para salir):");
            valor = leer.nextInt();

            if (valor > 0) {
                suma += valor;
            }
        } while (valor != 0 && !(valor > 20 && valor <= 30));

        System.out.println("La suma de los valores mayores a 0 introducidos es: " + suma);

    }
}
