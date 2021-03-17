/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author MSI
 */
public class Asignatura {
    private String[] nombre;
    private int[] calificaciones;

    public Asignatura(String[] nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = new int[3];
    }
    
    public void rellenarAsignatura(){
       
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Arrays.hashCode(this.calificaciones);
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
        final Asignatura other = (Asignatura) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Arrays.equals(this.calificaciones, other.calificaciones)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", calificaciones=" + calificaciones + '}';
    }
    
    
}
