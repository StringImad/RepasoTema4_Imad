/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.Imad;

import java.time.LocalDate;

/**
 *
 * @author imad
 */
public class Animal {
    private LocalDate fecha;
    private String nombre;
    private String tipo;
    private double peso;
    private String estado;
    private static int contadorInstancias = 0;
    //constructor por defecto
    //date time formatter
    public Animal() {
        this.fecha = LocalDate.now();
        this.nombre = "turron";
        this.peso = 2200;
        this.estado = "durmiendo";
         contadorInstancias++;
    }
    
   
    public Animal(LocalDate fecha, String nombre, String tipo, double peso, String estado) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
         contadorInstancias++;
    }
    
    public void comer(double cantidadGramos){
       
        Math.abs(cantidadGramos);

        this.peso += cantidadGramos;
        
    }
    
    public void dormir(){
        this.estado = "dormido";
    }
    
    public void despertar(){
        this.estado = "despierto";
    }
    
    public void descansar(){
        this.estado = "reposo";
    }
    
    public void jugar(int cantidadminutos){
        
    }
    //getteer contador 
    public static int getContadorInstancias() {
        return contadorInstancias;
    }
    
    
    
}
