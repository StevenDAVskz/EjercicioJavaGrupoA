public class Ejercicio52 {
    public static void main(String[] args) {
        int numero = 3;
        escribirTablaMultiplicar(numero);
    }

    public static void escribirTablaMultiplicar(int num) {
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
