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
public class AlumnoLista {

    private ArrayList<Alumno> alumnos;

    //constructor
    public AlumnoLista() {
        alumnos = new ArrayList<>();
    }

    public int numeroAlumnos() {
        return alumnos.size();
    }

    public void mostrarAlumnos() {
        alumnos.forEach(System.out::println);
    }

    public void anadirNuevoAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(int posicionBorrar) {
        if (posicionBorrar >= 0 && posicionBorrar < alumnos.size()) {
            alumnos.remove(posicionBorrar);
        }
    }

    public Alumno buscarAlumnosSegunPosicion(int posicion) {

        if (posicion >= 0 && posicion < alumnos.size()) {
            return alumnos.get(posicion);
        } else {
            // Devuelve null
            return null;
        }
    }

    public void ordenarPorNombre() {
        Comparator<Alumno> criterio = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Collections.sort(alumnos, criterio);
    }

    public int buscarPorNombre(Alumno alumnillo) {
        Comparator<Alumno> criterio = (c1, c2) -> c1.getName().compareTo(c2.getName());

        int posicion = Collections.binarySearch(alumnos, alumnillo, criterio);

        return posicion;
    }
}
