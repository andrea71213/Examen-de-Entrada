package org.example;

import java.util.List;

public class Gerente extends Empleados{
    private List<Integer> equipo;

    public Gerente(int id, String nombreCompleto, String departamento, double salario, List<Integer> equipo) {
        super(id, nombreCompleto, departamento, salario);
        this.equipo = equipo;
    }
    @Override
    String evaluarDesempeno() {
        if (equipo.size() > 25) {
            return "BUENO";
        } else if (equipo.size() <= 25 && equipo.size() > 10) {
            return "REGULAR";
        } else {
            return "MALO";
        }
    }
    @Override
    double calcularBono() {
        if (evaluarDesempeno().equals("BUENO")) {
            return 0.1 * salario;
        } else if (evaluarDesempeno().equals("REGULAR")) {
            return 0.05 *salario;
        }else {return 0;}
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Equipo a cargo: " + equipo);
    }
}
