import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su género (M para masculino, F para femenino): ");
        char genero = leer.next().charAt(0);

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();

        if (genero == 'M' || genero == 'm') {
            System.out.println("Bienvenido, " + nombre);
        } else if (genero == 'F' || genero == 'f') {
            System.out.println("Bienvenida, " + nombre);
        } else {
            System.out.println("Hola indeciso");
        }

    }
}
