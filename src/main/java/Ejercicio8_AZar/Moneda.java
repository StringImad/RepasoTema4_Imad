/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8_AZar;

import java.util.Random;

/**
 *
 * @author MSI
 */
public class Moneda {
    public int lanzar(){
           Random a1 = new Random();
        int numAleatorio = a1.nextInt(2+1);
        
        return numAleatorio;
    }
}
