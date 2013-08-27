package co.edu.um.BibliotecaUM.Modelo;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20/08/13
 * Time: 08:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class LEG<E>  {

    protected NodoLEG<E> primero;protected int talla;

    public LEG(){
        primero = null;
        talla=0;


    }

    public int getTalla(){
        return(this.talla);
    }

        public NodoLEG consultar (int pos){
            NodoLEG NAux = this.primero;
            if (pos < this.getTalla()){
                int cont=1;
                while (cont<pos){
                    NAux = NAux.siguiente;
                    cont++;
                }
            }
            return NAux;
        }

    public void insertar(E x)
    {

        NodoLEG<E>nuevo=new NodoLEG<E>(x);
        nuevo.siguiente = primero;
        primero = nuevo;
        this.talla++;

    }

    /*public void insertarEnFin(NodoLEG p) {
        NodoLEG nuevo = new NodoLEG(p);
        NodoLEG aux = primero;
        if (p == null) {
            primero = nuevo;
        } else {
            nuevo = new NodoLEG(p);
            nuevo.sig = p.sig;
           // p<E>.sig<E> = nuevo;

        }
    } */

    public NodoLEG<E> insertarEnFin(E x){
        NodoLEG<E>nl = new NodoLEG<E>(x);
        this.talla++;
        NodoLEG<E>aux = primero;

        if (aux == null){
            primero = nl;
        } else {
            while (aux.siguiente != null){
                aux = aux.siguiente;
                aux.siguiente = nl;
            }
        }
        return aux;
    }

    public String toString(){
        String res = "";

        for (NodoLEG<E> aux = primero; aux != null; aux=aux.siguiente){
            res += aux.dato.toString()+"\n";
        }
        return res;
    }

    public boolean eliminar(E x){
        NodoLEG<E>aux=primero,ant= null; boolean res = false;
        while (aux != null && !aux.dato.equals(x)){
            ant=aux; aux=aux.siguiente;
        }
        if (aux != null){
            res = true; this.talla--;

            if (ant == null)primero = aux.siguiente;
            else ant.siguiente = aux.siguiente;
        }
        return res;
    }



}
