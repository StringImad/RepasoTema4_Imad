/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer14;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class prueba {

    public static void main(String[] args) {
        Electrodomestico balay = new Microondas(12, 50, "doble");
        Electrodomestico bosh = new Microondas(22, 50, "Triple");

        ArrayList<Electrodomestico> aparatos = new ArrayList<>();
        aparatos.add(balay);
        aparatos.add(bosh);
        Electrodomestico bosh2 = new Frigorifico(122, 50, "Triple");
        Electrodomestico bosh3 = new Frigorifico(22, 50, "Triple");

        aparatos.add(bosh2);
        aparatos.add(bosh3);
        
        for (Electrodomestico aparato : aparatos) {
            if(aparato instanceof Electrodomestico){
            }
        }
    }
}
