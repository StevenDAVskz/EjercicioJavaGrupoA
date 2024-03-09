public class Ejercicio45 {
    public static void main(String[] args) {
        double numero = -3.5;

        int resultado = obtenerEntero(numero);
        System.out.println("El valor del número " + numero + " es: " + resultado);
    }

    public static int obtenerEntero(double num) {
        if (num < 0) {
            return -1;
        } else if (num > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
