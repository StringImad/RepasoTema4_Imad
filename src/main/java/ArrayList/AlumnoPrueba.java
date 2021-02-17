/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author MSI
 */
public class AlumnoPrueba {

    public static void main(String[] args) {
        AlumnoLista alumno1 = new AlumnoLista();
        alumno1.anadirNuevoAlumno(new Alumno("imad", 656172812, "Marbella"));
        alumno1.anadirNuevoAlumno(new Alumno("Juan", 856172812, "San Pedro"));
        alumno1.anadirNuevoAlumno(new Alumno("Pedro", 256172812, "Estepona"));
        alumno1.anadirNuevoAlumno(new Alumno("Jose", 156172812, "Cancelada"));

        alumno1.mostrarAlumnos();

        System.out.println("Cantidad actual de alumnos: " + alumno1.numeroAlumnos());

        alumno1.eliminarAlumno(2);
        System.out.println("-----------Eliminando---------");
        alumno1.mostrarAlumnos();

        Alumno estelar = new Alumno("Juan", 856172812, "San Pedro");
        System.out.println("El alumno estelar es: "+estelar.getName());
        
        
        alumno1.ordenarPorNombre();
        System.out.println("Ordenando libros segun el titulo del libro");
        alumno1.mostrarAlumnos();
        System.out.println("El alumno buscado por nombres es: "+alumno1.buscarPorNombre(estelar));
    }
}
