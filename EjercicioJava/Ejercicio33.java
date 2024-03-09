import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese el número de empleados:");
        int numEmpleados = leer.nextInt();

        int personasMasDe700 = 0;
        double sumaSalarios = 0;
        int mujeres = 0;
        int varones = 0;

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Ingrese el sexo del empleado (M/F):");
            char sexo = leer.next().charAt(0);
            System.out.println("Ingrese el salario del empleado:");
            double salario = leer.nextDouble();

            sumaSalarios += salario;

            if (salario > 700) {
                personasMasDe700++;
            }

            if (sexo == 'M' || sexo == 'm') {
                varones++;
            } else if (sexo == 'F' || sexo == 'f') {
                mujeres++;
            }
        }

        double promedioSalarios = sumaSalarios / numEmpleados;
        double porcentajeMujeres = (double) mujeres / numEmpleados * 100;
        double porcentajeVarones = (double) varones / numEmpleados * 100;

        System.out.println("Cantidad de personas que ganan más de 700 al mes: " + personasMasDe700);
        System.out.println("Promedio de salarios: " + promedioSalarios);
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de varones: " + porcentajeVarones + "%");

    }

}
