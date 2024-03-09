public class Ejercicio43 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int menor = calcularMenor(num1, num2);

        System.out.println("El número menor entre " + num1 + " y " + num2 + " es: " + menor);
    }

    public static int calcularMenor(int a, int b) {
        return Math.min(a, b);
    }
}
