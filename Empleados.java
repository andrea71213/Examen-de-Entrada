package org.example;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public abstract class Empleados {

    protected int id;
    protected String nombreCompleto;
    protected String departamento;
    protected double salario;

    public void mostrarDetalles () {
        System.out.println("ID: " + id);
        System.out.println("Nombre del empleado: " + nombreCompleto);
        System.out.println("Departamento:  " + departamento);
        System.out.println("Salario: " + salario);
        System.out.println("Bono: " + calcularBono());
    }

    public double carcularBono() {
        return 0;
    }

    abstract double calcularBono();

    abstract String evaluarDesempeno();
}
