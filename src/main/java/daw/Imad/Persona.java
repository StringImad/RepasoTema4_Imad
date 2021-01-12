/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.Imad;

/**
 *
 * @author MSI
 */
public class Persona {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public void llamar(Animal pet){
        pet.despertar();
    }
    
    public void alimentar (Animal pet, double cantidadGramos){
         pet.comer(cantidadGramos);
    }
    
    public void jugar (Animal pet, int cantidadMinutos){
       
            
        try {
                    pet.jugar(cantidadMinutos);

        }catch (IllegalArgumentException e){
            pet.jugar(180); 
        }
        
        
    }
    
    
}
