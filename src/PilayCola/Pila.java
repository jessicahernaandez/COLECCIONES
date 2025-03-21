/*LIFO -> Ultimo que entra, primero que sale*/
package PilayCola;

import java.util.ArrayList;


public class Pila <T> {
    
    //Objeto ArrayList
    ArrayList <T> numPila = new ArrayList <>();
    int numElementos;
    
    /*Constructor de la clase*/
    public Pila () {
        numElementos = 0;
    }
    
    /*Metodo apilar
    -> Añade al final de la lista*/
    public void apilar (T elemento) {
        numPila.add(elemento);
        numElementos++;
    }
    
    /*Metodo desapilar
    -> Saca desde el final de la lista*/
    public T desapilar () {
        T elementoDevolver = numPila.remove(numElementos - 1);
        numElementos--;
        
        return elementoDevolver;
    }
    
    /*Metodo toString*/
    @Override
    public String toString () {
        return "Pila: " + numPila;
    }
}
