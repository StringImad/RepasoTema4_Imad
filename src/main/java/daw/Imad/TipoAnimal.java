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
public enum TipoAnimal {
    gato("Mamifero", "Buen estado"), perro("Mamifero", "gastroenteritis"), lagarto("Reptil", "fiebre"), cobaya("mamifero","buen estado"), periquito ("Ave", "Estado crítico");
    
    private String descripcion;
    private String estadoSalud;

    private TipoAnimal(String descripcion, String estadoSalud) {
        this.descripcion = descripcion;
        this.estadoSalud = estadoSalud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }
    
    
    
}
