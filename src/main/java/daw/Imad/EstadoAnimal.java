/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.Imad;

/**
 *
 * @author imad
 */
public enum EstadoAnimal {
    COMIENDO(1, "comiendo"),
    durmiendo(2, "durmiendo"),
    despierto(3, "despierto"),
    reposo(4,"reposando"),
    jugando(5, "jugando");
    
    private int numeroEstado;
    private String descripcion;

    private EstadoAnimal(int numeroEstado, String descripcion) {
        this.numeroEstado = numeroEstado;
        this.descripcion = descripcion;
    }

    public int getNumeroEstado() {
        return numeroEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
