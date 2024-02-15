import java.util.Scanner;

public class Ejer2 {
    public static void main(String args[]) {
        System.out.println("Ingrese su texto: ");
        Scanner leer = new Scanner(System.in);
        String mensaje = leer.nextLine();
        System.out.println("El texto ingresado es: " + mensaje);
    }

}
