/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysMulti;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class Ejer20 {
    // Crear un programa que mediante un menú admita reservar o cancelar asientos de un avión,
// así como mostrar qué asientos están ocupados y libres actualmente.
// El avión tendrá 25 filas de 4 asientos cada una.

    private int[][] avion = new int[25][4];
    private boolean esLibre;
    private Scanner teclado = new Scanner(System.in);

    public Ejer20() {
    }

    public int[][] getAvion() {
        return avion;
    }

    public void setAvion(int[][] avion) {
        this.avion = avion;
    }

    public void imprimirAsiento() {
        String esReservado = "";
        for (int i = 0; i < avion.length; i++) {

            for (int j = 0; j < avion[i].length; j++) {

                if (avion[i][j] == 1) {
                    esReservado = "Reservado";
                } else {
                    esReservado = "Libre";
                }
                System.out.println("fila: [" + (i + 1) + "] Asiento: [" + (j + 1) + "] "
                        + "esta " + esReservado);
            }
            System.out.println(" ");
        }
    }

    public void reservarAsiento() {
        System.out.println("Introduce la fila que quiere reservar");
        int fila = teclado.nextInt();
        System.out.println("Introduce el asiento que quiere reservar de la fila " + fila);
        int asiento = teclado.nextInt();
//        for (int i = 0; i < avion.length; i++) {
//
//            for (int j = 0; j < avion[i].length; j++) {
//                if (fila == (i + 1) && asiento == (j + 1)) {
//                    avion[i][j] = 1; //si es 1 significa que se ha reservado y 0 que no esta reservado
//                }
//            }
//        }
//        
        avion[fila -1][asiento-1]=1;
        
        
    }

    public void cancelarAsiento() {
        System.out.println("Introduce la fila que quiere cancelar");
        int fila = teclado.nextInt();
        System.out.println("Introduce el asiento que quiere cancelar de la fila " + fila);
        int asiento = teclado.nextInt();
        for (int i = 0; i < avion.length; i++) {

            for (int j = 0; j < avion[i].length; j++) {
                if (fila == (i + 1) && asiento == (j + 1)) {
                    avion[i][j] = 0; //si es 1 significa que se ha reservado y 0 que  esta cancelado
                }
            }
        }

    }

    public static void main(String[] args) {
        Ejer20 boing = new Ejer20();

        boolean repetir = true;
        do {

            JOptionPane.showMessageDialog(null, "Aerolinea IMAD \n"
                    + "Elige la opcion que desea");
            String[] botones = {"Ver asientos", "Reservar asiento", "Cancelar asiento", "Salir"};
            int ventana = JOptionPane.showOptionDialog(null,
                    "Pulsa un boton:",
                    " ",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);
            switch (ventana) {
                case 0:
                    boing.imprimirAsiento();
                    break;

                case 1:
                    boing.reservarAsiento();
                    break;

                case 2:
                    boing.cancelarAsiento();
                    break;

                case 3:
                    repetir = false;
                    break;

            }
        } while (repetir);

    }

}
