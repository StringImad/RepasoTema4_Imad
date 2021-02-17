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
public class Prueba_Libro_Ejer21 {

    public static void main(String[] args) {
        Ejer21 libro1 = new Ejer21();

        libro1.insertarLibro(new Libro("1984", 423, "George Orwell"));
        libro1.insertarLibro(new Libro("El retrato de", 917, "Dorian Gray"));

        libro1.insertarLibro(new Libro("El tejado", 114, "Madison"));

        libro1.insertarLibro(new Libro("Nauseas", 223, "el bueno"));

        libro1.imprimirLibros();

        System.out.println("la cantidad de libros actual en la biblioteca es de : " + libro1.numeroLibros() + " libros");

        libro1.eliminarLibro(2);
        System.out.println("-----------Eliminado-----------");
        libro1.imprimirLibros();
        Libro miedo = new Libro("El tejado", 114, "Madison");
        System.out.println("El libro buscado en esta posicion es: " + libro1.buscarLibroPosicion(1)
        );

        int posicionLibro = libro1.buscarLibro(miedo);
        System.out.println("El libro El tejado esta en la posicion: " + posicionLibro);

        libro1.ordenarTitulo();
        System.out.println("Ordenando libros segun el titulo del libro");
        libro1.imprimirLibros();
        System.out.println("El libro buscado es " + libro1.buscarPorTitulo(new Libro("El tejado", 114, "Madison"))
        );

    }

}
