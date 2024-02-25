import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");
        System.out.println("Quiere calcular su mayoria de edad?");
        System.out.print("1.calcular " + " 2.salir: ");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese su edad: ");
                int edad = leer.nextInt();
                boolean res = calcularEdad(edad);
                if (res == true) {
                    System.out.println("Es mayor de edad. :D");

                } else {
                    System.out.println("Es menor de edad. :D");
                }
                System.out.println("Gracias por usar...");
                break;

            case 2:
                System.out.println("Hasta pronto usuario");
                break;
        }

    }

    static boolean calcularEdad(int edad) {
        boolean res;
        if (edad >= 18) {
            res = true;

        } else {
            res = false;
        }
        return res;

    }

}
