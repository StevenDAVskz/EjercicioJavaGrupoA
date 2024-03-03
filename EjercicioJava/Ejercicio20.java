import java.util.*;

public class Ejercicio20 {
    static Scanner leer = new Scanner(System.in);
    static int suma1 = 0;
    static int[] notas = new int[5];
    static int c = 0;

    public static void main(String[] args) {
        System.out.println("Hola usuario.!");
        calcular();
        System.out.println("Vuelva pronto usuario... :D");

    }

    static void calcular() {
        for (int i = 0; i <= 4; i++) {
            c++;
            System.out.println("Ingrese su nota " + c + ": ");
            int n = leer.nextInt();

            notas[i] = n;

        }
        c = 0;

        for (int x = 0; x <= 4; x++) {

            c++;
            suma1 = suma1 + notas[x];
            System.out.println("El doble de su nota " + c + " es: " + notas[x] * notas[x]);
        }
        int promedio = suma1 / 5;

        System.out.println("El promedio de las notas son: " + promedio);
        System.out.println("La suma de sus notas es: " + suma1);

    }

}
