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
public class EjerClaseBuscaBusca {

    private int buscaBusca[][] = {{1, 1, 8}, {1, 2, 6}, {3, 2, 9}};

    public EjerClaseBuscaBusca() {
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

//    public void imprimirMatrizComprobado1() {
//        int menor = buscaBusca[0][0];
//        int mayor = buscaBusca[0][0];
//        for (int i = 0; i < buscaBusca.length; i++) {
//
//            for (int j = 0; j < buscaBusca[0].length; j++) {
//                menor = buscaBusca[i][j];
//                mayor = buscaBusca[i][j];
//                int elementoActual = buscaBusca[0][j];
//                if (elementoActual > mayor) {
//                    mayor = elementoActual;
//                }
//                if (elementoActual < menor) {
//                    menor = elementoActual;
//                }
//                //    System.out.print(buscaBusca[i][j] + "|");
//
//            }
//        }
//        System.out.println("Mayor de la primera fila: " + mayor);
//        System.out.println("Menor de la primera fila: " + menor);
//    }
//
//    public void imprimirMatrizComprobado2() {
//        int menor = buscaBusca[0][0];
//        int mayor = buscaBusca[0][0];
//        for (int i = 0; i < buscaBusca[1].length; i++) {
//
//            for (int j = 0; j < buscaBusca[1].length; j++) {
//                menor = buscaBusca[0][0];
//                mayor = buscaBusca[0][0];
//                int elementoActual = buscaBusca[1][j];
//                if (elementoActual > mayor) {
//                    mayor = elementoActual;
//                }
//                if (elementoActual < menor) {
//                    menor = elementoActual;
//                }
//                //    System.out.print(buscaBusca[i][j] + "|");
//
//            }
//        }
//        System.out.println("Mayor de la segunda fila: " + mayor);
//        System.out.println("Menor de la segunda fila: " + menor);
//
//    }
//
//    public void imprimirMatrizComprobado3() {
//        int menor = buscaBusca[0][0];
//        int mayor = buscaBusca[0][0];
//        for (int i = 0; i < buscaBusca[2].length; i++) {
//
//            for (int j = 0; j < buscaBusca[2].length; j++) {
//                menor = buscaBusca[0][0];
//                mayor = buscaBusca[0][0];
//                int elementoActual = buscaBusca[2][j];
//                if (elementoActual > mayor) {
//                    mayor = elementoActual;
//                }
//                if (elementoActual < menor) {
//                    menor = elementoActual;
//                }
//                //    System.out.print(buscaBusca[i][j] + "|");
//
//            }
//        }
//        System.out.println("Mayor de la tercera fila: " + mayor);
//        System.out.println("Menor de la tercera fila: " + menor);
//
//    }
    public void imprimirMatrizComprobado4() {
        int menor = buscaBusca[0][0];
        int mayor = buscaBusca[0][0];

        for (int g = 0; g < buscaBusca.length; g++) {

            for (int i = 0; i < buscaBusca[g].length; i++) {

                for (int j = 0; j < buscaBusca[g].length; j++) {
                    menor = buscaBusca[0][0];
                    mayor = buscaBusca[0][0];
                    int elementoActual = buscaBusca[g][j];
                    if (elementoActual > mayor) {
                        mayor = elementoActual;
                    }
                    int elementoActualMenor = buscaBusca[g][j];
                    if (elementoActual < menor) {
                        menor = elementoActualMenor;
                    }
                    //    System.out.print(buscaBusca[i][j] + "|");

                }
            }
            System.out.println("Mayor de la 123 fila: " + mayor);

            for (int i = 0; i < buscaBusca[0].length; i++) {
//Cambio de columna
                for (int j = 0; j < buscaBusca.length; j++) {
                    int elementoActualMenor = buscaBusca[g][j];
//Cambio de fila
                    if (buscaBusca[j][i] < elementoActualMenor) { //Encontrar el menor
                        elementoActualMenor = buscaBusca[j][i];
                        System.out.println("MENOR DE LA COLUMNA: " + elementoActualMenor);

                    }
                }

                System.out.println("Menor de la 123 fila: " + menor);
            }
        }}

    

    

    

    

    

    

    public void imprimirMatrizComprobado5() {
        int menor = buscaBusca[0][0];

        for (int i = 0; i < buscaBusca.length; i++) {

            for (int j = 0; j < buscaBusca[j].length; j++) {
                menor = buscaBusca[0][0];
                int elementoActual = buscaBusca[i][j];
                int elementoActualMenor = buscaBusca[i][j];
                if (elementoActualMenor == menor) {
                    menor = elementoActualMenor;
                }
                //    System.out.print(buscaBusca[i][j] + "|");

            }
        }
        System.out.println("Menor de la fila: " + menor);

    }

    public void comprobar() {
        int menor = buscaBusca[0][0];
        int mayor = buscaBusca[0][0];
        // Recorrer la matriz y comparar
        for (int[] buscaBusca1 : buscaBusca) {
            for (int x = 0; x < buscaBusca1.length; x++) {
                int elementoActual = buscaBusca1[x];
                if (elementoActual > mayor) {
                    mayor = elementoActual;
                }
                if (elementoActual < menor) {
                    menor = elementoActual;
                }
            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

//      public void comprobarCondicion(){
//          int fila, columna;
//          
//          if(buscaBusca[fila][columna])
//          
//      }
    public static void main(String[] args) {
        EjerClaseBuscaBusca defecto = new EjerClaseBuscaBusca();

        defecto.imprimirMatriz();

        defecto.comprobar();

//        defecto.imprimirMatrizComprobado1();
//        defecto.imprimirMatrizComprobado2();
//
//        defecto.imprimirMatrizComprobado3();
        System.out.println("---------------------------");

        defecto.imprimirMatrizComprobado4();
//        defecto.imprimirMatrizComprobado5();
    }

}
