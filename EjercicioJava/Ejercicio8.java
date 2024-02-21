import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese sus números para dividir: ");
        double n1 = leer.nextDouble();
        System.out.println("Ingrese otro número: ");
        double n2 = leer.nextDouble();
        double res = op(n1, n2);
        System.out.println("El resto de su division es: " + res);

    }

    public static double op(double n1, double n2) {
        double r = n1 % n2;

        return r;
    }
}