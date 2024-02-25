import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");
        System.out.println("Hasta que número califican: ");
        double maxN = leer.nextDouble();
        System.out.println("Ingrese su nota: ");
        double nota = leer.nextDouble();
        double notaF = (maxN / 2);
        if (nota < notaF) {
            System.out.println("Perdio el examen :c");

        } else if (nota == notaF) {
            System.out.println("Pasó raspado, estudie más jajsjajsajs");

        } else if (nota > notaF) {
            System.out.println("Ganó el examen, muy bien");

        }

    }

}
