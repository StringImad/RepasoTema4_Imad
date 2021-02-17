/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Ejer26PilaLista {
//La pila siempre se creará vacía.

    private ArrayList<Ejer26Pila> pilas;

    public Ejer26PilaLista(ArrayList<Ejer26Pila> pilas) {
        this.pilas = pilas;
    }

    public void mostrarElementos() {
        pilas.forEach(System.out::println);
    }
    //Apilar elemento (en inglés push), lo inserta donde proceda.

    public void anadirNuevoElemento(Ejer26Pila pila) {
        for (Ejer26Pila pila1 : pilas) {
            pilas.add(pila);

        }

    }
//Desapilar (en inglés pop), saca el elemento que toque.

    public void eliminarUltimoElemento(int posicionBorrar) {
        if (posicionBorrar >= 0 && posicionBorrar < pilas.size()) {
            pilas.remove(posicionBorrar);
        }
    }

    public void estaVacia() {
        if (pilas.isEmpty() == true) {
            System.out.println("La pila esta vacia");

        } else {
            System.out.println("La pila no esta vacia");
        }
//

    }

    public void estaLlena() {
        Ejer26Pila nuevo = new Ejer26Pila(23);
        if (pilas.size() == nuevo.getTamPila()) {
            System.out.println("Esta llena");
        } else {
            System.out.println("No esta  llenna");
        }
    }

}
