/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysMulti;

/**
 *
 * @author MSI
 */
public class Ejer12 {

  private int [][] matriz = {{1,2,3},{4,5,6}};
     //   private int[][] matriz = new int[5][4];


    public Ejer12() {
    }

    public int[][] getNotas() {
        return matriz;
    }

    public void recibeMatriz( ) {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] "
                        + "es " + matriz[i][j]);
            }
        }

    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    
    

    public static void main(String[] args) {
        
        Ejer12 defecto = new Ejer12();
        
        defecto.recibeMatriz();
        
        
    }

}
