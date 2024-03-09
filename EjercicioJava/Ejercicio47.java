import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese la cantidad comprada:");
        double cantidadComprada = leer.nextDouble();
        System.out.println("Ingrese el precio de la compra:");
        double precioCompra = leer.nextDouble();
        System.out.println("Ingrese el precio pagado:");
        double precioPagado = leer.nextDouble();

        double descuento = ((precioCompra - precioPagado) / precioCompra) * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + descuento + "%");

    }
}
