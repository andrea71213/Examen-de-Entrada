package org.example;

import java.util.List;
 public class Desarrollador extends Empleados{

        private List<String> lenguajesDominados;

        public Desarrollador(int id, String nombreCompleto, String departamento, double salario, List<String> lenguajesDominados) {
            super(id, nombreCompleto, departamento, salario);
            this.lenguajesDominados = lenguajesDominados;
        }
        @Override
        String evaluarDesempeno (){

            if (lenguajesDominados.size() > 3) {
                return "BUENO";
            } else if (lenguajesDominados.size() <= 3 && lenguajesDominados.size() > 1) {
                return "REGULAR";
            } else {
                return "MALO";
            }
        }
        @Override
        double calcularBono () {
            if (evaluarDesempeno().equals("BUENO")) {
                return 0.1 * salario;
            } else if (evaluarDesempeno().equals("REGULAR")) {
                return 0.05 *salario;
            }else {return 0;}
        }
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Lenguajes dominados: " + lenguajesDominados);
        }
    }
