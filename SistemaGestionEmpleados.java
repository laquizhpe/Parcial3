import java.util.Scanner;

/**
 * Clase principal que contiene el método main de la aplicación de gestión de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.darAltaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darAltaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.darAltaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        empleados.mostrarEmpleados();

        scanner.close();
    }
}
