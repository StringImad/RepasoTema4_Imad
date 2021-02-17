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
public class Libro {
    private String nombreAutor;
    private Integer numPaginas; 
    private String titulo;

    public Libro(String nombreAutor, Integer numPaginas, String titulo) {
        this.nombreAutor = nombreAutor;
        this.numPaginas = numPaginas;
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombreAutor=" + nombreAutor + ", numPaginas=" + numPaginas + ", titulo=" + titulo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombreAutor);
        hash = 79 * hash + Objects.hashCode(this.numPaginas);
        hash = 79 * hash + Objects.hashCode(this.titulo);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.nombreAutor, other.nombreAutor)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.numPaginas, other.numPaginas)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
