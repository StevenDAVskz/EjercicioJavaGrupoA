import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola Usuario :D");
        System.out.println("Ingrese su iva: ");
        double Usiva = leer.nextDouble();
        System.out.println("Ingrese su cantidad: ");
        double n = leer.nextDouble();
        double iva = Usiva / 100;
        double r = n * iva;
        System.out.println("Su iva es de: " + iva);
        System.out.println("El iva del producto es de: " + r);
        System.out.println("Su cantidad con el iva es de: " + (r + n));

    }

}
