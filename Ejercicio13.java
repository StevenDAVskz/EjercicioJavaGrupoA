import java.util.*;;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");
        System.out.println("Ingrese su primer número: ");
        String n1 = leer.nextLine();
        char ultimoC = n1.charAt(n1.length() - 1);
        System.out.println("El ultimo digito es: " + ultimoC);
        System.out.println("Ingrese su segundo número: ");
        String n2 = leer.nextLine();
        char ultimoC2 = n2.charAt(n1.length() - 1);
        System.out.println("El ultimo digito es: " + ultimoC2);
        System.out.println("Ingrese su tercer número: ");
        String n3 = leer.nextLine();
        char ultimoC3 = n3.charAt(n1.length() - 1);
        System.out.println("El ultimo digito es: " + ultimoC3);

    }

}
