import java.util.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.!");
        System.out.println("Desea saber el cuadrado de 125?");
        System.out.println("1.si" + " 2.No");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                int cuadrado = 125;
                cuadrado = cuadrado * cuadrado;
                System.out.println("El cuadrado de 125 es: " + cuadrado);

                break;
            case 2:
                System.out.println("Hasta luego usuario...");

            default:
                System.out.println("Opcion inválida....");
                break;
        }

    }

}
