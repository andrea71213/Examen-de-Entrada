package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> equipoGerente1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
        Gerente gerente1 = new Gerente(1001, "Maria Ares","Marketing", 5000.00, equipoGerente1);

        List<Integer> equipoGerente2 = Arrays.asList(31,32,33,34,35,36,37,38,39,40,41,42);
        Gerente gerente2 = new Gerente(1002, "Ramon Alcala","Ventas",5000.00, equipoGerente2);

        List<Integer> equipoGerente3 = Arrays.asList(43,44,45,46,47,48,49,50);
        Gerente gerente3 = new Gerente(1003,"Enrique Calle", "Ventas", 5000.00, equipoGerente3);

        List<String> lenguajesDesarrollador1 = Arrays.asList("Java", "Python", "C++");
        Desarrollador desarrollador1 = new Desarrollador(1, "Carlos Rueda", "Desarrollo de software", 4300.00, lenguajesDesarrollador1);

        List<String> lenguajesDesarrollador2 = Arrays.asList("Java", "Python");
        Desarrollador desarrollador2 = new Desarrollador(2, "Victor Tomas", "Desarrollo", 4100.0, lenguajesDesarrollador2);

        List<String> lenguajesDesarrollador3 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador3 = new Desarrollador(3, "Ana Figueroa", "Desarrollo", 4000.0, lenguajesDesarrollador3);

        List<String> lenguajesDesarrollador4 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador4 = new Desarrollador(4, "Aitana Andrade", "Investigacion y desarrollo", 4000.0, lenguajesDesarrollador4);

        List<String> lenguajesDesarrollador5 = Arrays.asList("Java", "C#", "SQL");
        Desarrollador desarrollador5 = new Desarrollador(5, "María López", "Desarrollo de software", 4500.0, lenguajesDesarrollador5);

        List<String> lenguajesDesarrollador6 = Arrays.asList("Python", "JavaScript", "PHP");
        Desarrollador desarrollador6 = new Desarrollador(6, "Pedro Velez", "Ingeniería de software", 4200.0, lenguajesDesarrollador6);

        List<String> lenguajesDesarrollador7 = Arrays.asList("HTML", "CSS", "JavaScript", "PHP");
        Desarrollador desarrollador7 = new Desarrollador(7, "Estrella Martínez", "Desarrollo web", 4000.0, lenguajesDesarrollador7);

        List<String> lenguajesDesarrollador8 = Arrays.asList("Java", "C", "Python");
        Desarrollador desarrollador8 = new Desarrollador(8, "Carlos Gómez", "Tecnología de la información (TI)", 4000.0, lenguajesDesarrollador8);

        List<String> lenguajesDesarrollador9 = Arrays.asList("R", "Python", "SQL");
        Desarrollador desarrollador9 = new Desarrollador(9, "Nicole Sánchez", "Analítica de datos", 4200.0, lenguajesDesarrollador9);

        List<String> lenguajesDesarrollador10 = Arrays.asList("Java", "Python", "C++");
        Desarrollador desarrollador10 = new Desarrollador(10, "Daniel Rojas", "Desarrollo de software", 4000.0, lenguajesDesarrollador10);

        List<String> lenguajesDesarrollador11 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador11 = new Desarrollador(11, "Sara Cabello", "Desarrollo web", 4100.0, lenguajesDesarrollador11);

        List<String> lenguajesDesarrollador12 = Arrays.asList("Python", "Java", "C#");
        Desarrollador desarrollador12 = new Desarrollador(12, "Mario Cifuentes", "Ingeniería de software", 4200.0, lenguajesDesarrollador12);

        List<String> lenguajesDesarrollador13 = Arrays.asList("JavaScript", "Python", "SQL");
        Desarrollador desarrollador13 = new Desarrollador(13, "Catalina Casasola", "Desarrollo de software", 4300.0, lenguajesDesarrollador13);

        List<String> lenguajesDesarrollador14 = Arrays.asList("Java", "PHP", "C++");
        Desarrollador desarrollador14 = new Desarrollador(14, "Manuel Cardenas", "Tecnología de la información (TI)", 4400.0, lenguajesDesarrollador14);

        List<String> lenguajesDesarrollador15 = Arrays.asList("Python", "JavaScript", "HTML");
        Desarrollador desarrollador15 = new Desarrollador(15, "Elena Carballo", "Desarrollo web", 4500.0, lenguajesDesarrollador15);

        List<String> lenguajesDesarrollador16 = Arrays.asList("Java", "C#", "Python");
        Desarrollador desarrollador16 = new Desarrollador(16, "Alberto Martín", "Desarrollo de software", 4400.0, lenguajesDesarrollador16);

        List<String> lenguajesDesarrollador17 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador17 = new Desarrollador(17, "Paula Costa", "Desarrollo web", 4000.0, lenguajesDesarrollador17);

        List<String> lenguajesDesarrollador18 = Arrays.asList("Java", "Python", "PHP");
        Desarrollador desarrollador18 = new Desarrollador(18, "Adrián López", "Ingeniería de software", 4000.0, lenguajesDesarrollador18);

        List<String> lenguajesDesarrollador19 = Arrays.asList("C++", "Java", "JavaScript");
        Desarrollador desarrollador19 = new Desarrollador(19, "Natalia Pairazaman", "Desarrollo de software", 4100.0, lenguajesDesarrollador19);

        List<String> lenguajesDesarrollador20 = Arrays.asList("HTML", "CSS", "JavaScript");
        Desarrollador desarrollador20 = new Desarrollador(20, "David Vico", "Desarrollo web", 4000.0, lenguajesDesarrollador20);

        List<String> lenguajesDesarrollador21 = Arrays.asList("Python", "Java", "C++");
        Desarrollador desarrollador21 = new Desarrollador(21, "Marina González", "Ingeniería de software", 4300.0, lenguajesDesarrollador21);

        List<String> lenguajesDesarrollador22 = Arrays.asList("JavaScript", "Python", "SQL");
        Desarrollador desarrollador22 = new Desarrollador(22, "Javier Cornejo", "Desarrollo de software", 4800.0, lenguajesDesarrollador22);

        List<String> lenguajesDesarrollador23 = Arrays.asList("Java", "PHP", "C++");
        Desarrollador desarrollador23 = new Desarrollador(23, "Cristina Jimenez", "Tecnología de la información (TI)", 4000.0, lenguajesDesarrollador23);

        List<String> lenguajesDesarrollador24 = Arrays.asList("Python", "JavaScript", "HTML");
        Desarrollador desarrollador24 = new Desarrollador(24, "Héctor Gómez", "Desarrollo web", 4500.0, lenguajesDesarrollador24);

        List<String> lenguajesDesarrollador25 = Arrays.asList("Java", "C#", "Python");
        Desarrollador desarrollador25 = new Desarrollador(25, "Marta Ponce", "Desarrollo de software", 4400.0, lenguajesDesarrollador25);

        List<String> lenguajesDesarrollador26 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador26 = new Desarrollador(26, "Samuel Chirinos", "Desarrollo web", 4300.0, lenguajesDesarrollador26);

        List<String> lenguajesDesarrollador27 = Arrays.asList("Java", "Python", "PHP");
        Desarrollador desarrollador27 = new Desarrollador(27, "Patricia Martín", "Ingeniería de software", 4700.0, lenguajesDesarrollador27);

        List<String> lenguajesDesarrollador28 = Arrays.asList("C++", "Java", "JavaScript");
        Desarrollador desarrollador28 = new Desarrollador(28, "Ángel Aguila", "Desarrollo de software", 4700.0, lenguajesDesarrollador28);

        List<String> lenguajesDesarrollador29 = Arrays.asList("HTML", "CSS", "JavaScript");
        Desarrollador desarrollador29 = new Desarrollador(29, "Lucía Ruiz", "Desarrollo web", 4600.0, lenguajesDesarrollador29);

        List<String> lenguajesDesarrollador30 = Arrays.asList("Python", "Java", "C++");
        Desarrollador desarrollador30 = new Desarrollador(30, "Diego Ayala", "Ingeniería de software", 4500.0, lenguajesDesarrollador30);

        List<String> lenguajesDesarrollador31 = Arrays.asList("Java", "Python", "C++");
        Desarrollador desarrollador31 = new Desarrollador(31, "Isabel Rodríguez", "Desarrollo de software", 4000.0, lenguajesDesarrollador31);

        List<String> lenguajesDesarrollador32 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador32 = new Desarrollador(32, "Jorge García", "Desarrollo web", 4100.0, lenguajesDesarrollador32);

        List<String> lenguajesDesarrollador33 = Arrays.asList("Python", "Java", "C#");
        Desarrollador desarrollador33 = new Desarrollador(33, "Verónica Trigo", "Ingeniería de software", 4200.0, lenguajesDesarrollador33);

        List<String> lenguajesDesarrollador34 = Arrays.asList("JavaScript", "Python", "SQL");
        Desarrollador desarrollador34 = new Desarrollador(34, "Gabriel De la Cruz", "Desarrollo de software", 4300.0, lenguajesDesarrollador34);

        List<String> lenguajesDesarrollador35 = Arrays.asList("Java", "PHP", "C++");
        Desarrollador desarrollador35 = new Desarrollador(35, "Esther Cooa", "Tecnología de la información (TI)", 4400.0, lenguajesDesarrollador35);

        List<String> lenguajesDesarrollador36 = Arrays.asList("Python", "JavaScript", "HTML");
        Desarrollador desarrollador36 = new Desarrollador(36, "Santiago Alifonzo", "Desarrollo web", 4500.0, lenguajesDesarrollador36);

        List<String> lenguajesDesarrollador37 = Arrays.asList("Java", "C#", "Python");
        Desarrollador desarrollador37 = new Desarrollador(37, "Natalia Gómez", "Desarrollo de software", 4600.0, lenguajesDesarrollador37);

        List<String> lenguajesDesarrollador38 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador38 = new Desarrollador(38, "Francisco Serrano", "Desarrollo web", 4700.0, lenguajesDesarrollador38);

        List<String> lenguajesDesarrollador39 = Arrays.asList("Java", "Python", "PHP");
        Desarrollador desarrollador39 = new Desarrollador(39, "Clara Martín", "Ingeniería de software", 4800.0, lenguajesDesarrollador39);

        List<String> lenguajesDesarrollador40 = Arrays.asList("C++", "Java", "JavaScript");
        Desarrollador desarrollador40 = new Desarrollador(40, "Rocío Díaz", "Desarrollo de software", 4900.0, lenguajesDesarrollador40);

        List<String> lenguajesDesarrollador41 = Arrays.asList("HTML", "CSS", "JavaScript");
        Desarrollador desarrollador41 = new Desarrollador(41, "Roberto Herrare", "Desarrollo web", 5000.0, lenguajesDesarrollador41);

        List<String> lenguajesDesarrollador42 = Arrays.asList("Python", "Java", "C++");
        Desarrollador desarrollador42 = new Desarrollador(42, "Marta Alegre", "Ingeniería de software", 4100.0, lenguajesDesarrollador42);

        List<String> lenguajesDesarrollador43 = Arrays.asList("JavaScript", "Python", "SQL");
        Desarrollador desarrollador43 = new Desarrollador(43, "Diego Burneo", "Desarrollo de software", 4000.0, lenguajesDesarrollador43);

        List<String> lenguajesDesarrollador44 = Arrays.asList("Java", "PHP", "C++");
        Desarrollador desarrollador44 = new Desarrollador(44, "María López", "Tecnología de la información (TI)", 4700.0, lenguajesDesarrollador44);

        List<String> lenguajesDesarrollador45 = Arrays.asList("Python", "JavaScript", "HTML");
        Desarrollador desarrollador45 = new Desarrollador(45, "Juan Arevalo", "Desarrollo web", 4500.0, lenguajesDesarrollador45);

        List<String> lenguajesDesarrollador46 = Arrays.asList("Java", "C#", "Python");
        Desarrollador desarrollador46 = new Desarrollador(46, "Lucía Campos", "Desarrollo de software", 4400.0, lenguajesDesarrollador46);

        List<String> lenguajesDesarrollador47 = Arrays.asList("JavaScript", "HTML", "CSS");
        Desarrollador desarrollador47 = new Desarrollador(47, "Pablo Sánchez", "Desarrollo web", 4100.0, lenguajesDesarrollador47);

        List<String> lenguajesDesarrollador48 = Arrays.asList("Java", "Python", "PHP");
        Desarrollador desarrollador48 = new Desarrollador(48, "Sara Salgado", "Ingeniería de software", 4000.0, lenguajesDesarrollador48);

        List<String> lenguajesDesarrollador49 = Arrays.asList("C++", "Java", "JavaScript");
        Desarrollador desarrollador49 = new Desarrollador(49, "Javier Valencia", "Desarrollo de software", 4800.0, lenguajesDesarrollador49);

        List<String> lenguajesDesarrollador50 = Arrays.asList("HTML", "CSS", "JavaScript");
        Desarrollador desarrollador50 = new Desarrollador(50, "Ana Aranda", "Desarrollo web", 4900.0, lenguajesDesarrollador50);

        // mostrar detalles

        gerente1.mostrarDetalles();
        gerente2.mostrarDetalles();
        gerente3.mostrarDetalles();

        desarrollador1.mostrarDetalles();
        desarrollador2.mostrarDetalles();
        desarrollador3.mostrarDetalles();
        desarrollador4.mostrarDetalles();
        desarrollador5.mostrarDetalles();
        desarrollador6.mostrarDetalles();
        desarrollador7.mostrarDetalles();
        desarrollador8.mostrarDetalles();
        desarrollador9.mostrarDetalles();
        desarrollador10.mostrarDetalles();
        desarrollador11.mostrarDetalles();
        desarrollador12.mostrarDetalles();
        desarrollador13.mostrarDetalles();
        desarrollador14.mostrarDetalles();
        desarrollador15.mostrarDetalles();
        desarrollador16.mostrarDetalles();
        desarrollador17.mostrarDetalles();
        desarrollador18.mostrarDetalles();
        desarrollador19.mostrarDetalles();
        desarrollador20.mostrarDetalles();
        desarrollador21.mostrarDetalles();
        desarrollador22.mostrarDetalles();
        desarrollador23.mostrarDetalles();
        desarrollador24.mostrarDetalles();
        desarrollador25.mostrarDetalles();
        desarrollador26.mostrarDetalles();
        desarrollador27.mostrarDetalles();
        desarrollador28.mostrarDetalles();
        desarrollador29.mostrarDetalles();
        desarrollador30.mostrarDetalles();
        desarrollador31.mostrarDetalles();
        desarrollador32.mostrarDetalles();
        desarrollador33.mostrarDetalles();
        desarrollador34.mostrarDetalles();
        desarrollador35.mostrarDetalles();
        desarrollador36.mostrarDetalles();
        desarrollador37.mostrarDetalles();
        desarrollador38.mostrarDetalles();
        desarrollador39.mostrarDetalles();
        desarrollador40.mostrarDetalles();
        desarrollador41.mostrarDetalles();
        desarrollador42.mostrarDetalles();
        desarrollador43.mostrarDetalles();
        desarrollador44.mostrarDetalles();
        desarrollador45.mostrarDetalles();
        desarrollador46.mostrarDetalles();
        desarrollador47.mostrarDetalles();
        desarrollador48.mostrarDetalles();
        desarrollador49.mostrarDetalles();
        desarrollador50.mostrarDetalles();

    }}