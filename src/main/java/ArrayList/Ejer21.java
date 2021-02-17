/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author MSI
 */
public class Ejer21 {

    //Desarrollar una lista de Libros
    private ArrayList<Libro> Libros;

    //constructor
    public Ejer21() {
        Libros = new ArrayList<>();
    }

    //conocer el número de libros que hay en la lista
    public int numeroLibros() {
        return Libros.size();
    }

    public void imprimirLibros() {
        Libros.forEach(System.out::println);
    }
//insertar un nuevo libro (en la posición que le corresponda)

    public void insertarLibro(Libro libro) {
        Libros.add(libro);
    }
    // eliminar el libro de una determinada posición 

    public void eliminarLibro(int posicionBorrar) {
        if (posicionBorrar >= 0 && posicionBorrar < Libros.size()) {
            Libros.remove(posicionBorrar);
        }
    }

    //y obtener el libro de una determinada posición.
    public Libro buscarLibroPosicion(int posicion) {
        // return Libros.get(posicion);

        if (posicion >= 0 && posicion < Libros.size()) {
            return Libros.get(posicion);
        } else {
            // Devuelve null
            return null;
        }
    }

//También incluirá un método para buscar de forma secuencial un libro a partir de su título (no se diferencian entre mayúsculas y minúsculas)
    public int buscarLibro(Libro libro) {
        return Libros.indexOf(libro.getTitulo());
    }



    public void ordenarTitulo() {
        Comparator<Libro> criterio = (c1, c2) -> c1.getTitulo().compareTo(c2.getTitulo());
        Collections.sort(Libros, criterio);
    }

    public int buscarPorTitulo(Libro librosillos){
        Comparator<Libro> criterio = (c1, c2) -> c1.getTitulo().compareTo(c2.getTitulo());
        
        int posicion = Collections.binarySearch(Libros, librosillos, criterio);
        
        return posicion;
    }
    
}
