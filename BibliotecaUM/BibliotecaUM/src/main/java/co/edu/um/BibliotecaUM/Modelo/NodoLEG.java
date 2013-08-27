package co.edu.um.BibliotecaUM.Modelo;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20/08/13
 * Time: 08:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodoLEG<E> {

    //atributos
    E dato;
    NodoLEG<E> siguiente;
    public LEG sig;

    //constructores
    public NodoLEG(E dato) {
        this.dato = dato;
    }

    public NodoLEG(E dato, NodoLEG<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
}


