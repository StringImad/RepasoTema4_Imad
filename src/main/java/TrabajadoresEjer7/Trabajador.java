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
public abstract class Trabajador {

    private String nombre;
    private String apellido1;
    private String NIF;

    public Trabajador(String nombre, String apellido1, String NIF) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.NIF = NIF;
    }

    public void cotizar() {
        System.out.println("Cotizando como Trabajador");
    }
    // Se omiten getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", NIF=" + NIF + '}';
    }

}
