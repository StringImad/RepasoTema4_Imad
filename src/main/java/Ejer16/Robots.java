/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer16;

import java.util.Random;

/**
 *
 * @author MSI
 */
public  class Robots implements Comparable<Robots>{

    private int numSerie;
    private Integer porcentaje;

    public Robots(int numSerie) {
        this.numSerie = numSerie;
        this.porcentaje = bateria(porcentaje);
    }

    public Integer bateria(Integer bateriaAlea) {
        Random rd = new Random();

        bateriaAlea = rd.nextInt(101);
        return bateriaAlea;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Robots{" + "numSerie=" + numSerie + ", porcentaje=" + porcentaje + '}';
    }

    @Override
    public int compareTo(Robots o) {
        return this.getPorcentaje().compareTo(o.getPorcentaje());
    }
    
    

}
