/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import daw.Imad.Animal;
import daw.Imad.EstadoAnimal;
import daw.Imad.Persona;
import daw.Imad.TipoAnimal;
import java.time.LocalDate;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal(LocalDate.now(), "jose", TipoAnimal.perro, 1233, EstadoAnimal.COMIENDO);
        System.out.println(TipoAnimal.lagarto.ordinal());
        
        Animal a3 = Animal.copiar(a2);
        Persona p1 = new Persona(21, "imad");
        Persona p2 = new Persona(15, "Juan");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println("Los objetos creados son: " + Animal.getContadorInstancias());

        p1.llamar(a3);
        p1.llamar(a2);
        p1.llamar(a1);

        p1.jugar(a2, 120);
        p1.alimentar(a1, 1000);
        p1.jugar(a1, 200);
        System.out.println("");
        System.out.println(a2.toString());
        System.out.println(a1.toString());

    }
}
