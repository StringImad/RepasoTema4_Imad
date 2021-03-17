/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author MSI
 */
public class Alumnado {

    private String nombre;
    private String apellido;
    private String numExpediente;
    private ArrayList<Asignatura> asignaturas;

    public Alumnado(String nombre, String apellido, String numExpediente, ArrayList<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.apellido = apellido;
        String aleatorioFinal = "";
        for (int i = 0; i < 10; i++) {
            Random rd = new Random();
            int aleatorio = rd.nextInt();
            aleatorioFinal = aleatorio + "";
        }
        this.numExpediente = aleatorioFinal;

        this.asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        hash = 37 * hash + Objects.hashCode(this.numExpediente);
        hash = 37 * hash + Objects.hashCode(this.asignaturas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnado other = (Alumnado) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.numExpediente, other.numExpediente)) {
            return false;
        }
        if (!Objects.equals(this.asignaturas, other.asignaturas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumnado{" + "nombre=" + nombre + ", apellido=" + apellido + ", numExpediente=" + numExpediente + ", asignaturas=" + asignaturas + '}';
    }

}
