/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajadoresEjer7;

/**
 *
 * @author MSI
 */
public class Cocinero extends Trabajador {
      private String tipoCocina;

    public Cocinero(String tipoCocina, String nombre, String apellido1,
            String NIF) {
        // Llamada al constructor de la superclase
        super(nombre, apellido1, NIF);
        this.tipoCocina = tipoCocina;
    }

    // Método propio de camarero
    public void servirComida() {
        System.out.println("Objeto Cocinero: Sirviendo comida");
    }

    // Se omite geRango y setRango
//    @Override
//    // Método sobrescrito
//    public void cotizar() {
//        System.out.println("Cotizando como Camarero");
//    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    @Override
    public String toString() {
        return "Cocinero{" + "tipoCocina=" + tipoCocina + '}';
    }
    
    
}
