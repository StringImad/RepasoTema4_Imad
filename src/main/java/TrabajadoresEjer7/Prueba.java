/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajadoresEjer7;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList<Trabajador> lista = new ArrayList<>();

        // Objeto de la superclase
        Trabajador pepe = new Camarero("Jefe", "Pepe", "Lopez", "22323d");
        // Objeto de la subclase
        Camarero juan = new Camarero("Jefe Sala", "juan", "gil", "111hfk");
        Cocinero Pedro = new Cocinero("Mediterranea", "Pedro", "Almodovar", "123da");
        Cocinero Maria = new Cocinero("Italiana", "Maria", "Jimenez", "13292d");
        lista.add(pepe);
        lista.add(juan);
        lista.add(Pedro);
        lista.add(Maria);
        // Objeto superclase accediendo a sus métodos
        // Puede acceder a getters, setters, constructores y cotizar
        // No puede ver métodos del objeto subclase
//        pepe.cotizar();
//
//        // Objeto subclase accediendo a métodos de su clase
//        // Puede ver getters, setters y contructores propios
//        System.out.println(juan.getRango());
//        juan.servirMesa();
//
//        // Objeto subclase accediendo a métodos de superclase
//        System.out.println("El camarero se llama:" + juan.getNombre());
//
//        // Objeto subclase usando el método sobrescrito
//        juan.cotizar();
//        
        lista.forEach(System.out::println);

        for (Trabajador trabajo : lista) {
            trabajo.cotizar();
        }
    }

}
