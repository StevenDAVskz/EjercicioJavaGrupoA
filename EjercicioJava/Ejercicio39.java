import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese su año de nacimiento:");
        int anoNacimiento = leer.nextInt();
        System.out.println("Ingrese el año actual:");
        int anoActual = leer.nextInt();
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();

        int edad = anoActual - anoNacimiento;
        int diasDormidos = (int) (edad * 365 * 0.34);

        System.out.println(nombre + " ha dormido aproximadamente " + diasDormidos + " días de su vida.");

    }
}
