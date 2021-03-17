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
public class Microondas extends Electrodomestico implements MuestraInformacion{
    
    private int potencia;

    public Microondas(int potencia, double consumo, String modelo) {
        super(consumo, modelo);
        this.potencia = potencia;
    }

    /**
     * Get the value of potencia
     *
     * @return the value of potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * Set the value of potencia
     *
     * @param potencia new value of potencia
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void muestra() {
        System.out.println("Potencia max es: "+potencia);    }

}
