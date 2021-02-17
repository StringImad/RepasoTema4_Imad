/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Objects;

/**
 *
 * @author MSI
 */
public class Alumno {

    private String name;
    private int numTelefono;
    private String direccion;

    public Alumno(String name, int numTelefono, String direccion) {
        this.name = name;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
    }

    public Alumno() {
    }

    public String getName() {
        return name;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.numTelefono;
        hash = 67 * hash + Objects.hashCode(this.direccion);
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
        final Alumno other = (Alumno) obj;
        if (this.numTelefono != other.numTelefono) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", numTelefono=" + numTelefono + ", direccion=" + direccion + '}';
    }

}
