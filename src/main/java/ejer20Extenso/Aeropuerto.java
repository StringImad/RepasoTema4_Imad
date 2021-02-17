/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20Extenso;

import java.util.Objects;

/**
 *
 * @author MSI
 */
public class Aeropuerto {
    private String nombreAeropuerto;
    private String ubicacionAeropuerto;
    private int horarioApertura;

    public Aeropuerto() {
    }

    public Aeropuerto(String nombreAeropuerto, String ubicacionAeropuerto, int horarioApertura) {
        this.nombreAeropuerto = nombreAeropuerto;
        this.ubicacionAeropuerto = ubicacionAeropuerto;
        this.horarioApertura = horarioApertura;
    }
    
    public void verHorario(int abre, int cierra){
        System.out.println("El aeropuerto abre a las: "+abre+" y cierra a las: "+cierra);
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public String getUbicacionAeropuerto() {
        return ubicacionAeropuerto;
    }

    public void setUbicacionAeropuerto(String ubicacionAeropuerto) {
        this.ubicacionAeropuerto = ubicacionAeropuerto;
    }

    public int getHorario() {
        return horarioApertura;
    }

    public void setHorario(int horario) {
        this.horarioApertura = horario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombreAeropuerto);
        hash = 79 * hash + Objects.hashCode(this.ubicacionAeropuerto);
        hash = 79 * hash + this.horarioApertura;
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
        final Aeropuerto other = (Aeropuerto) obj;
        if (this.horarioApertura != other.horarioApertura) {
            return false;
        }
        if (!Objects.equals(this.nombreAeropuerto, other.nombreAeropuerto)) {
            return false;
        }
        if (!Objects.equals(this.ubicacionAeropuerto, other.ubicacionAeropuerto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" + "nombreAeropuerto=" + nombreAeropuerto + ", ubicacionAeropuerto=" + ubicacionAeropuerto + ", horario=" + horarioApertura + '}';
    }
    
    
    
    
    
    
    
}
