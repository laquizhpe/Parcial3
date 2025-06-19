import java.util.Arrays;

public class Empleados {
    private Empleado[] lista;
    private int contador;

    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.contador = 0;
    }

    public void darAltaEmpleado(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador++] = empleado;
        } else {
            System.out.println(Textos.NO_MAS_EMPLEADOS);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }

    public Empleado[] getLista() {
        return Arrays.copyOf(lista, lista.length);
    }
}