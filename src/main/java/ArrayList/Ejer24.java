/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author imad
 */
public class Ejer24 {

    private ArrayList<Integer> arrayCreado1;
    private ArrayList<Integer> arrayCreado2;
    private ArrayList<Integer> arrayCreado3;
    private ArrayList<Integer> arrayCreado4;

    public Ejer24() {

        int longiLista1 = 0;
        int longiLista2 = 0;
        longiLista1 = (int) (Math.random() * (5 - 15) + 15);
        longiLista2 = (int) (Math.random() * (10 - 20) + 20);

        arrayCreado1 = new ArrayList<>(longiLista1);

        for (int i = 0; i < longiLista1; i++) {
            int valorAleatorio1 = (int) (Math.random() * (50 - 100) + 100);

            arrayCreado1.add(valorAleatorio1);

        }

        arrayCreado2 = new ArrayList<>(longiLista2);

        for (int i = 0; i < longiLista2; i++) {
            int valorAleatorio2 = (int) (Math.random() * (50 - 100) + 100);

            arrayCreado2.add(valorAleatorio2);

        }

    }
//Imprimir las listas que han sido generadas. Usa for-each.

    public void imprimir() {
        System.out.println("----------Primera Lista------------");

        arrayCreado1.forEach(System.out::println);
        System.out.println("----------Segunda Lista------------");
        arrayCreado2.forEach(System.out::println);

    }

//    public ArrayList compararValores(ArrayList intento1) {
//        for (int i = 0; i < arrayCreado1.size(); i++) {
//
//            if (arrayCreado1.get(i) == arrayCreado2.get(i)) {
//                arrayCreado2.remove(i);
//            }
//            
//        }
//        
//        return intento1;
//    }
    
      public void borrarValor() {
        for (int i = 0; i < arrayCreado1.size(); i++) {
             int posiArray2 = arrayCreado2.get(i);
             int posiArray1 = arrayCreado1.get(i);

            if (arrayCreado1.get(i) == posiArray2) {
                arrayCreado1.remove(posiArray1);
            }
        }
         System.out.println("----------Primera Lista------------");

        arrayCreado1.forEach(System.out::println);
        System.out.println("----------Segunda Lista------------");
        arrayCreado2.forEach(System.out::println);
    }
    
      
      
      
      
      
      
      
      
    
//    //Crear una tercera lista que contenga los elementos que están en la lista 1 y NO ESTÁN en la lista 2 
//    public void anadirValoresTerceraLista() {
//        arrayCreado3 = new ArrayList<>();
//
//        // if (arrayCreado1.size() >= arrayCreado2.size()) {
//        for (int i = 0; i < arrayCreado1.size(); i++) {
//            int posiArray1 = arrayCreado1.get(i);
//            int posiArray2 = arrayCreado2.get(i);
//            //  if (arrayCreado1.get(i) != arrayCreado2.get(i)) {
//            if (posiArray1 == posiArray2) {
//                arrayCreado1.remove(posiArray1);
//            }
////}
//        }
////        for (int j = 0; j < arrayCreado2.size(); j++) {
////            if (arrayCreado1.get(j) == arrayCreado2.get(j)) {
////                arrayCreado1.remove(arrayCreado2.get(j));
////            }
////        }
//        for (int j = 0; j < arrayCreado1.size(); j++) {
//
//            //if (Objects.equals(arrayCreado3.get(i), arrayCreado2.get(i))) {
//            int arrayDl1 = arrayCreado1.get(j);
//            arrayCreado3.add(arrayDl1);
//            // }
//        }
//        //} 
//        //else {
//
//    }

    
    
    
    
    
    
    
    
    
    
    //}
    public void imprimirTerceraLista() {
        System.out.println("----------Tercera Lista--------");
//        arrayCreado3.forEach(System.out::println);
//System.out.println(arrayCread);

    }

//
//    public void anadirValoresCuartaLista() {
//        if (arrayCreado1.size() >= arrayCreado2.size()) {
//            for (int i = 0; i < arrayCreado1.size(); i++) {
//
//                if (arrayCreado1.get(i) % 2 == 0) {
//                    arrayCreado4.add(arrayCreado1.get(i));
//                } else {
//                    arrayCreado4.add(arrayCreado2.get(i));
//
//                }
//            }
//        } else {
//            for (int i = 0; i <= arrayCreado2.size(); i++) {
//
//                if (arrayCreado1.get(i) % 2 == 0) {
//                    arrayCreado4.add(arrayCreado1.get(i));
//                } else {
//                    arrayCreado4.add(arrayCreado2.get(i));
//
//                }
//            }
//        }
//    }
//
//    public void imprimirCuartaLista() {
//        arrayCreado4.forEach(System.out::println);
//
//    }
    public ArrayList<Integer> getArrayCreado1() {
        return arrayCreado1;
    }

    public ArrayList<Integer> getArrayCreado2() {
        return arrayCreado2;
    }

    public ArrayList<Integer> getArrayCreado3() {
        return arrayCreado3;
    }
}
