/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20Extenso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Avion extends Aerolinea {

    private String nombreAvion;
    private int numFilas = 25;
    private int numAsientos = 4;
    private int[][] avion = new int[numFilas][numAsientos];

    Scanner teclado = new Scanner(System.in);
    
    public Avion(String nombreAvion, int numFilas, int numAsientos, String nombreAerolinea, int numeroAviones, String nombreAeropuerto, String ubicacionAeropuerto, int horarioApertura) {
        super(nombreAerolinea, numeroAviones, nombreAeropuerto, ubicacionAeropuerto, horarioApertura);
        this.nombreAvion = nombreAvion;
        this.numFilas = numFilas;
        this.numAsientos = numAsientos;
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
        avion[fila - 1][asiento - 1] = 1;

    }
    
        public void reservarAsiento(int numFila,int numColumna) {
        avion[numFila - 1][numColumna - 1] = 1;
    }
    

    public void cancelarAsiento() {
        System.out.println("Introduce la fila que quiere cancelar");
        int fila = teclado.nextInt();
        System.out.println("Introduce el asiento que quiere cancelar de la fila " + fila);
        int asiento = teclado.nextInt();
        avion[fila - 1][asiento - 1] = 0;

    }

//
//    public void reservarAsiento() {
//        int[][] avion = new int[numFilas][numAsientos];
//        avion[numFilas - 1][numAsientos - 1] = 1;
////        System.out.println("Introduce la fila que quiere reservar");
////        int fila = teclado.nextInt();
////        System.out.println("Introduce el asiento que quiere reservar de la fila " + fila);
////        int asiento = teclado.nextInt();
////        for (int i = 0; i < avion.length; i++) {
////
////            for (int j = 0; j < avion[i].length; j++) {
////                if (fila == (i + 1) && asiento == (j + 1)) {
////                    avion[i][j] = 1; //si es 1 significa que se ha reservado y 0 que no esta reservado
////                }
////            }
////        }
////        
//
//    }
    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public static ArrayList<Avion> getAerolinea() {
        return aviones;
    }

    public static void setAerolinea(ArrayList<Avion> aerolinea) {
        Aerolinea.aviones = aerolinea;
    }

}
