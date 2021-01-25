/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author MSI
 */
public class PruebaEjer23 {
    
    public static void main(String[] args) {
        //Creamos el objeto
        Ejer23 defecto = new Ejer23(7);
        //hago uso del metodo getter para ver el array creado
        //System.out.println(defecto.getArrayCreado());
        
        //Imprimir la lista de números generados.
         defecto.imprimir();
         
         defecto.imprimirSuma();
         
         defecto.cantidadImpares();
         
         System.out.println(defecto.devolverMayor());
         defecto.devolverMenor();
         
         System.out.println("la lista tiene un tamañp de :"+defecto.tamanoLista());
         defecto.borrarPosicion(3);
         System.out.println(defecto.getArrayCreado());
      
         defecto.modificarPosicion(2, 21);
         System.out.println(defecto.getArrayCreado());
         
         defecto.borrarValor(21);
         System.out.println(defecto.getArrayCreado());
         
         

    }
}
