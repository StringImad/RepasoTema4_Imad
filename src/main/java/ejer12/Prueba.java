/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int aleatorioEntero = aleatorio.nextInt(90000 - 80000 + 1) + 80000;
        int aleatorioEntero2 = aleatorio.nextInt(70000 - 60000 + 1) + 60000;
        int aleatorioEntero3 = aleatorio.nextInt(60000 - 40000 + 1) + 40000;
        int aleatorioEntero4 = aleatorio.nextInt(50000 - 10000 + 1) + 10000;

        String a1 = String.valueOf(aleatorioEntero);
        String a2 = String.valueOf(aleatorioEntero2);
        String a3 = String.valueOf(aleatorioEntero3);
        String a4 = String.valueOf(aleatorioEntero4);

        String bank = a1 + a2 + a3 + a4;
        Set<String> generados = new HashSet<>();
//        for (int i = 1; i <= 20; i++) {
        String aleatorio5 = "";
        boolean generado = false;
        while (!generado) {
            //int posible = aleatorio.nextInt();
            if (!generados.contains(bank)) {
                generados.add(bank);
                aleatorio5 = bank;
                generado = true;
            }
        }
        System.out.println(aleatorio5);
        Persona p1 = new Persona("Juan", "Lope", "as313");

//        Cuenta a1 = new CuentaAhorro(2.3, 1.3, aleatorio5, 200.0, p1);
    }

}
