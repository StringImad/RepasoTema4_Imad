/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MSI
 */
public class Ejer23 {

    private ArrayList<Integer> arrayCreado;

    public Ejer23(int longiLista) {
        arrayCreado = new ArrayList<>(longiLista);

        for (int i = 0; i < longiLista; i++) {
            int valorAleatorio = (int) (Math.random() * (10 - 100) + 100);

            arrayCreado.add(valorAleatorio);

        }

    }
    //Imprimir la lista de números generados.

    public void imprimir() {
        arrayCreado.forEach(System.out::println);

    }

    public void imprimirSuma() {

        int sumaPares = 0;
        for (int i = 0; i < arrayCreado.size(); i++) {
            if (arrayCreado.get(i) % 2 == 0) {
                sumaPares += arrayCreado.get(i);
            }
        }

        System.out.println("La suma es: " + sumaPares);
    }
//Imprimir la cantidad de números impares. 

    public void cantidadImpares() {
        int contador = 0;
        for (int i = 0; i < arrayCreado.size(); i++) {
            if (arrayCreado.get(i) % 2 != 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de impares son: " + contador);
    }

    // Devolver el elemento mayor.
    public int devolverMayor() {
        int elementoMayor = Integer.MIN_VALUE;

        for (int i = 0; i < arrayCreado.size(); i++) {
            if (arrayCreado.get(i) > elementoMayor) {
                elementoMayor = arrayCreado.get(i);
            }
        }

        System.out.println("El elemento mayor es: " + Collections.max(arrayCreado));
        return elementoMayor;
    }

    public void devolverMenor() {
        System.out.println("El elemento mayor es: " + Collections.min(arrayCreado));

    }

    public int tamanoLista() {
//        int contadorTamanoLista = 0;
//        for (int i = 0; i < arrayCreado.size(); i++) {
//            contadorTamanoLista++;
//        }
        return arrayCreado.size();

    }

    public void borrarPosicion(int posicion) {
        arrayCreado.remove(posicion);

    }

    //Borrar un elemento de la lista, según su valor. Si hay varios, los borra todos.
    public void borrarValor(int valor) {
        for (int i = 0; i < arrayCreado.size(); i++) {
            if (arrayCreado.get(i) == valor) {
                arrayCreado.remove(i);
            }
        }

    }

    public void modificarPosicion(int indice, int valor) {
        arrayCreado.set(indice, valor);

    }

    public ArrayList<Integer> getArrayCreado() {
        return arrayCreado;
    }

    @Override
    public String toString() {
        return "Ejer23{" + "arrayCreado=" + arrayCreado + '}';
    }

}
