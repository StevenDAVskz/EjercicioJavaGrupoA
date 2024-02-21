import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola Usuario :D");
        System.out.println("Ingrese su número: ");
        double n1 = leer.nextDouble();
        System.out.println("Ingrese su número: ");
        double n2 = leer.nextDouble();
        System.out.println("Ingrese su número: ");
        double n3 = leer.nextDouble();
        double resultados = OpAritmetica(n1, n2, n3);
        System.out.println("El resultado de las operaciones es: " + resultados);
    }

    public static double OpAritmetica(double n1, double n2, double n3) {
        double Opres = (n1 + n2 + n3) / 3;
        return Opres;

    }
}