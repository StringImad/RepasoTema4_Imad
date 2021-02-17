/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesEnvolventes;

/**
 *
 * @author MSI
 */
public class prueba {

    public static void main(String[] args) {

        MiIP defecto = new MiIP(12, 32, 455, 256);
        MiIP defecto3 = new MiIP(55, 123, 23, -25);
        MiIP defecto2 = new MiIP("123", "323", "10", "60");
        
        
        System.out.println(defecto.toString());
        System.out.println(defecto.toStringHex());
        System.out.println(defecto.toStringBinary());
        System.out.println("------------------------");
        System.out.println(defecto2.toString());
        System.out.println(defecto2.toStringHex());
        System.out.println(defecto2.toStringBinary());
        System.out.println("------------------------");

        System.out.println(defecto3.toString());
        System.out.println(defecto3.toStringHex());
        System.out.println(defecto3.toStringBinary());
    }

}
