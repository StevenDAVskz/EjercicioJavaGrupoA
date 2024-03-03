import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String intercambio;
        boolean pass = true;
        int op = 4;
        int[] array = new int[3];

        System.out.println("Bienvenido al juego");
        System.out.println("Debes acertar la respuesta correcta para ganar");
        System.out.println("**************************************************");
        System.out.println("Tendrás 4 intentos para elegir la opción correcta");
        System.out.println("Debes adivinar un número del 0 al 9, y luego adivinarlo 3 veces");
        System.out.println("********************************************************************");
        System.out.println(
                "Tendrás señales que indicarán si el número está en el rango (amarillo), si es correcto (verde) y si es incorrecto (rojo)");

        for (int i = 0; i < 3; i++) {
            int numero = (int) (Math.random() * 8) + 1;
            array[i] = numero;
        }

        while (pass) {
            int[] arrayComparativo = new int[3];
            String[] resultados = new String[3];

            for (int j = 0; j < 3; j++) {
                System.out.println("Escribe el número " + (j + 1));
                arrayComparativo[j] = leer.nextInt();
            }

            for (int i = 0; i < 3; i++) {

                if (array[i] == arrayComparativo[i]) {
                    resultados[i] = "Verde";
                } else {
                    for (int h = 0; h < 3; h++) {
                        for (int j = 0; j < 3; j++) {
                            if (array[h] == arrayComparativo[j] && resultados[j] == null) {
                                resultados[j] = "Amarillo";
                            }
                        }
                    }
                    if (resultados[i] == null) {
                        resultados[i] = "Rojo";
                    }
                }
            }

            System.out.println(
                    "Números aleatorios: 1:-- (" + array[0] + ")-- 2:-- (" + array[1] + ")  3: -- (" + array[2] + ")");
            System.out.println(
                    "------------------------------------------------------------------------------------------");
            System.out.println("El resultado es: 1: " + resultados[0] + "----- 2: " + resultados[1] + "-----  3: "
                    + resultados[2]);

            if (resultados[0].equals("Verde") && resultados[1].equals("Verde") && resultados[2].equals("Verde")) {
                System.out.println("HAS GANADO EL JUEGO, FELICIDADES");
                pass = false;
            } else {
                op--;
                System.out.println("Número de intentos restantes: " + op);
                if (op == 0) {
                    System.out.println("Lo siento, has perdido el juego, inténtalo de nuevo");
                    pass = false;
                }
            }
        }
    }
}
