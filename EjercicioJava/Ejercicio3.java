import java.util.*;

public class Ejercicio3 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hola usuario :D");
        System.out.println("***************");
        System.out.println("Ingrese su base del triángulo: ");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura de su triángulo: ");
        int altura = leer.nextInt();
        int resultado = Operación(base, altura);
        System.out.println("El área del triángulo es de: " + resultado);

    }

    public static int Operación(int base, int altura) {
        int área = (base * altura) / 2;

        return área;

    }

}
