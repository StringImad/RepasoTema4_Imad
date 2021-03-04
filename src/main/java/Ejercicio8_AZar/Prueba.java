/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8_AZar;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {

        Dado defecto = new Dado(2);

        Moneda defecto2 = new Moneda();
        System.out.println("Lanzamos la moneda");
        System.out.println(defecto2.lanzar());
        System.out.println("Lanzamos el dado");

        System.out.println(defecto.lanzar());

    }
}
