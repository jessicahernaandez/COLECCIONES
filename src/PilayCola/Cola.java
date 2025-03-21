/*FIFO -> Primero que entra, primero que sale*/
package PilayCola;

import java.util.ArrayList;


public class Cola <T> {
    
    //Objeto de ArrayList
    ArrayList <T> numCola = new ArrayList <>();
    int numElementos;
    
    /*Constructor de la clase*/
    public Cola (){
        numElementos = 0;
    }
    
    /*Metodo de encolar
    -> Añade un elemento al final de la lista*/
    public void encolar (T elemento) {
        numCola.add(elemento);
        numElementos++;
    } 
    
    /*Metodo de desencolar
    -> Saca elementos al principio de la lista*/
    public T desencolar () {
        T elementoDevolver = numCola.remove(0);
        numElementos--;
        
       return elementoDevolver;
    }
    
    /*Metodo toString*/
    @Override
    public String toString () {
        return "Cola: " + numCola;
    }
}
