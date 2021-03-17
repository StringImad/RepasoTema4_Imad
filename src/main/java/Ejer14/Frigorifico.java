/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer14;

/**
 *
 * @author MSI
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion{
    private int capacidad;

    public Frigorifico(int capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    @Override
    public void muestra() {
        System.out.println("La capacidad del frigo es: "+capacidad);    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "capacidad=" + capacidad + '}';
    }
    
    
    
}
