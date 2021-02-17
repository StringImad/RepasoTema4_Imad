/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysMulti;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class EjerBuscaBuscaIMAD {

    private int buscaBusca[][] = {{1, 1, 8}, {1, 2, 6}, {3, 2, 9}};

    public EjerBuscaBuscaIMAD() {
    }

    public int[][] getBuscaBusca() {
        return buscaBusca;
    }

    public void setBuscaBusca(int[][] buscaBusca) {
        this.buscaBusca = buscaBusca;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < buscaBusca.length; i++) {

            for (int j = 0; j < buscaBusca[i].length; j++) {

                System.out.print(buscaBusca[i][j] + "|");

            }
            System.out.println("");
        }
    }

    public void comprobar() {
        int[] menorColumna = new int[buscaBusca.length];

        for (int i = 0; i < buscaBusca[0].length; i++) {
            menorColumna[i] = buscaBusca[i][0];//valor minimo inicial para la columna i
            for (int j = 0; j < buscaBusca.length; j++) {
                if (buscaBusca[i][j] < menorColumna[i]) {
                    menorColumna[i] = buscaBusca[i][j];
                System.out.println("columna menor: " + menorColumna[i]);

                }

            }

        }

    }

    public static void main(String[] args) {
        EjerBuscaBuscaIMAD defecto = new EjerBuscaBuscaIMAD();

        defecto.imprimirMatriz();

        defecto.comprobar();

        System.out.println("----------------------------");
        int[][] matriz = {{1, 1, 8}, {1, 2, 6}, {3, 2, 9}};

        int mayor = matriz[0][0], menor = matriz[0][0]; // suponemos que ambos están en la primer posición

        // Recorremos la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                int numeroActual = matriz[x][y];
                if (numeroActual > mayor) {
                    mayor = numeroActual;
                }
                if (numeroActual < menor) {
                    menor = numeroActual;
                }
            }
        }
        System.out.printf("El mayor es %d y el menor es %d", mayor, menor);

        System.out.println("------------------------------------------------------------------------------------");
        int i;

        int filaMayor = 0;
        int colMayor = 0;
        int filaMenor = 0;
        int colMenor = 0;
        //mediante dos bucles for anidados recorremos la matriz
        //buscamos el mayor, el menor y sus posiciones
        for (i = 0; i < matriz.length; i++) {
            int j;
//para cada fila de la matriz
            for (j = 0; j < matriz[i].length; j++) { //para cada columna de la matriz
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }
        }

        //Mostrar por pantalla el mayor elemento de la matriz,el menor y las posiciones que ocupan           
        System.out.print("Elemento mayor: " + mayor);
        System.out.println(" Fila: " + filaMayor + " Columna: " + colMayor);
        System.out.print("Elemento menor: " + menor);
        System.out.println(" Fila: " + filaMenor + " Columna: " + colMenor);
    }

}
