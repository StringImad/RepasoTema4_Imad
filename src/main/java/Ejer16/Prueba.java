/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList<Robots> robot = new ArrayList<>();
        int numSerie = 0;
        //Crear una lista con 20 robots, creados aleatoriamente.

        for (int i = 0; i < 20; i++) {
            robot.add(new Robots(numSerie));
            numSerie++;
        }
//        for (Robots robots : robot) {
//
//            System.out.println(robots.toString());
//
//        }

        robot.forEach(System.out::println);
        //Imprimir la lista de robot ordenada, de menor a mayor porcentaje de vida. 

        Collections.sort(robot, (v1, v2) -> v1.getPorcentaje().compareTo(v2.getPorcentaje()));

        System.out.println("Por porcentaje ------------------- ");
        robot.forEach(System.out::println);

        Comparator<Robots> criterioPorcentaje = (v1, v2) -> v1.getPorcentaje().compareTo(v2.getPorcentaje());
//        Comparator<Robots> criterioColor = (v1,v2)->v1.getColor().compareTo(v2.getColor());
        //Imprimir la lista de robot ordenada, mayor a menor porcentaje de vida. 

        Collections.sort(robot, criterioPorcentaje.reversed());
        System.out.println("Por porcentaje de mayor a menor------------------- ");
        robot.forEach(System.out::println);

    }
}
