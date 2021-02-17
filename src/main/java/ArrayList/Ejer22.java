/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Ejer22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la frase: ");
        // un programa que lea por teclado una frase.
        String fraseLeida = teclado.nextLine();
        System.out.println("La frase introducida es "+fraseLeida);
        
        //Crea array de cada palabra que este a lado de un espacio
         String[] conjuntoPalabras = fraseLeida.split(" ");
        
        for(String palabraTroceada : conjuntoPalabras) {
            System.out.println(palabraTroceada);
        }
        
        
    }
}
