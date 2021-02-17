/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20Extenso;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Aerolinea extends Aeropuerto {

    private String nombreAerolinea;
    private int numeroAviones;
    public static ArrayList<Avion> aviones = new ArrayList();

    public Aerolinea(String nombreAerolinea, int numeroAviones) {
        super();
        this.nombreAerolinea = nombreAerolinea;
        this.numeroAviones = numeroAviones;
    }

    public Aerolinea(String nombreAerolinea, int numeroAviones, String nombreAeropuerto, String ubicacionAeropuerto, int horarioApertura) {
        super(nombreAeropuerto, ubicacionAeropuerto, horarioApertura);
        this.nombreAerolinea = nombreAerolinea;
        this.numeroAviones = numeroAviones;
    }

    public static void creaAvion(Avion avioneta) {
        System.out.println("Crear nuevo avion");

        aviones.add(avioneta);
    }
    
       public static void borrarAvion(Avion avioneta) {
        System.out.println("Borrar avion creado");

        aviones.remove(avioneta);
    } 
    
     public static void mostrarAviones() {
        System.out.println("Datos de los clientes");
        aviones.forEach(System.out::println);
    }
}
